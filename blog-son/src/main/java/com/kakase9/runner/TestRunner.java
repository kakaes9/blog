package com.kakase9.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author yjt
 * @create 2022-09-16-18:46
 */
@Component
public class TestRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("程序初始化");
    }
}
