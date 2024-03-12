package com.chumz.ServiceBookingSystem.services.authentication;

import com.chumz.ServiceBookingSystem.dto.SignupRequestDTO;
import com.chumz.ServiceBookingSystem.dto.UserDto;

public interface AuthService {

    UserDto signupClient(SignupRequestDTO signupRequestDTO);

    UserDto signupCompany(SignupRequestDTO signupRequestDTO);

    Boolean presentByEmail(String email);
}
