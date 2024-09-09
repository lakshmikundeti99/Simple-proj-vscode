package com.example.simplerestapiproj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {

  
    @GetMapping("/message")
    public String getMessage(){
        return "Hello,EveryOne!";
    }

    @GetMapping("/message1")
    public String getMessageInfo(){
        return "Test details.";
    }
}
