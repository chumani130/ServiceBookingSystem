package com.chumz.ServiceBookingSystem.controller;

import com.chumz.ServiceBookingSystem.dto.SignupRequestDTO;
import com.chumz.ServiceBookingSystem.dto.UserDto;
import com.chumz.ServiceBookingSystem.services.authentication.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    @Autowired
    private AuthService authService;

    public ResponseEntity<?> signupClient(@ResponseBody SignupRequestDTO signupRequestDTO) {
        if(authService.presentByEmail(signupRequestDTO.getEmail())) {
            return new ResponseEntity<>("Client already exist with this email", HttpStatus.NOT_ACCEPTABLE);
        }
        UserDto createUser = authService.signupClient(signupRequestDTO);

        return new ResponseEntity<>(createdUser, HttpStatus.OK)
    }
}
