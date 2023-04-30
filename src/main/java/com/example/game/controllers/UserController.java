package com.example.game.controllers;

import com.example.game.models.User;
import com.example.game.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        userService.saveUser(user);
        return "Added successfully!";
    }
    @GetMapping("/getAll")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }
}
