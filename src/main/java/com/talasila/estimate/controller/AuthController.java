package com.talasila.estimate.controller;


import com.talasila.estimate.config.AuthService;
import com.talasila.estimate.repositories.entity.TUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // 🛠️ Register New User with Encrypted Password
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Map<String, String> payload) {
        String email = payload.get("email");
        String password = payload.get("password");

        TUser newUser = authService.register(email, password);

        return ResponseEntity.ok(Map.of(
                "message", "User registered successfully",
                "userId", newUser.getUserId()
        ));
    }

    // 🔐 Login with Email and Password -> Generate JWT Token
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> payload) {
        String email = payload.get("email");
        String password = payload.get("password");

        String token = authService.authenticate(email, password);

        return ResponseEntity.ok(Map.of("token", token));
    }

    // 🔒 Test Endpoint: Requires JWT Authentication
    @GetMapping("/secured")
    public ResponseEntity<?> securedEndpoint() {
        return ResponseEntity.ok(Map.of("message", "You are authenticated!"));
    }
}