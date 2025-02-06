package com.example.daily.common;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseMessage<T> {
    private Boolean success;
    private Integer code;
    private String message;
    private T data;
    private Long timestamp;

    private ResponseMessage() {
        this.timestamp = System.currentTimeMillis();
    }

    public static <T> ResponseMessage<T> success() {
        return success(null);
    }

    public static <T> ResponseMessage<T> success(T data) {
        ResponseMessage<T> response = new ResponseMessage<>();
        response.setSuccess(true);
        response.setCode(HttpStatus.OK.value());
        response.setMessage("操作成功");
        response.setData(data);
        return response;
    }

    public static <T> ResponseMessage<T> error(Integer code, String message) {
        ResponseMessage<T> response = new ResponseMessage<>();
        response.setSuccess(false);
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    public static <T> ResponseMessage<T> error(String message) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
    }
}
