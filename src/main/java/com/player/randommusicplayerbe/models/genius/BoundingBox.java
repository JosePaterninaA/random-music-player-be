
package com.player.randommusicplayerbe.models.genius;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import lombok.Data;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoundingBox {

    @Expose
    private Long height;
    @Expose
    private Long width;

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

}
