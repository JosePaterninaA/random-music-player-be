
package com.player.randommusicplayerbe.models.genius;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import lombok.Data;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Avatar {

    @Expose
    private Medium medium;
    @Expose
    private Small small;
    @Expose
    private Thumb thumb;
    @Expose
    private Tiny tiny;

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public Small getSmall() {
        return small;
    }

    public void setSmall(Small small) {
        this.small = small;
    }

    public Thumb getThumb() {
        return thumb;
    }

    public void setThumb(Thumb thumb) {
        this.thumb = thumb;
    }

    public Tiny getTiny() {
        return tiny;
    }

    public void setTiny(Tiny tiny) {
        this.tiny = tiny;
    }

}
