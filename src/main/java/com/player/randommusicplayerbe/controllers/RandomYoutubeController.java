package com.player.randommusicplayerbe.controllers;

import com.player.randommusicplayerbe.exceptions.GeniusApiException;
import com.player.randommusicplayerbe.exceptions.YoutubeApiException;
import com.player.randommusicplayerbe.models.YouTubeItem;
import com.player.randommusicplayerbe.services.RandomYoutubeGeneratorService;
import com.player.randommusicplayerbe.services.YoutubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class RandomYoutubeController {
    @Autowired
    private YoutubeService youtubeService;

    @Autowired
    private RandomYoutubeGeneratorService randomYoutubeGeneratorService;


    @GetMapping("/api/v1/random-music-player/youtube")
    public ResponseEntity<?> getYoutubeResults(@RequestParam String searchQuery,@RequestParam int maxSearch) throws YoutubeApiException {
        return ResponseEntity.ok(youtubeService.youTubeSearch(searchQuery, maxSearch));
    }

    @GetMapping("/api/v1/random-music-player/generate")
    public ResponseEntity<List<YouTubeItem>> getRandomSong(@RequestParam int maxSearch) throws YoutubeApiException, GeniusApiException {
        return ResponseEntity.ok(randomYoutubeGeneratorService.generateRandomSong(maxSearch));
    }
}
