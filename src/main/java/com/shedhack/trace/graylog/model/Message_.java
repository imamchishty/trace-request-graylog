
package com.shedhack.trace.graylog.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.shedhack.trace.request.api.model.RequestModel;

import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Message_ {

    @SerializedName("sourceFileName")
    @Expose
    private String sourceFileName;

    @SerializedName("sourceMethodName")
    @Expose
    private String sourceMethodName;

    @SerializedName("level")
    @Expose
    private Integer level;

    @SerializedName("groupId")
    @Expose
    private String groupId;

    @SerializedName("source")
    @Expose
    private String source;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("gl2_source_input")
    @Expose
    private String gl2SourceInput;

    @SerializedName("threadName")
    @Expose
    private String threadName;

    @SerializedName("requestId")
    @Expose
    private String requestId;

    @SerializedName("sourceClassName")
    @Expose
    private String sourceClassName;

    @SerializedName("sourceLineNumber")
    @Expose
    private Integer sourceLineNumber;

    @SerializedName("gl2_source_node")
    @Expose
    private String gl2SourceNode;

    @SerializedName("_id")
    @Expose
    private String id;

    @SerializedName("loggerName")
    @Expose
    private String loggerName;

    @SerializedName("applicationId")
    @Expose
    private String applicationId;

    @SerializedName("requestStatus")
    @Expose
    private String requestStatus;

    @SerializedName("requestPath")
    @Expose
    private String requestPath;

    @SerializedName("timestamp")
    @Expose
    private String timestamp;

    private List<RequestModel> requestModels;

    public List<RequestModel> getRequestModels() {
        return requestModels;
    }

    public void setRequestModels(List<RequestModel> requestModels) {
        this.requestModels = requestModels;
    }

    public void addRequestModel(RequestModel model) {
        if (requestModels == null) {
            requestModels = new ArrayList<>();
        }

        requestModels.add(model);
    }


    /**
     * 
     * @return
     *     The sourceFileName
     */
    public String getSourceFileName() {
        return sourceFileName;
    }

    /**
     * 
     * @param sourceFileName
     *     The sourceFileName
     */
    public void setSourceFileName(String sourceFileName) {
        this.sourceFileName = sourceFileName;
    }

    /**
     * 
     * @return
     *     The sourceMethodName
     */
    public String getSourceMethodName() {
        return sourceMethodName;
    }

    /**
     * 
     * @param sourceMethodName
     *     The sourceMethodName
     */
    public void setSourceMethodName(String sourceMethodName) {
        this.sourceMethodName = sourceMethodName;
    }

    /**
     * 
     * @return
     *     The level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 
     * @return
     *     The groupId
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 
     * @param groupId
     *     The groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * 
     * @return
     *     The source
     */
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 
     * @return
     *     The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 
     * @return
     *     The gl2SourceInput
     */
    public String getGl2SourceInput() {
        return gl2SourceInput;
    }

    /**
     * 
     * @param gl2SourceInput
     *     The gl2_source_input
     */
    public void setGl2SourceInput(String gl2SourceInput) {
        this.gl2SourceInput = gl2SourceInput;
    }

    /**
     * 
     * @return
     *     The threadName
     */
    public String getThreadName() {
        return threadName;
    }

    /**
     * 
     * @param threadName
     *     The threadName
     */
    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    /**
     * 
     * @return
     *     The requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * 
     * @param requestId
     *     The requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * 
     * @return
     *     The sourceClassName
     */
    public String getSourceClassName() {
        return sourceClassName;
    }

    /**
     * 
     * @param sourceClassName
     *     The sourceClassName
     */
    public void setSourceClassName(String sourceClassName) {
        this.sourceClassName = sourceClassName;
    }

    /**
     * 
     * @return
     *     The sourceLineNumber
     */
    public Integer getSourceLineNumber() {
        return sourceLineNumber;
    }

    /**
     * 
     * @param sourceLineNumber
     *     The sourceLineNumber
     */
    public void setSourceLineNumber(Integer sourceLineNumber) {
        this.sourceLineNumber = sourceLineNumber;
    }

    /**
     * 
     * @return
     *     The gl2SourceNode
     */
    public String getGl2SourceNode() {
        return gl2SourceNode;
    }

    /**
     * 
     * @param gl2SourceNode
     *     The gl2_source_node
     */
    public void setGl2SourceNode(String gl2SourceNode) {
        this.gl2SourceNode = gl2SourceNode;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The _id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The loggerName
     */
    public String getLoggerName() {
        return loggerName;
    }

    /**
     * 
     * @param loggerName
     *     The loggerName
     */
    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    /**
     * 
     * @return
     *     The applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * 
     * @param applicationId
     *     The applicationId
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * 
     * @return
     *     The requestStatus
     */
    public String getRequestStatus() {
        return requestStatus;
    }

    /**
     * 
     * @param requestStatus
     *     The requestStatus
     */
    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    /**
     * 
     * @return
     *     The requestPath
     */
    public String getRequestPath() {
        return requestPath;
    }

    /**
     * 
     * @param requestPath
     *     The requestPath
     */
    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "{\"Message_\":{"
                + "\"sourceFileName\":\"" + sourceFileName + "\""
                + ", \"sourceMethodName\":\"" + sourceMethodName + "\""
                + ", \"level\":\"" + level + "\""
                + ", \"groupId\":\"" + groupId + "\""
                + ", \"source\":\"" + source + "\""
                + ", \"message\":" + message
                + ", \"gl2SourceInput\":\"" + gl2SourceInput + "\""
                + ", \"threadName\":\"" + threadName + "\""
                + ", \"requestId\":\"" + requestId + "\""
                + ", \"sourceClassName\":\"" + sourceClassName + "\""
                + ", \"sourceLineNumber\":\"" + sourceLineNumber + "\""
                + ", \"gl2SourceNode\":\"" + gl2SourceNode + "\""
                + ", \"id\":\"" + id + "\""
                + ", \"loggerName\":\"" + loggerName + "\""
                + ", \"applicationId\":\"" + applicationId + "\""
                + ", \"requestStatus\":\"" + requestStatus + "\""
                + ", \"requestPath\":\"" + requestPath + "\""
                + ", \"timestamp\":\"" + timestamp + "\""
                + "}}";
    }
}
