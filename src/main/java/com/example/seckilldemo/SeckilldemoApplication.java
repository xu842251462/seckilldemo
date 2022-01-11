package com.example.seckilldemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.jiuzhang.seckill.db.mappers")
@ComponentScan(basePackages = {"com.jiuzhang"})
public class SeckilldemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckilldemoApplication.class, args);
    }

}
