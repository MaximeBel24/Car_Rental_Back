package com.maxime.Car_Rentel_Spring.services;

import com.maxime.Car_Rentel_Spring.dto.SignupRequest;
import com.maxime.Car_Rentel_Spring.dto.UserDto;
import com.maxime.Car_Rentel_Spring.entity.User;
import com.maxime.Car_Rentel_Spring.enums.UserRole;
import com.maxime.Car_Rentel_Spring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final UserRepository userRepository;

    @Override
    public UserDto createCustomer(SignupRequest signupRequest) {
        User user = new User();
        user.setName(signupRequest.getName());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(signupRequest.getPassword());
        user.setUserRole(UserRole.CUSTOMER);
        User createdUser = userRepository.save(user);
        UserDto userDto = new UserDto();
        userDto.setId(createdUser.getId());
        return userDto;
    }

    @Override
    public boolean hasCustomerWithEmail(String email) {
        return userRepository.findFirstByEmail(email).isPresent();
    }
}
