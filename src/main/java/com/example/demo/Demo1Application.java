package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Demo1Application {

    private static final Logger logger=LoggerFactory.getLogger(Demo1Application.class);

    public static void main(String[] args) {
        logger.info("this is a info message");
        logger.error("this is a error message");
        logger.warn("this is a warning message");
        SpringApplication.run(Demo1Application.class, args);


    }
}
