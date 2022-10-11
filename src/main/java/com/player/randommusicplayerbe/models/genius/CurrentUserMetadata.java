
package com.player.randommusicplayerbe.models.genius;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentUserMetadata {

    @SerializedName("excluded_permissions")
    private List<String> excludedPermissions;
    @Expose
    private Interactions interactions;
    @SerializedName("iq_by_action")
    private IqByAction iqByAction;
    @Expose
    private List<String> permissions;
    @Expose
    private Relationships relationships;

    public List<String> getExcludedPermissions() {
        return excludedPermissions;
    }

    public void setExcludedPermissions(List<String> excludedPermissions) {
        this.excludedPermissions = excludedPermissions;
    }

    public Interactions getInteractions() {
        return interactions;
    }

    public void setInteractions(Interactions interactions) {
        this.interactions = interactions;
    }

    public IqByAction getIqByAction() {
        return iqByAction;
    }

    public void setIqByAction(IqByAction iqByAction) {
        this.iqByAction = iqByAction;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public Relationships getRelationships() {
        return relationships;
    }

    public void setRelationships(Relationships relationships) {
        this.relationships = relationships;
    }

}
