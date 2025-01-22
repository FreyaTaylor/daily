package com.example.daily.service;

import com.example.daily.entity.User;
import com.example.daily.entity.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User add(UserDto user);
}
