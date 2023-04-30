package com.example.game.dto;

import com.example.game.models.User;
import lombok.Data;

@Data
public class UserDto {
    public String token;
    public User user;
}
