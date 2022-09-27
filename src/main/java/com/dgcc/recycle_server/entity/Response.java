package com.dgcc.recycle_server.entity;

import lombok.Data;

@Data
public class Response {

    private final static int SUCCESS_CODE = 0;
    private final static int FAIL_CODE = 1;


    private int code;

    private String message;

    private Object data;

    public Response() {
    }

    public Response(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public  Response(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Response success() {
        Response response = new Response();
        response.code = SUCCESS_CODE;
        response.message = "成功";
        return response;
    }

    public static Response success(String message) {
        Response response = new Response();
        response.code = SUCCESS_CODE;
        response.message = message;
        return response;
    }

    public static Response success(String message, Object data) {
        Response response = new Response();
        response.code = SUCCESS_CODE;
        response.message = message;
        response.data = data;
        return response;
    }

    public static Response fail(String message) {
        Response response = new Response();
        response.code = FAIL_CODE;
        response.message = message;
        return response;
    }
}
