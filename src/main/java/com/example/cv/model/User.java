package com.example.cv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String encode) {
    }

    public void setEmail(String email) {
    }

    // Getters and setters

    // Constructors
}
