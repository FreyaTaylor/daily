package com.example.daily.service;

import com.example.daily.entity.User;
import com.example.daily.entity.dto.UserDto;
import com.example.daily.repository.UserRepository;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service("UserB")
public class UserBServiceImp implements UserService{

    @Resource
    UserRepository userRepository;

    public User add(UserDto userDto){
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        userRepository.save(user);
        return user;
    }

}
