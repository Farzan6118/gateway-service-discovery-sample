package com.example.clientGatewayOne.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/one")
public class AppOneController {

    @GetMapping("/test")
    public String test() {
        return "test sample one";
    }

}
