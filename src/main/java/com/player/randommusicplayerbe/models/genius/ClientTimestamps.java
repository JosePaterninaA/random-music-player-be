
package com.player.randommusicplayerbe.models.genius;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientTimestamps {

    @SerializedName("lyrics_updated_at")
    private Long lyricsUpdatedAt;
    @SerializedName("updated_by_human_at")
    private Long updatedByHumanAt;

    public Long getLyricsUpdatedAt() {
        return lyricsUpdatedAt;
    }

    public void setLyricsUpdatedAt(Long lyricsUpdatedAt) {
        this.lyricsUpdatedAt = lyricsUpdatedAt;
    }

    public Long getUpdatedByHumanAt() {
        return updatedByHumanAt;
    }

    public void setUpdatedByHumanAt(Long updatedByHumanAt) {
        this.updatedByHumanAt = updatedByHumanAt;
    }

}
