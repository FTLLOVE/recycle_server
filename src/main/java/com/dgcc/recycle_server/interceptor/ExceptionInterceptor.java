package com.dgcc.recycle_server.interceptor;

import com.dgcc.recycle_server.entity.Response;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 异常处理
 *
 * @author
 */

@RestControllerAdvice
public class ExceptionInterceptor {

    private Map<String, Object> map = new LinkedHashMap<>();


    @ExceptionHandler({Exception.class})
    public Object exceptionHandler(Exception e) {
        //todo 记录日志
        System.out.println(e.getMessage());
        return Response.fail("服务器有点问题，工程师正在排查");
    }

    @ExceptionHandler({ServiceException.class})
    public Object serviceException(ServiceException e) {
        return Response.fail(e.getMessage());
    }

}
