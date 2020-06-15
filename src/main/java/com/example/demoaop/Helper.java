package com.example.demoaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {

    @Before("execution(public void show())")
    public void logBefore(){
        System.out.println("Hello");
    }

    @After("execution(public void show())")
    public void logAfter(){
        System.out.println("Bye");
    }
}
