package com.shedhack.trace.graylog.connection;

/**
 * @author imamchishty
 */
public class GraylogConnection {

    private String protocol, host, user, pass, connection;

    private int port;

    public GraylogConnection(String protocol, String host, int port, String user, String password) {
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.user = user;
        this.pass = password;

        // create connection string
        connection =  protocol +  "://" + user + ":"  + pass + "@" + host + ":" + port;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public int getPort() {
        return port;
    }

    public String getConnection() {
        return connection;
    }

    public String getConnection(String uri) {
        return connection + uri;
    }


    @Override
    public String toString() {
        return "{\"GraylogConnection\":{"
                + "\"protocol\":\"" + protocol + "\""
                + ", \"host\":\"" + host + "\""
                + ", \"user\":\"" + user + "\""
                + ", \"pass\":\"" + "********" + "\""
                + ", \"port\":\"" + port + "\""
                + "}}";
    }
}
