package com.eshop.controller;

import com.eshop.model.User;
import com.eshop.request.SignUpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/signup")
    public ResponseEntity<User> createUserHandler(
            @RequestBody SignUpRequest request
    ) {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setFullName(request.getFullName());

        return ResponseEntity.ok().body(user);
    }
}
