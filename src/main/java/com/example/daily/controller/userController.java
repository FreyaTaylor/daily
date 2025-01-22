package com.example.daily.controller;


import com.example.daily.entity.ResponseMessage;
import com.example.daily.entity.User;
import com.example.daily.entity.dto.UserDto;
import com.example.daily.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class userController {


    @Resource(name = "UserB")
    UserService userService;


    @PostMapping
    @ResponseBody
    public ResponseMessage<User> add(@Validated  @RequestBody UserDto user){
        User userRes = userService.add(user);

        ResponseMessage<User> response = ResponseMessage.success(userRes);
        return response;
    }

    @GetMapping("/get")
    @ResponseBody
    public String get(){

        return "happy";
    }





}
