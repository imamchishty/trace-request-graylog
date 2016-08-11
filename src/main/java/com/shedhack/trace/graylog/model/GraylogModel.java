
package com.shedhack.trace.graylog.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class GraylogModel {

    @SerializedName("query")
    @Expose
    private String query;

    @SerializedName("built_query")
    @Expose
    private String builtQuery;

    @SerializedName("used_indices")
    @Expose
    private List<UsedIndex> usedIndices = new ArrayList<UsedIndex>();

    @SerializedName("messages")
    @Expose
    private List<Message> messages = new ArrayList<Message>();

    @SerializedName("fields")
    @Expose
    private List<String> fields = new ArrayList<String>();

    @SerializedName("time")
    @Expose
    private Integer time;

    @SerializedName("total_results")
    @Expose
    private Integer totalResults;

    @SerializedName("from")
    @Expose
    private String from;

    @SerializedName("to")
    @Expose
    private String to;

    /**
     * 
     * @return
     *     The query
     */
    public String getQuery() {
        return query;
    }

    /**
     * 
     * @param query
     *     The query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * 
     * @return
     *     The builtQuery
     */
    public String getBuiltQuery() {
        return builtQuery;
    }

    /**
     * 
     * @param builtQuery
     *     The built_query
     */
    public void setBuiltQuery(String builtQuery) {
        this.builtQuery = builtQuery;
    }

    /**
     * 
     * @return
     *     The usedIndices
     */
    public List<UsedIndex> getUsedIndices() {
        return usedIndices;
    }

    /**
     * 
     * @param usedIndices
     *     The used_indices
     */
    public void setUsedIndices(List<UsedIndex> usedIndices) {
        this.usedIndices = usedIndices;
    }

    /**
     * 
     * @return
     *     The messages
     */
    public List<Message> getMessages() {
        return messages;
    }

    /**
     * 
     * @param messages
     *     The messages
     */
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    /**
     * 
     * @return
     *     The fields
     */
    public List<String> getFields() {
        return fields;
    }

    /**
     * 
     * @param fields
     *     The fields
     */
    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    /**
     * 
     * @return
     *     The time
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The totalResults
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * 
     * @param totalResults
     *     The total_results
     */
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    /**
     * 
     * @return
     *     The from
     */
    public String getFrom() {
        return from;
    }

    /**
     * 
     * @param from
     *     The from
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * 
     * @return
     *     The to
     */
    public String getTo() {
        return to;
    }

    /**
     * 
     * @param to
     *     The to
     */
    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "{\"GraylogModel\":{"
                + "\"query\":\"" + query + "\""
                + ", \"builtQuery\":\"" + builtQuery + "\""
                + ", \"usedIndices\":" + usedIndices
                + ", \"messages\":" + messages
                + ", \"fields\":" + fields
                + ", \"time\":\"" + time + "\""
                + ", \"totalResults\":\"" + totalResults + "\""
                + ", \"from\":\"" + from + "\""
                + ", \"to\":\"" + to + "\""
                + "}}";
    }
}
