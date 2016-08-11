
package com.shedhack.trace.graylog.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class UsedIndex {

    @SerializedName("index_name")
    @Expose
    private String indexName;

    @SerializedName("begin")
    @Expose
    private String begin;

    @SerializedName("end")
    @Expose
    private String end;

    @SerializedName("calculated_at")
    @Expose
    private String calculatedAt;

    @SerializedName("took_ms")
    @Expose
    private Integer tookMs;

    /**
     * 
     * @return
     *     The indexName
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * 
     * @param indexName
     *     The index_name
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * 
     * @return
     *     The begin
     */
    public String getBegin() {
        return begin;
    }

    /**
     * 
     * @param begin
     *     The begin
     */
    public void setBegin(String begin) {
        this.begin = begin;
    }

    /**
     * 
     * @return
     *     The end
     */
    public String getEnd() {
        return end;
    }

    /**
     * 
     * @param end
     *     The end
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * 
     * @return
     *     The calculatedAt
     */
    public String getCalculatedAt() {
        return calculatedAt;
    }

    /**
     * 
     * @param calculatedAt
     *     The calculated_at
     */
    public void setCalculatedAt(String calculatedAt) {
        this.calculatedAt = calculatedAt;
    }

    /**
     * 
     * @return
     *     The tookMs
     */
    public Integer getTookMs() {
        return tookMs;
    }

    /**
     * 
     * @param tookMs
     *     The took_ms
     */
    public void setTookMs(Integer tookMs) {
        this.tookMs = tookMs;
    }

    @Override
    public String toString() {
        return "{\"UsedIndex\":{"
                + "\"indexName\":\"" + indexName + "\""
                + ", \"begin\":\"" + begin + "\""
                + ", \"end\":\"" + end + "\""
                + ", \"calculatedAt\":\"" + calculatedAt + "\""
                + ", \"tookMs\":\"" + tookMs + "\""
                + "}}";
    }
}
