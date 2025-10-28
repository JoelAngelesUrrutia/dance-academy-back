package com.jangeles.dance_academy_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String test() {
        return "Hi! Spring Boot is running!";
    }
}

