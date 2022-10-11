
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
public class Annotatable {

    @SerializedName("api_path")
    private String apiPath;
    @SerializedName("client_timestamps")
    private ClientTimestamps clientTimestamps;
    @Expose
    private String context;
    @Expose
    private Long id;
    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("link_title")
    private String linkTitle;
    @Expose
    private String title;
    @Expose
    private String type;
    @Expose
    private String url;
}
