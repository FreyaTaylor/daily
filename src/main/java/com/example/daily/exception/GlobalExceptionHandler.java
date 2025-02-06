package com.example.daily.exception;

import com.example.daily.common.ResponseMessage;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    public ResponseMessage<?> handleServiceException(ServiceException e) {
        return ResponseMessage.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseMessage<?> handleException(Exception e) {
        return ResponseMessage.error(500, "系统内部错误：" + e.getMessage());
    }
} 