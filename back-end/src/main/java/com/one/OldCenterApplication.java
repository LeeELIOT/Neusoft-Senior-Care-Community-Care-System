package com.one;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.one.dao")
public class OldCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(OldCenterApplication.class, args);
    }

}
