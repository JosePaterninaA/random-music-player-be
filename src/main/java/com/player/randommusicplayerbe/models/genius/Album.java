
package com.player.randommusicplayerbe.models.genius;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Album {

    @SerializedName("api_path")
    private String apiPath;
    @Expose
    private Artist artist;
    @SerializedName("cover_art_url")
    private String coverArtUrl;
    @SerializedName("full_title")
    private String fullTitle;
    @Expose
    private Long id;
    @Expose
    private String name;
    @Expose
    private String url;

}
