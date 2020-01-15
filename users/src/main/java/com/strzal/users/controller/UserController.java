package com.strzal.users.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("/{id}")
    String getUser(@PathVariable int id) {
        return "User id:  " + id;
    }

    @PostMapping("/")
    String setUser(){
        return "User";
    }

}
