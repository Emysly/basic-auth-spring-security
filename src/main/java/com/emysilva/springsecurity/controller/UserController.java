package com.emysilva.springsecurity.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/")
    public String home() {
        return "Welcome to home";
    }

    @GetMapping("/user")
    public String user() {
        return "Welcome to user";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome to admin";
    }


}
