package com.example.daily.controller;

import com.example.daily.common.ResponseMessage;
import com.example.daily.exception.ServiceException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/success")
    public ResponseMessage<String> testSuccess() {
        return ResponseMessage.success("测试成功");
    }

    @GetMapping("/service-error")
    public ResponseMessage<String> testServiceException() {
        throw new ServiceException(400, "业务异常测试");
    }

    @GetMapping("/system-error")
    public ResponseMessage<String> testSystemException() {
        throw new RuntimeException("系统异常测试");
    }
} 