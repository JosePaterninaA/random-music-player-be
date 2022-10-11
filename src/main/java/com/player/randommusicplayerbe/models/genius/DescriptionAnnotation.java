
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
public class DescriptionAnnotation {

    @Expose
    private String _type;
    @Expose
    private Annotatable annotatable;
    @Expose
    private List<Annotation> annotations;
    @SerializedName("annotator_id")
    private Long annotatorId;
    @SerializedName("annotator_login")
    private String annotatorLogin;
    @SerializedName("api_path")
    private String apiPath;
    @Expose
    private String classification;
    @Expose
    private String fragment;
    @Expose
    private Long id;
    @SerializedName("is_description")
    private Boolean isDescription;
    @Expose
    private String path;
    @Expose
    private Range range;
    @SerializedName("song_id")
    private Long songId;
    @Expose
    private String url;
    @SerializedName("verified_annotator_ids")
    private List<Object> verifiedAnnotatorIds;

    public String get_type() {
        return _type;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    public Annotatable getAnnotatable() {
        return annotatable;
    }

    public void setAnnotatable(Annotatable annotatable) {
        this.annotatable = annotatable;
    }

    public List<Annotation> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    public Long getAnnotatorId() {
        return annotatorId;
    }

    public void setAnnotatorId(Long annotatorId) {
        this.annotatorId = annotatorId;
    }

    public String getAnnotatorLogin() {
        return annotatorLogin;
    }

    public void setAnnotatorLogin(String annotatorLogin) {
        this.annotatorLogin = annotatorLogin;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsDescription() {
        return isDescription;
    }

    public void setIsDescription(Boolean isDescription) {
        this.isDescription = isDescription;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    public Long getSongId() {
        return songId;
    }

    public void setSongId(Long songId) {
        this.songId = songId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Object> getVerifiedAnnotatorIds() {
        return verifiedAnnotatorIds;
    }

    public void setVerifiedAnnotatorIds(List<Object> verifiedAnnotatorIds) {
        this.verifiedAnnotatorIds = verifiedAnnotatorIds;
    }

}
