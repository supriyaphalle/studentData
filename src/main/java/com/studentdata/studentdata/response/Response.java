package com.studentdata.studentdata.response;

public class Response {

    public String message;

    public int statusCode;

    public Object body;

    public Response(String message, int statusCode, Object body) {
        this.message = message;
        this.statusCode = statusCode;
        this.body = body;
    }

}
