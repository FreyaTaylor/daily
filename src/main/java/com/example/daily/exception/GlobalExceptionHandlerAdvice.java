package com.example.daily.exception;


import com.example.daily.entity.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlerAdvice {

    Logger log = LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);
    @ExceptionHandler({Exception.class})
    public ResponseMessage handlerException(Exception e, HttpServletRequest request, HttpServletResponse response){
        log.error("统一异常");
        return new ResponseMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(),"error",null);
    }
}
