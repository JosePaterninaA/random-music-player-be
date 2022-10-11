
package com.player.randommusicplayerbe.models.genius;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Child {

    @Expose
    private Attributes attributes;
    @Expose
    private List<String> children;
    @Expose
    private Data data;
    @Expose
    private String tag;

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
