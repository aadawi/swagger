package com.example.swagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public Info getInfo() {
        return new Info("Ahmad", "adawi", 1234);
    }

    @PostMapping
    public Info postInfo(@RequestBody Info info) {
        return info;
    }
    record Info(String name, String last, int code) {
    }
}
