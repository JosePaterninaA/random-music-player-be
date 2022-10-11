
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
public class Song {

    @Expose
    private Album album;
    @SerializedName("annotation_count")
    private Long annotationCount;
    @SerializedName("api_path")
    private String apiPath;
    @SerializedName("apple_music_id")
    private Object appleMusicId;
    @SerializedName("apple_music_player_url")
    private String appleMusicPlayerUrl;
    @SerializedName("artist_names")
    private String artistNames;
    @SerializedName("current_user_metadata")
    private CurrentUserMetadata currentUserMetadata;
    @SerializedName("custom_performances")
    private List<CustomPerformance> customPerformances;
    @Expose
    private Description description;
    @SerializedName("description_annotation")
    private DescriptionAnnotation descriptionAnnotation;
    @SerializedName("embed_content")
    private String embedContent;
    @SerializedName("featured_artists")
    private List<Object> featuredArtists;
    @SerializedName("featured_video")
    private Boolean featuredVideo;
    @SerializedName("full_title")
    private String fullTitle;
    @SerializedName("header_image_thumbnail_url")
    private String headerImageThumbnailUrl;
    @SerializedName("header_image_url")
    private String headerImageUrl;
    @Expose
    private Long id;
    @Expose
    private String language;
    @SerializedName("lyrics_marked_complete_by")
    private Object lyricsMarkedCompleteBy;
    @SerializedName("lyrics_marked_staff_approved_by")
    private Object lyricsMarkedStaffApprovedBy;
    @SerializedName("lyrics_owner_id")
    private Long lyricsOwnerId;
    @SerializedName("lyrics_placeholder_reason")
    private Object lyricsPlaceholderReason;
    @SerializedName("lyrics_state")
    private String lyricsState;
    @Expose
    private List<Medium> media;
    @Expose
    private String path;
    @SerializedName("primary_artist")
    private PrimaryArtist primaryArtist;
    @SerializedName("producer_artists")
    private List<ProducerArtist> producerArtists;
    @SerializedName("pyongs_count")
    private Long pyongsCount;
    @SerializedName("recording_location")
    private String recordingLocation;
    @SerializedName("relationships_index_url")
    private String relationshipsIndexUrl;
    @SerializedName("release_date")
    private String releaseDate;
    @SerializedName("release_date_components")
    private ReleaseDateComponents releaseDateComponents;
    @SerializedName("release_date_for_display")
    private String releaseDateForDisplay;
    @SerializedName("release_date_with_abbreviated_month_for_display")
    private String releaseDateWithAbbreviatedMonthForDisplay;
    @SerializedName("song_art_image_thumbnail_url")
    private String songArtImageThumbnailUrl;
    @SerializedName("song_art_image_url")
    private String songArtImageUrl;
    @SerializedName("song_relationships")
    private List<SongRelationship> songRelationships;
    @Expose
    private Stats stats;
    @Expose
    private String title;
    @SerializedName("title_with_featured")
    private String titleWithFeatured;
    @Expose
    private String url;
    @SerializedName("verified_annotations_by")
    private List<VerifiedAnnotationsBy> verifiedAnnotationsBy;
    @SerializedName("verified_contributors")
    private List<VerifiedContributor> verifiedContributors;
    @SerializedName("verified_lyrics_by")
    private List<Object> verifiedLyricsBy;
    @SerializedName("writer_artists")
    private List<WriterArtist> writerArtists;

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Long getAnnotationCount() {
        return annotationCount;
    }

