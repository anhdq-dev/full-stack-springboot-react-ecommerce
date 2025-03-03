package com.eshop.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse {
    private String action;
    private boolean success;
    private String message;
    private Object data;

    public ApiResponse(String action, boolean success, String message) {
        this.action = action;
        this.success = success;
        this.message = message;
    }
}
