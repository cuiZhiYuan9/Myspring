package com.cui.Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class application01 {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubboprovider.xml");
        System.out.println(context.getDisplayName()+":here");
        context.start();
        System.out.println("服务已经启动");
        System.in.read();
    }
}