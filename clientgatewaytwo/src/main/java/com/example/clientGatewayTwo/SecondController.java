package com.example.clientGatewayTwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class SecondController {

    @GetMapping("test")
    public String test() {
        return "sample test two";
    }
}
