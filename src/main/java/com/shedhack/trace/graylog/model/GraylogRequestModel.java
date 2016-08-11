package com.shedhack.trace.graylog.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.shedhack.trace.request.api.constant.Status;
import com.shedhack.trace.request.api.model.RequestModel;

/**
 * @author imamchishty
 */
public class GraylogRequestModel implements RequestModel {

    @SerializedName("requestId")
    @Expose
    private String requestId;

    @SerializedName("applicationId")
    @Expose
    private String applicationId;

    @SerializedName("groupId")
    @Expose
    private String groupId;

    @SerializedName("callerId")
    @Expose
    private String callerId;

    @SerializedName("path")
    @Expose
    private String path;

    @SerializedName("sessionId")
    @Expose
    private String sessionId;

    @SerializedName("httpMethod")
    @Expose
    private String httpMethod;

    @SerializedName("clientAddress")
    @Expose
    private String clientAddress;

    @SerializedName("hostAddress")
    @Expose
    private String hostAddress;

    @SerializedName("headers")
    @Expose
    private String headers;

    @SerializedName("exceptionId")
    @Expose
    private String exceptionId;

    @SerializedName("requestDateTime")
    @Expose
    private long requestDateTime;

    @SerializedName("responseDateTime")
    @Expose
    private long responseDateTime;

    @SerializedName("status")
    @Expose
    private Status status;

    @SerializedName("httpStatusCode")
    @Expose
    private int httpStatusCode;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getCallerId() {
        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public long getRequestDateTime() {
        return requestDateTime;
    }

    public void setRequestDateTime(long requestDateTime) {
        this.requestDateTime = requestDateTime;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public long getResponseDateTime() {
        return responseDateTime;
    }

    public void setResponseDateTime(long responseDateTime) {
        this.responseDateTime = responseDateTime;
    }

    public String getExceptionId() {
        return exceptionId;
    }

    public void setExceptionId(String exceptionId) {
        this.exceptionId = exceptionId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    @Override
    public String toString() {
        return "{\"GraylogRequestModel\":{"
                + "\"requestId\":\"" + requestId + "\""
                + ", \"applicationId\":\"" + applicationId + "\""
                + ", \"groupId\":\"" + groupId + "\""
                + ", \"callerId\":\"" + callerId + "\""
                + ", \"path\":\"" + path + "\""
                + ", \"sessionId\":\"" + sessionId + "\""
                + ", \"httpMethod\":\"" + httpMethod + "\""
                + ", \"clientAddress\":\"" + clientAddress + "\""
                + ", \"hostAddress\":\"" + hostAddress + "\""
                + ", \"headers\":\"" + headers + "\""
                + ", \"exceptionId\":\"" + exceptionId + "\""
                + ", \"requestDateTime\":\"" + requestDateTime + "\""
                + ", \"responseDateTime\":\"" + responseDateTime + "\""
                + ", \"status\":\"" + status + "\""
                + ", \"httpStatusCode\":\"" + httpStatusCode + "\""
                + "}}";
    }
}
