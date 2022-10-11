
package com.player.randommusicplayerbe.models.genius;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import lombok.Data;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

    @Expose
    private Song song;

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

}
