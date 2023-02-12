package com.jwtauthdemo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/greeting")
    public String welcome() {
        return "Welcome!";
    }
}
