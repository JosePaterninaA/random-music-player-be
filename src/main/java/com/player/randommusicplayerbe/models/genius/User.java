
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
public class User {

    @SerializedName("api_path")
    private String apiPath;
    @Expose
    private Avatar avatar;
    @SerializedName("current_user_metadata")
    private CurrentUserMetadata currentUserMetadata;
    @SerializedName("header_image_url")
    private String headerImageUrl;
    @SerializedName("human_readable_role_for_display")
    private String humanReadableRoleForDisplay;
    @Expose
    private Long id;
    @Expose
    private Long iq;
    @Expose
    private String login;
    @Expose
    private String name;
    @SerializedName("role_for_display")
    private String roleForDisplay;
    @Expose
    private String url;

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public CurrentUserMetadata getCurrentUserMetadata() {
        return currentUserMetadata;
    }

    public void setCurrentUserMetadata(CurrentUserMetadata currentUserMetadata) {
        this.currentUserMetadata = currentUserMetadata;
    }

    public String getHeaderImageUrl() {
        return headerImageUrl;
    }

    public void setHeaderImageUrl(String headerImageUrl) {
        this.headerImageUrl = headerImageUrl;
    }

    public String getHumanReadableRoleForDisplay() {
        return humanReadableRoleForDisplay;
    }

    public void setHumanReadableRoleForDisplay(String humanReadableRoleForDisplay) {
        this.humanReadableRoleForDisplay = humanReadableRoleForDisplay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIq() {
        return iq;
    }

    public void setIq(Long iq) {
        this.iq = iq;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleForDisplay() {
        return roleForDisplay;
    }

    public void setRoleForDisplay(String roleForDisplay) {
        this.roleForDisplay = roleForDisplay;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
