package com.bidding.bidding_platform.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "\"users\"")
public class User {
    // Optional: Add setter methods for completeness
    // Add these getter methods
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    private String username;
    private String name;
    private String email;
    private String password;
    private String status;

    public User() {
    }
}
