package com.app.encuestabackend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import javax.annotation.processing.Generated;

@Entity(name="users")
@Data
public class UserEntity {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String subname;

    private Boolean estado;






}
