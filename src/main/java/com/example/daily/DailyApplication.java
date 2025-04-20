package com.example.daily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
public class DailyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyApplication.class, args);
	}

}