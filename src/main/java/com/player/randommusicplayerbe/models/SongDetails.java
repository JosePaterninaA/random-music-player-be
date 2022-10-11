package com.player.randommusicplayerbe.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SongDetails {
    private String title;
    private String artist;

    public String getSongSearchQuery(){
        return title+" by "+artist;
    }
}
