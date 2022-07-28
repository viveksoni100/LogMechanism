package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LoggingApplication {

    Logger logger = LoggerFactory.getLogger(LoggingApplication.class);

    @GetMapping("/greetings/{name}")
    public String greetings(@PathVariable String name) {

    	int i = 2;
    	int result = i/0;

        if (name.equals("Devangi")) {
            throw new RuntimeException("Opps! System got crashed");
        }

        logger.debug("request {}", name);
        String response = "Hi " + name + " Welcome to the Jungle!";
        logger.debug("response {}", response);
        return response;
    }

    public static void main(String[] args) {
        SpringApplication.run(LoggingApplication.class, args);
    }

}
