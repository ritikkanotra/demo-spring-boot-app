package com.example.one.demo.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.one.demo.model.User;
import com.example.one.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    
    public String register(String email, String password) {
        String response = "An error occured";
        if (userRepository.getByEmail(email) != null) {
            response = "User already exists";
            return response;
        }
        User user = userRepository.save(User.builder().email(email).password(password).build());
        if (Objects.nonNull(user)) {
            response = "User registered successfully";
            return response;
        }
        return response;
    }

}
