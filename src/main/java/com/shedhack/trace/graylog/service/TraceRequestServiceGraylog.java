package com.shedhack.trace.graylog.service;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.shedhack.trace.graylog.connection.GraylogConnection;
import com.shedhack.trace.graylog.model.GraylogModel;
import com.shedhack.trace.graylog.model.GraylogRequestModel;
import com.shedhack.trace.graylog.model.Message;
import com.shedhack.trace.graylog.model.Message_;
import com.shedhack.trace.request.api.model.DefaultRequestModel;
import com.shedhack.trace.request.api.model.RequestModel;
import com.shedhack.trace.request.api.service.TraceRequestService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author imamchishty
 */
public class TraceRequestServiceGraylog implements TraceRequestService {

    private GraylogConnection connection;

    private Unirest client;

    private Gson gson;

    public TraceRequestServiceGraylog(GraylogConnection connection, Unirest client, Gson gson) {
        this.connection = connection;
        this.client = client;
        this.gson = gson;
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

        List<RequestModel> requests = new ArrayList<>();


            String y =  connection.getConnection("/search/universal/keyword");

        try {

            HttpResponse<String> response = client.get(y)
                    .queryString("query", "groupId: 04a76343-0bcb-4d12-b596-6e989bbe706b AND loggerName: com.shedhack.trace.request.filter.DefaultTraceRequestInterceptor")
                    .queryString("keyword", "20 days ago to today")
                    .queryString("fields", "sourceFileName, sourceMethodName, level, groupId, streams, source, message, gl2_source_input, threadName, requestId, sourceClassName, sourceLineNumber, gl2_source_node, _id, loggerName, applicationId, requestStatus, requestPath, timestamp")
                    .asString();

            GraylogModel graylogModel = gson.fromJson(response.getBody(), GraylogModel.class);

            for(Message message : graylogModel.getMessages()) {

                    // TODO A bit of a hack, when message is of RequestModel type json not converted properly, so reverted to a string
                    requests.add(gson.fromJson(graylogModel.getMessages().get(0).getMessage().getMessage(), GraylogRequestModel.class));

            }



        } catch (UnirestException e) {
            e.printStackTrace();
        }


   /*     String req1 = UUID.randomUUID().toString();
        String req2 = UUID.randomUUID().toString();
        String req3 = UUID.randomUUID().toString();
        String req4 = UUID.randomUUID().toString();
        String req5 = UUID.randomUUID().toString();
        String req6 = UUID.randomUUID().toString();
        String req7 = UUID.randomUUID().toString();
        String req8 = UUID.randomUUID().toString();
        String req9 = UUID.randomUUID().toString();
        String req10 = UUID.randomUUID().toString();
        String req11 = UUID.randomUUID().toString();
        String req12 = UUID.randomUUID().toString();
        String req13 = UUID.randomUUID().toString();

        List<RequestModel> requests = new ArrayList<>();
        requests.add(requestBuilder("district3", req3, groupId, req2));
        requests.add(requestBuilder("district12", req12, groupId, req11));
        requests.add(requestBuilder("district2", req2, groupId, req1));
        requests.add(requestBuilder("district4", req4, groupId, req3));
        requests.add(requestBuilder("district7", req7, groupId, req6));
        requests.add(requestBuilder("district8", req8, groupId, req7));
        requests.add(requestBuilder("district5", req5, groupId, req4));
        requests.add(requestBuilder("district9", req9, groupId, req8));
        requests.add(requestBuilder("district11", req11, groupId, req10));
        requests.add(requestBuilder("district13", req13, groupId, req12));
        requests.add(requestBuilder("district1", req1, groupId, null));
        requests.add(requestBuilder("district10", req10, groupId, req9));
        requests.add(requestBuilder("district6", req6, groupId, req5));*/


        return requests;


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

    public static RequestModel requestBuilder(String appId, String requestId , String groupId, String callerId) {

        if(callerId != null) {
            return new DefaultRequestModel.Builder(appId, requestId, groupId).withCallerId(callerId).build();
        }

        return new DefaultRequestModel.Builder(appId, requestId, groupId).build();
    }
}
