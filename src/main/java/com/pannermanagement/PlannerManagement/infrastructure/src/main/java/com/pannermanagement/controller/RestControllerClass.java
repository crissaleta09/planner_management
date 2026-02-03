package com.pannermanagement.PlannerManagement.infrastructure.src.main.java.com.pannermanagement.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {

    @GetMapping("/api")
    public String index() {
        return "Hello World!";
    }
}
