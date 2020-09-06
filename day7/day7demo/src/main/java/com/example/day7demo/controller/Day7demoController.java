package com.example.day7demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day7demoController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
