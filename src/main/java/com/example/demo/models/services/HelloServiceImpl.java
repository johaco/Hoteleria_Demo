package com.example.demo.models.services;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloServiceInterface {

    @Override
    public String getHelloMessage() {

        return "hello";
    }

}
