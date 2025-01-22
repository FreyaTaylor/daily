package com.example.daily.entity;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseMessage<T> {
    private Integer code;
    private String message;
    private T data;


    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public ResponseMessage(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ResponseMessage<T> success(T data){
        return new ResponseMessage<>(HttpStatus.OK.value(),"success",data);
    }
}
