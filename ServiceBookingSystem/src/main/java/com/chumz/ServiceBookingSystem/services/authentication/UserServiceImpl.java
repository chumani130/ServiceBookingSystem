package com.chumz.ServiceBookingSystem.services.authentication;

import com.chumz.ServiceBookingSystem.dto.SignupRequestDTO;
import com.chumz.ServiceBookingSystem.dto.UserDto;
import com.chumz.ServiceBookingSystem.entity.User;
import com.chumz.ServiceBookingSystem.enums.UserRole;
import com.chumz.ServiceBookingSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements AuthService{
    @Autowired
    private UserRepository userRepository;

    public UserDto signupClient(SignupRequestDTO signupRequestDTO) {
        User user = new User();

        user.setName(signupRequestDTO.getName());
        user.setLastname(signupRequestDTO.getLastname());
        user.setEmail(signupRequestDTO.getEmail());
        user.setPhone(signupRequestDTO.getPhone());
        user.setPassword(signupRequestDTO.getPassword());

        user.setRole(UserRole.CLIENT);

        return userRepository.save(user).getDto();
    }

    public Boolean presentByEmail(String email) {
        return userRepository.findFirstByEmail(email) != null;
    }
}
