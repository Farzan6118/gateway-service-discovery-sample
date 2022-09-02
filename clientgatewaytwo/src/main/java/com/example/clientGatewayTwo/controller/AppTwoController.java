package com.example.clientGatewayTwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/two")
public class AppTwoController {

    @GetMapping("/test")
    public String test() {
        return "sample test two";
    }
}
