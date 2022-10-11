
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
public class Stats {

    @SerializedName("accepted_annotations")
    private Long acceptedAnnotations;
    @Expose
    private Long contributors;
    @Expose
    private Boolean hot;
    @SerializedName("iq_earners")
    private Long iqEarners;
    @Expose
    private Long pageviews;
    @Expose
    private Long transcribers;
    @SerializedName("unreviewed_annotations")
    private Long unreviewedAnnotations;
    @SerializedName("verified_annotations")
    private Long verifiedAnnotations;

    public Long getAcceptedAnnotations() {
        return acceptedAnnotations;
    }

    public void setAcceptedAnnotations(Long acceptedAnnotations) {
        this.acceptedAnnotations = acceptedAnnotations;
    }

    public Long getContributors() {
        return contributors;
    }

    public void setContributors(Long contributors) {
        this.contributors = contributors;
    }

    public Boolean getHot() {
        return hot;
    }

    public void setHot(Boolean hot) {
        this.hot = hot;
    }

    public Long getIqEarners() {
        return iqEarners;
    }

    public void setIqEarners(Long iqEarners) {
        this.iqEarners = iqEarners;
    }

    public Long getPageviews() {
        return pageviews;
    }

    public void setPageviews(Long pageviews) {
        this.pageviews = pageviews;
    }

    public Long getTranscribers() {
        return transcribers;
    }

    public void setTranscribers(Long transcribers) {
        this.transcribers = transcribers;
    }

    public Long getUnreviewedAnnotations() {
        return unreviewedAnnotations;
    }

    public void setUnreviewedAnnotations(Long unreviewedAnnotations) {
        this.unreviewedAnnotations = unreviewedAnnotations;
    }

    public Long getVerifiedAnnotations() {
        return verifiedAnnotations;
    }

    public void setVerifiedAnnotations(Long verifiedAnnotations) {
        this.verifiedAnnotations = verifiedAnnotations;
    }

}
