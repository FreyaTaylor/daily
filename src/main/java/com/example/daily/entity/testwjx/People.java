package com.example.daily.entity.testwjx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class People {
    private String name;
    private Cat cat;
    private Dog dog;

}