    public void setAnnotationCount(Long annotationCount) {
        this.annotationCount = annotationCount;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public Object getAppleMusicId() {
        return appleMusicId;
    }

    public void setAppleMusicId(Object appleMusicId) {
        this.appleMusicId = appleMusicId;
    }

    public String getAppleMusicPlayerUrl() {
        return appleMusicPlayerUrl;
    }

    public void setAppleMusicPlayerUrl(String appleMusicPlayerUrl) {
        this.appleMusicPlayerUrl = appleMusicPlayerUrl;
    }

    public String getArtistNames() {
        return artistNames;
    }

    public void setArtistNames(String artistNames) {
        this.artistNames = artistNames;
    }

    public CurrentUserMetadata getCurrentUserMetadata() {
        return currentUserMetadata;
    }

    public void setCurrentUserMetadata(CurrentUserMetadata currentUserMetadata) {
        this.currentUserMetadata = currentUserMetadata;
    }

    public List<CustomPerformance> getCustomPerformances() {
        return customPerformances;
    }

    public void setCustomPerformances(List<CustomPerformance> customPerformances) {
        this.customPerformances = customPerformances;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public DescriptionAnnotation getDescriptionAnnotation() {
        return descriptionAnnotation;
    }

    public void setDescriptionAnnotation(DescriptionAnnotation descriptionAnnotation) {
        this.descriptionAnnotation = descriptionAnnotation;
    }

    public String getEmbedContent() {
        return embedContent;
    }

    public void setEmbedContent(String embedContent) {
        this.embedContent = embedContent;
    }

    public List<Object> getFeaturedArtists() {
        return featuredArtists;
    }

    public void setFeaturedArtists(List<Object> featuredArtists) {
        this.featuredArtists = featuredArtists;
    }

    public Boolean getFeaturedVideo() {
        return featuredVideo;
    }

    public void setFeaturedVideo(Boolean featuredVideo) {
        this.featuredVideo = featuredVideo;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public String getHeaderImageThumbnailUrl() {
        return headerImageThumbnailUrl;
    }

    public void setHeaderImageThumbnailUrl(String headerImageThumbnailUrl) {
        this.headerImageThumbnailUrl = headerImageThumbnailUrl;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Object getLyricsMarkedCompleteBy() {
        return lyricsMarkedCompleteBy;
    }

    public void setLyricsMarkedCompleteBy(Object lyricsMarkedCompleteBy) {
        this.lyricsMarkedCompleteBy = lyricsMarkedCompleteBy;
    }

    public Object getLyricsMarkedStaffApprovedBy() {
        return lyricsMarkedStaffApprovedBy;
    }

    public void setLyricsMarkedStaffApprovedBy(Object lyricsMarkedStaffApprovedBy) {
        this.lyricsMarkedStaffApprovedBy = lyricsMarkedStaffApprovedBy;
    }

    public Long getLyricsOwnerId() {
        return lyricsOwnerId;
    }

    public void setLyricsOwnerId(Long lyricsOwnerId) {
        this.lyricsOwnerId = lyricsOwnerId;
    }

    public Object getLyricsPlaceholderReason() {
        return lyricsPlaceholderReason;
    }

    public void setLyricsPlaceholderReason(Object lyricsPlaceholderReason) {
        this.lyricsPlaceholderReason = lyricsPlaceholderReason;
    }

    public String getLyricsState() {
        return lyricsState;
    }

    public void setLyricsState(String lyricsState) {
        this.lyricsState = lyricsState;
    }

    public List<Medium> getMedia() {
        return media;
    }

    public void setMedia(List<Medium> media) {
        this.media = media;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PrimaryArtist getPrimaryArtist() {
        return primaryArtist;
    }

    public void setPrimaryArtist(PrimaryArtist primaryArtist) {
        this.primaryArtist = primaryArtist;
    }

    public List<ProducerArtist> getProducerArtists() {
        return producerArtists;
    }

    public void setProducerArtists(List<ProducerArtist> producerArtists) {
        this.producerArtists = producerArtists;
    }

    public Long getPyongsCount() {
        return pyongsCount;
    }

    public void setPyongsCount(Long pyongsCount) {
        this.pyongsCount = pyongsCount;
    }

    public String getRecordingLocation() {
        return recordingLocation;
    }

    public void setRecordingLocation(String recordingLocation) {
        this.recordingLocation = recordingLocation;
    }

    public String getRelationshipsIndexUrl() {
        return relationshipsIndexUrl;
    }

    public void setRelationshipsIndexUrl(String relationshipsIndexUrl) {
        this.relationshipsIndexUrl = relationshipsIndexUrl;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ReleaseDateComponents getReleaseDateComponents() {
        return releaseDateComponents;
    }

    public void setReleaseDateComponents(ReleaseDateComponents releaseDateComponents) {
        this.releaseDateComponents = releaseDateComponents;
    }

    public String getReleaseDateForDisplay() {
        return releaseDateForDisplay;
    }

    public void setReleaseDateForDisplay(String releaseDateForDisplay) {
        this.releaseDateForDisplay = releaseDateForDisplay;
    }

    public String getReleaseDateWithAbbreviatedMonthForDisplay() {
        return releaseDateWithAbbreviatedMonthForDisplay;
    }

    public void setReleaseDateWithAbbreviatedMonthForDisplay(String releaseDateWithAbbreviatedMonthForDisplay) {
        this.releaseDateWithAbbreviatedMonthForDisplay = releaseDateWithAbbreviatedMonthForDisplay;
    }

    public String getSongArtImageThumbnailUrl() {
        return songArtImageThumbnailUrl;
    }

    public void setSongArtImageThumbnailUrl(String songArtImageThumbnailUrl) {
        this.songArtImageThumbnailUrl = songArtImageThumbnailUrl;
    }

    public String getSongArtImageUrl() {
        return songArtImageUrl;
    }

    public void setSongArtImageUrl(String songArtImageUrl) {
        this.songArtImageUrl = songArtImageUrl;
    }

    public List<SongRelationship> getSongRelationships() {
        return songRelationships;
    }

    public void setSongRelationships(List<SongRelationship> songRelationships) {
        this.songRelationships = songRelationships;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleWithFeatured() {
        return titleWithFeatured;
    }

    public void setTitleWithFeatured(String titleWithFeatured) {
        this.titleWithFeatured = titleWithFeatured;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<VerifiedAnnotationsBy> getVerifiedAnnotationsBy() {
        return verifiedAnnotationsBy;
    }

    public void setVerifiedAnnotationsBy(List<VerifiedAnnotationsBy> verifiedAnnotationsBy) {
        this.verifiedAnnotationsBy = verifiedAnnotationsBy;
    }

    public List<VerifiedContributor> getVerifiedContributors() {
        return verifiedContributors;
    }

    public void setVerifiedContributors(List<VerifiedContributor> verifiedContributors) {
        this.verifiedContributors = verifiedContributors;
    }

    public List<Object> getVerifiedLyricsBy() {
        return verifiedLyricsBy;
    }

    public void setVerifiedLyricsBy(List<Object> verifiedLyricsBy) {
        this.verifiedLyricsBy = verifiedLyricsBy;
    }

    public List<WriterArtist> getWriterArtists() {
        return writerArtists;
    }

    public void setWriterArtists(List<WriterArtist> writerArtists) {
        this.writerArtists = writerArtists;
    }

}
