
package com.shedhack.trace.graylog.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class HighlightRanges {

    @SerializedName("sourceClassName")
    @Expose
    private List<SourceClassName> sourceClassName = new ArrayList<SourceClassName>();

    @SerializedName("groupId")
    @Expose
    private List<GroupId> groupId = new ArrayList<GroupId>();

    @SerializedName("loggerName")
    @Expose
    private List<LoggerName> loggerName = new ArrayList<LoggerName>();

    /**
     * 
     * @return
     *     The sourceClassName
     */
    public List<SourceClassName> getSourceClassName() {
        return sourceClassName;
    }

    /**
     * 
     * @param sourceClassName
     *     The sourceClassName
     */
    public void setSourceClassName(List<SourceClassName> sourceClassName) {
        this.sourceClassName = sourceClassName;
    }

    /**
     * 
     * @return
     *     The groupId
     */
    public List<GroupId> getGroupId() {
        return groupId;
    }

    /**
     * 
     * @param groupId
     *     The groupId
     */
    public void setGroupId(List<GroupId> groupId) {
        this.groupId = groupId;
    }

    /**
     * 
     * @return
     *     The loggerName
     */
    public List<LoggerName> getLoggerName() {
        return loggerName;
    }

    /**
     * 
     * @param loggerName
     *     The loggerName
     */
    public void setLoggerName(List<LoggerName> loggerName) {
        this.loggerName = loggerName;
    }

    @Override
    public String toString() {
        return "{\"HighlightRanges\":{"
                + "\"sourceClassName\":" + sourceClassName
                + ", \"groupId\":" + groupId
                + ", \"loggerName\":" + loggerName
                + "}}";
    }
}
