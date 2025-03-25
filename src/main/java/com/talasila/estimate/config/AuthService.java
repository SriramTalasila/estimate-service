package com.talasila.estimate.config;



import com.talasila.estimate.repositories.UserRepository;
import com.talasila.estimate.repositories.entity.TUser;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    public TUser register(String email, String password) {
        if (userRepository.findByEmail(email).isPresent()) {
            throw new RuntimeException("Email already in use");
        }

        TUser user = new TUser();
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        user.setActiveInd("Y");
        user.setFullName("Test");

        return userRepository.save(user);
    }

    public String authenticate(String email, String password) {
        Optional<TUser> userOpt = userRepository.findByEmail(email);

        if (userOpt.isEmpty() || !passwordEncoder.matches(password, userOpt.get().getPassword())) {
            throw new RuntimeException("Invalid email or password");
        }

        return jwtUtil.generateToken(email,String.valueOf(userOpt.get().getUserId()));
    }
}

