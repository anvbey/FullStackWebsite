package com.example.fullstack_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.fullstack_backend.model.User;
import com.example.fullstack_backend.repository.UserRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getUsers(){
        return userRepository.findAll();
    }
}
