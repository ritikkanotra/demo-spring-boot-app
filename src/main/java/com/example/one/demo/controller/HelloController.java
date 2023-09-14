package com.example.one.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.one.demo.model.Mobile;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String hello() {
        return "<b>Hello Ritik</b>";   
    }

    @PostMapping("/post")
    public String postFunction(@RequestBody Mobile mobile) {
        return mobile.toString();
    }

}
