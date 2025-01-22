package com.example.daily.entity.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    @NotNull
    @NotBlank(message = "不能为空")
    private String name;
    private int age;

    private Date birthday;
}
