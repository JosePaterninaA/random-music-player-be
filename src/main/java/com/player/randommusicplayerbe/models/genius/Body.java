
package com.player.randommusicplayerbe.models.genius;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import lombok.Data;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Body {

    @Expose
    private Dom dom;

    public Dom getDom() {
        return dom;
    }

    public void setDom(Dom dom) {
        this.dom = dom;
    }

}
