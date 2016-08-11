
package com.shedhack.trace.graylog.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class GroupId {

    @SerializedName("start")
    @Expose
    private Integer start;

    @SerializedName("length")
    @Expose
    private Integer length;

    /**
     * 
     * @return
     *     The start
     */
    public Integer getStart() {
        return start;
    }

    /**
     * 
     * @param start
     *     The start
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 
     * @return
     *     The length
     */
    public Integer getLength() {
        return length;
    }

    /**
     * 
     * @param length
     *     The length
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "{\"GroupId\":{"
                + "\"start\":\"" + start + "\""
                + ", \"length\":\"" + length + "\""
                + "}}";
    }
}
