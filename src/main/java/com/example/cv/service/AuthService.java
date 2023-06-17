package com.example.cv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.cv.model.User;
import com.example.cv.repository.UserRepository;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String login(String email, String password) throws Exception {
        User user = userRepository.findByEmail(email);
        if (user == null || !passwordEncoder.matches(password, user.getPassword())) {
            throw new Exception("Invalid credentials");
        }
        // Generate and return a token (implementation depends on your authentication mechanism)
        return "generated_token";
    }

    public String register(String email, String password) throws Exception {
        if (userRepository.findByEmail(email) != null) {
            throw new Exception("Email already registered");
        }
        User user = new User();
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        userRepository.save(user);
        // Generate and return a token (implementation depends on your authentication mechanism)
        return "generated_token";
    }
}
