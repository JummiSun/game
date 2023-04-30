package com.example.game.services;

import com.example.game.models.User;


import java.util.List;
import java.util.Optional;

public interface UserService {
    public User saveUser(User user);
    List<User> getAllUser();

    Optional<User> getUser(Long id);
}
