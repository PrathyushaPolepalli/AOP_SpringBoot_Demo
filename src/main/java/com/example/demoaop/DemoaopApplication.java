package com.example.demoaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoaopApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoaopApplication.class, args);

        Demo d = context.getBean(Demo.class);

        d.show();
    }

}
