package com.app.encuestabackend.models.requests;

import lombok.Data;

@Data
public class UserRegisterRequestModel {

    private String name;

    private String subname;
    private String email;
    private String password;
}
