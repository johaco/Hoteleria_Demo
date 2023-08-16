package com.example.demo.controllers;

import com.example.demo.models.services.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private final HelloServiceImpl helloService;

    public HelloController(HelloServiceImpl helloService) {
        this.helloService = helloService;
    }


    @GetMapping("/hello")
    public String hello() {
        return helloService.getHelloMessage();
    }
}