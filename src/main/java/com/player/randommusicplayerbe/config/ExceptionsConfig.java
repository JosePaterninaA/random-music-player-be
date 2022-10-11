package com.player.randommusicplayerbe.config;

import com.player.randommusicplayerbe.exceptions.GeniusApiException;
import com.player.randommusicplayerbe.exceptions.QueryException;
import com.player.randommusicplayerbe.exceptions.YoutubeApiException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;


@ControllerAdvice(annotations = RestController.class)
public class ExceptionsConfig {

    @ExceptionHandler({QueryException.class})
    public ResponseEntity<?> queryError(Exception e) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(e.getMessage());
    }

    @ExceptionHandler({YoutubeApiException.class, GeniusApiException.class})
    public ResponseEntity<?> externalApipiError(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
}
