package com.devb.laptopshop.controller;

import org.springframework.web.bind.annotation.RestController;

import com.devb.laptopshop.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getHomePage() {
        return this.userService.handleHello();
    }
}
