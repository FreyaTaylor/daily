package com.example.daily;

import com.example.daily.entity.testwjx.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // 加载 Spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 获取 People 对象
        People people = (People) context.getBean("people");

        // 测试输出
        System.out.println(people);

        // 测试git

    }
}
