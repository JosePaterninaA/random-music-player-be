package com.player.randommusicplayerbe.services;

import com.player.randommusicplayerbe.exceptions.GeniusApiException;
import com.player.randommusicplayerbe.exceptions.YoutubeApiException;
import com.player.randommusicplayerbe.models.SongDetails;
import com.player.randommusicplayerbe.models.YouTubeItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class RandomYoutubeGeneratorService {

    @Autowired
    YoutubeService youtubeService;

    @Autowired
    GeniusService geniusService;

    @Value("${random-generator.max-songs}")
    private int MAX_SONGS;

    public List<YouTubeItem> generateRandomSong(int maxSearch) throws GeniusApiException, YoutubeApiException {

        int randomId = new Random().nextInt(MAX_SONGS);

        SongDetails song = geniusService.getSongDetailsById(randomId);



        return youtubeService.youTubeSearch(song.getSongSearchQuery(), maxSearch);
    }
}
