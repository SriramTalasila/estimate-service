package com.talasila.estimate.controller;

import com.talasila.estimate.service.UserService;
import com.talasila.estimate.shared.dto.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController( UserService userService){
        this.userService = userService;
    }

    @GetMapping("/info")
    public UserInfo getUserInfo(){
        return userService.getUserInfo(1L);
    }
}
