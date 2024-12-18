package org.example.logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;

@Aspect
public class Logging {

    @Before("execution(public void org.example.service.UserService.login())")
    public void loggingAdvice1(){
        System.out.println("This is before the execution of the login method");
    }

    @After("execution(public void org.example.service.UserService.login())")
    public void loggingAdvice2(){
        System.out.println("This is after the execution of the login method");
    }
}
