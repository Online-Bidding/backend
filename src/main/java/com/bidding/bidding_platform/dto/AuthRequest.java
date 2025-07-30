package com.bidding.bidding_platform.dto;

import lombok.Data;

@Data
public class AuthRequest {
    private String email;
    private String password;
}
