package com.strzal.users.controller;

import com.strzal.users.entity.User;
import com.strzal.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable int id) {
        return userRepository.findById(id);
    }

    @PostMapping("/")
    public User setUser(@RequestBody User user){
        return userRepository.save(user);
    }

}
