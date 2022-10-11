
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
public class Author {

    @Expose
    private Double attribution;
    @SerializedName("pinned_role")
    private Object pinnedRole;
    @Expose
    private User user;

    public Double getAttribution() {
        return attribution;
    }

    public void setAttribution(Double attribution) {
        this.attribution = attribution;
    }

    public Object getPinnedRole() {
        return pinnedRole;
    }

    public void setPinnedRole(Object pinnedRole) {
        this.pinnedRole = pinnedRole;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
