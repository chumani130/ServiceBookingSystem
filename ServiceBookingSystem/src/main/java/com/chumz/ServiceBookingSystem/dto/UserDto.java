package com.chumz.ServiceBookingSystem.dto;

import com.chumz.ServiceBookingSystem.enums.UserRole;

public class UserDto {
    private Long id;

    private String email;

    private String password;

    private String name;

    private String lastname;

    private String phone;

    private UserRole role;
}
