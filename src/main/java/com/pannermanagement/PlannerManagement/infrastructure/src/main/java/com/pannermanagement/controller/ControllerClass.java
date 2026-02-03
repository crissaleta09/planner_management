package com.pannermanagement.PlannerManagement.infrastructure.src.main.java.com.pannermanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerClass {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
