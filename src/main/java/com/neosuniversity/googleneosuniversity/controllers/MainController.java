package com.neosuniversity.googleneosuniversity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "Hello Spring Boot + google cloud 2!";
    }
}
