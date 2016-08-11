package com.shedhack.trace.graylog;

import com.shedhack.trace.graylog.config.EnableTraceRequestGraylog;
import com.shedhack.trace.request.viewer.config.EnableTraceRequestViewer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTraceRequestViewer
@EnableTraceRequestGraylog
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
