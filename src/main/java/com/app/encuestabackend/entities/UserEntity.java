package com.app.encuestabackend.entities;


import jakarta.persistence.*;
import lombok.Data;

import javax.annotation.processing.Generated;

@Entity(name="users")
@Data
public class UserEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable= false, length = 255)
    private String name;

    @Column(nullable= false, length = 255)
    private String email;

    @Column(nullable= false, length = 255)
    private String encryptedPassword;






}
