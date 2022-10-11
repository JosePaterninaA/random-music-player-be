
package com.player.randommusicplayerbe.models.genius;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

    @SerializedName("api_path")
    private String apiPath;

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

}
