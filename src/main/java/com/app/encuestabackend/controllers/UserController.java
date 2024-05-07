package com.app.encuestabackend.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/users")
public class UserController {
    
    @PostMapping()
    public String  createUser(){
        return "Create user 2";
    }
    
}
