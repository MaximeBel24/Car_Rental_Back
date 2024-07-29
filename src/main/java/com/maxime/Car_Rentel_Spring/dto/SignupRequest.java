package com.maxime.Car_Rentel_Spring.dto;

import lombok.Getter;

@Getter
public class SignupRequest {

    private String email;
    private String name;
    private String password;
}
