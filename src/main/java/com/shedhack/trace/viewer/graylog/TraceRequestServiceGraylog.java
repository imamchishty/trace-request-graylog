package com.shedhack.trace.viewer.graylog;

import com.shedhack.trace.request.api.model.RequestModel;
import com.shedhack.trace.request.api.service.TraceRequestService;

import java.util.List;

/**
 * @author imamchishty
 */
public class TraceRequestServiceGraylog implements TraceRequestService {

    private String graylogAddress;

    public TraceRequestServiceGraylog(String graylogNodeAddress) {
        this.graylogAddress = graylogNodeAddress;
    }

    public RequestModel persist(RequestModel model) {
        return null;
    }

    public RequestModel findByRequestId(String requestId) {
        return null;
    }

    public List<? extends RequestModel> findByApplicationId(String applicationId) {
        return null;
    }

    public List<? extends RequestModel> findByGroupId(String groupId) {
        return null;
    }

    public List<? extends RequestModel> findByCallerId(String callerId) {
        return null;
    }

    public List<? extends RequestModel> findByPath(String path) {
        return null;
    }

    public List<? extends RequestModel> findBySessionId(String sessionId) {
        return null;
    }

    public List<? extends RequestModel> findByHttpMethod(String httpMethod) {
        return null;
    }

    public List<? extends RequestModel> findByClientAddress(String clientAddress) {
        return null;
    }

    public List<? extends RequestModel> findByHostAddress(String hostAddress) {
        return null;
    }

    public List<? extends RequestModel> findByHeaders(String headers) {
        return null;
    }

    public List<? extends RequestModel> findByExceptionId(String exceptionId) {
        return null;
    }

    public List<? extends RequestModel> findByStatus(String status) {
        return null;
    }
}
