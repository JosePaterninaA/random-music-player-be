
package com.player.randommusicplayerbe.models.genius;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import lombok.Data;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Interactions {

    @Expose
    private Boolean cosign;
    @Expose
    private Boolean following;
    @Expose
    private Boolean pyong;
    @Expose
    private Object vote;

    public Boolean getCosign() {
        return cosign;
    }

    public void setCosign(Boolean cosign) {
        this.cosign = cosign;
    }

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public Boolean getPyong() {
        return pyong;
    }

    public void setPyong(Boolean pyong) {
        this.pyong = pyong;
    }

    public Object getVote() {
        return vote;
    }

    public void setVote(Object vote) {
        this.vote = vote;
    }

}
