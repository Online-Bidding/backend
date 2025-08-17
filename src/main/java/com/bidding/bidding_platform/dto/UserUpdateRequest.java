package com.bidding.bidding_platform.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateRequest {

    private String name;
    private String email;
    private String status;

    public void setRole(String status) {
        this.status = status;
    }
}
