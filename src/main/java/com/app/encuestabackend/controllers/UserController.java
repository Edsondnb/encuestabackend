package com.app.encuestabackend.controllers;

import com.app.encuestabackend.models.requests.UserRegisterRequestModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/users")
public class UserController {
    
    @PostMapping()
    public String  createUser(@RequestBody UserRegisterRequestModel userModel){
        return "Create user 2";
    }
    
}
