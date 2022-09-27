package com.dgcc.recycle_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.ManagedBean;

@SpringBootApplication
@MapperScan("com.dgcc.recycle_server.mapper")
public class RecycleServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecycleServerApplication.class, args);
    }

}
