package com.github.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Value("${hello.username:world}")
    private String username;

    @GetMapping("/")
    public String index() {
        LOGGER.info("Hello, {}", username);
        return "hello, " + username;
    }
}
