package com.srb.TestingJenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

    @GetMapping()
    public String sayHi(@RequestParam String name)
    {
        return "Hi "+name;
    }

}
