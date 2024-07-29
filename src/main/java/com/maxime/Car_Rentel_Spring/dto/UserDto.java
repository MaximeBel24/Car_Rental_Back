package com.maxime.Car_Rentel_Spring.dto;

import com.maxime.Car_Rentel_Spring.enums.UserRole;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String name;

    private String email;

    private UserRole userRole;

}
