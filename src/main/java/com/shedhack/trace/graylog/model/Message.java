
package com.shedhack.trace.graylog.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Message {

    @SerializedName("message")
    @Expose
    private Message_ message;

    @SerializedName("index")
    @Expose
    private String index;

    @SerializedName("highlight_ranges")
    @Expose
    private HighlightRanges highlightRanges;

    /**
     * 
     * @return
     *     The message
     */
    public Message_ getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    public void setMessage(Message_ message) {
        this.message = message;
    }

    /**
     * 
     * @return
     *     The index
     */
    public String getIndex() {
        return index;
    }

    /**
     * 
     * @param index
     *     The index
     */
    public void setIndex(String index) {
        this.index = index;
    }

    /**
     * 
     * @return
     *     The highlightRanges
     */
    public HighlightRanges getHighlightRanges() {
        return highlightRanges;
    }

    /**
     * 
     * @param highlightRanges
     *     The highlight_ranges
     */
    public void setHighlightRanges(HighlightRanges highlightRanges) {
        this.highlightRanges = highlightRanges;
    }

    @Override
    public String toString() {
        return "{\"Message\":{"
                + "\"message\":" + message
                + ", \"index\":\"" + index + "\""
                + ", \"highlightRanges\":" + highlightRanges
                + "}}";
    }
}
