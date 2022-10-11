package com.player.randommusicplayerbe.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class YouTubeItem {
    private String url;
    private String title;
    private String thumbnail;
    private String description;

}
