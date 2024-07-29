package com.maxime.Car_Rentel_Spring.services;

import com.maxime.Car_Rentel_Spring.dto.SignupRequest;
import com.maxime.Car_Rentel_Spring.dto.UserDto;

public interface AuthService {

    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);
}
