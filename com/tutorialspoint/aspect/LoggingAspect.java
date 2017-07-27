package com.tutorialspoint.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
    //Cross cutting concerns are the secondary requirement / system wide requirements for our application.
    // Example: logging, security, data transfer, authentication/authorization of method calls, transaction management etc..
    @Before("execution(public * get*())")
    //(*) - one ore more arguments
    //(..) - zero or more arguments
    //() - zero arguments
    public void LoggingAdvice(){//standard terminology
        System.out.println("Advice run. Get Method called.");
    }

    @Before("execution(public * get*())")
    public void secondAdvice(){
        System.out.println("Second advice running..");
    }
}
