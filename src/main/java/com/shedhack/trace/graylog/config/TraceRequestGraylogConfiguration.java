package com.shedhack.trace.graylog.config;

import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;
import com.shedhack.trace.graylog.connection.GraylogConnection;
import com.shedhack.trace.graylog.service.TraceRequestServiceGraylog;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * </pre>
 *
 * @author imamchishty
 */
@Configuration
public class TraceRequestGraylogConfiguration {

    @Value("${trace.request.graylog.protocol:http}")
    private String graylogProtocol;

    @Value("${trace.request.graylog.host}")
    private String graylogHost;

    @Value("${trace.request.graylog.port}")
    private int graylogPort;

    @Value("${trace.request.graylog.user}")
    private String graylogUser;

    @Value("${trace.request.graylog.pass}")
    private String graylogPass;

    @Bean
    public TraceRequestServiceGraylog traceRequestServiceGraylog() {
        return new TraceRequestServiceGraylog(new GraylogConnection(graylogProtocol, graylogHost, graylogPort, graylogUser, graylogPass), unirest(), gson());
    }

    @Bean
    public Unirest unirest() {

        Unirest unirest = new Unirest();

        // default headers
        unirest.setDefaultHeader("accept", "application/json");
        unirest.setDefaultHeader("Content-Type", "application/json");

        return unirest;
    }

    @Bean
    public Gson gson() {
        return new Gson();
    }

}
