package com.talasila.estimate.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EstimateController {

    @GetMapping("/test")
    public String test(){
        log.info(SecurityContextHolder.getContext().getAuthentication()+"");
        return "It's Working";
    }

}
