package com.player.randommusicplayerbe.services;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.SearchListResponse;
import com.google.api.services.youtube.model.SearchResult;
import com.player.randommusicplayerbe.exceptions.YoutubeApiException;
import com.player.randommusicplayerbe.exceptions.QueryException;
import com.player.randommusicplayerbe.models.YouTubeItem;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Component
public class YoutubeService {
    public static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    public static final JsonFactory JSON_FACTORY     = new JacksonFactory();

    private static final String PROPERTIES_FILENAME     = "youtube";

    private static final String GOOGLE_YOUTUBE_URL      = "https://www.youtube.com/watch?v=";
    private static final String YOUTUBE_SEARCH_TYPE     = "video";
    private static final String YOUTUBE_SEARCH_FIELDS   = "items(id/kind,id/videoId,snippet/title,snippet/description,snippet/thumbnails/default/url)";
    private static final String YOUTUBE_API_APPLICATION = "google-youtube-api-search";
    private static final String YOUTUBE_APIKEY_ENV      = "YOUTUBE_APIKEY";

    private static final long NUMBER_OF_VIDEOS_RETURNED  = 25;

    private static YouTube youtube;


    static {

        // This object is used to make YouTube Data API requests. The last
        // argument is required, but since we don't need anything
        // initialized when the HttpRequest is initialized, we override
        // the interface and provide a no-op function.

        youtube = new YouTube.Builder(HTTP_TRANSPORT, JSON_FACTORY,
                new HttpRequestInitializer() {
                    public void initialize(HttpRequest request) throws IOException {
                        // intentionally left empty
                    }
                }).setApplicationName(YOUTUBE_API_APPLICATION).build();
    }

    @Value("${youtube.apikey}")
    private String YOUTUBE_API_KEY;

    @Value("${youtube.fields}")
    private String YOUTUBE_FIELDS;

    @Value("${youtube.maxvid}")
    private String YOUTUBE_MAX_VIDS_STRING;

    /**
     * Makes YouTube search into video library with given keywords.
     *
     */
    public List<YouTubeItem> youTubeSearch(String searchQuery, int maxSearch) throws YoutubeApiException {

        try {

            if (youtube != null) {

                // Define the API request for retrieving search results.
                YouTube.Search.List search = youtube.search().list("id,snippet");

                search.setKey(YOUTUBE_API_KEY);
                search.setQ(searchQuery);
                search.setType(YOUTUBE_SEARCH_TYPE);
                search.setFields(YOUTUBE_FIELDS);

                if (maxSearch < 1) {
                    search.setMaxResults(Long.valueOf(YOUTUBE_MAX_VIDS_STRING));
                } else {
                    search.setMaxResults((long) maxSearch);
                }

                // Call the API and print results.
                SearchListResponse searchResponse = search.execute();
                List<SearchResult> searchResultList = searchResponse.getItems();

                if (searchResultList != null && !searchResultList.isEmpty()) {

                    return searchResultList.stream().map(r -> new YouTubeItem(
                            GOOGLE_YOUTUBE_URL + r.getId().getVideoId(),
                            r.getSnippet().getTitle(),
                            r.getSnippet().getThumbnails().getDefault().getUrl(),
                            r.getSnippet().getDescription())).toList();
                } else {
                    throw new QueryException("No search results got from YouTube API");
                }

            } else {
                throw new YoutubeApiException("YouTube API not initialized correctly!");
            }

        } catch (GoogleJsonResponseException e) {
            throw new YoutubeApiException("There was a service error: " + e.getDetails().getCode() + " : "
                    + e.getDetails().getMessage());
        } catch (IOException e) {
            throw new YoutubeApiException("There was an IO error: " + e.getCause() + " : " + e.getMessage());
        } catch (Throwable t) {
            throw new YoutubeApiException("Severe errors!");
        }
    }
}
