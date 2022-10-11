
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
public class Annotation {

    @SerializedName("api_path")
    private String apiPath;
    @Expose
    private List<Author> authors;
    @Expose
    private Body body;
    @SerializedName("comment_count")
    private Long commentCount;
    @Expose
    private Boolean community;
    @SerializedName("cosigned_by")
    private List<Object> cosignedBy;
    @SerializedName("current_user_metadata")
    private CurrentUserMetadata currentUserMetadata;
    @SerializedName("custom_preview")
    private Object customPreview;
    @SerializedName("has_voters")
    private Boolean hasVoters;
    @Expose
    private Long id;
    @Expose
    private Boolean pinned;
    @SerializedName("rejection_comment")
    private Object rejectionComment;
    @SerializedName("share_url")
    private String shareUrl;
    @Expose
    private Object source;
    @Expose
    private String state;
    @Expose
    private String url;
    @Expose
    private Boolean verified;
    @SerializedName("verified_by")
    private Object verifiedBy;
    @SerializedName("votes_total")
    private Long votesTotal;
}
