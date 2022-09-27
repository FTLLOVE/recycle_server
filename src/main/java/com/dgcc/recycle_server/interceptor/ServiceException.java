package com.dgcc.recycle_server.interceptor;


/**
 * 自定义异常业务异常
 */
public class ServiceException extends RuntimeException {


    public ServiceException(String message) {
        super(message);
        this.message = message;
    }

    private int code;

    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

//    public ServiceException(int code, String message) {
//        this.code = code;
//        this.message = message;
//    }
}
