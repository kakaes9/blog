package com.kakase9;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling//定时任务
@MapperScan("com.kakase9.mapper")
public class BlogApplication {
    public static void main(String[] args) {
            SpringApplication.run(BlogApplication.class,args);
    }
}
