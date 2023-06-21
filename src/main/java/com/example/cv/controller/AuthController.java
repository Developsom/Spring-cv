package com.example.cv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.cv.dto.AuthRequest;
import com.example.cv.dto.AuthResponse;
import com.example.cv.service.AuthService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest authRequest) {
        try {
            String token = authService.login(authRequest.getEmail(), authRequest.getPassword());
            AuthResponse response = new AuthResponse(token);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            System.err.println("Login error: " + e.getMessage()); // Print error message to console
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody AuthRequest authRequest) {
        try {
            String token = authService.register(authRequest.getEmail(), authRequest.getPassword());
            AuthResponse response = new AuthResponse(token);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (Exception e) {
            System.err.println("Registration error: " + e.getMessage()); // Print error message to console
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}

