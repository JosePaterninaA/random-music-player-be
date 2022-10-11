package com.player.randommusicplayerbe.services;

import com.player.randommusicplayerbe.exceptions.GeniusApiException;
import com.player.randommusicplayerbe.models.SongDetails;
import com.player.randommusicplayerbe.models.genius.GeniusResponse;
import com.player.randommusicplayerbe.services.deserializer.GeniusDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Component
public class GeniusService {
    @Autowired
    WebClient webClient;
    @Autowired
    GeniusDeserializer geniusDeserializer;

    @Value("${genius.accessToken}")
    private String GENIUS_ACCESS_TOKEN;

    @Value("${genius.query-url}")
    private String GENIUS_QUERY_URL;

    @Value("${genius.song-url}")
    private String GENIUS_SONG_URL;


    public SongDetails getSongDetailsById(int id) throws GeniusApiException {
        return geniusDeserializer.getSongDetailsFromJSONResponse(getSongById(id).blockFirst());
    }

    private Flux<String> getSongById(int id) {
        return webClient.get()
                .uri(geniusSongQueryUri(id))
                .retrieve()
                .bodyToFlux(String.class)
                .doOnError(throwable -> System.out.println(("Failed for some reason")));
    }

    private String geniusSongQueryUri(int songId){
        return GENIUS_SONG_URL + songId + "?access_token=" + GENIUS_ACCESS_TOKEN;
    }
}
