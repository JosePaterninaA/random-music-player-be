
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
public class WriterArtist {

    @SerializedName("api_path")
    private String apiPath;
    @SerializedName("header_image_url")
    private String headerImageUrl;
    @Expose
    private Long id;
    @SerializedName("image_url")
    private String imageUrl;
    @Expose
    private Long iq;
    @SerializedName("is_meme_verified")
    private Boolean isMemeVerified;
    @SerializedName("is_verified")
    private Boolean isVerified;
    @Expose
    private String name;
    @Expose
    private String url;

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public String getHeaderImageUrl() {
        return headerImageUrl;
    }

    public void setHeaderImageUrl(String headerImageUrl) {
        this.headerImageUrl = headerImageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getIq() {
        return iq;
    }

    public void setIq(Long iq) {
        this.iq = iq;
    }

    public Boolean getIsMemeVerified() {
        return isMemeVerified;
    }

    public void setIsMemeVerified(Boolean isMemeVerified) {
        this.isMemeVerified = isMemeVerified;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
