package com.tutorialspoint.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
    //Cross cutting concerns are the secondary requirement / system wide requirements for our application.
    // Example: logging, security, data transfer, authentication/authorization of method calls, transaction management etc..
    @Before("execution(public String com.tutorialspoint.aspect.Circle.getName())")
    public void LoggingAdvice(){//standard terminology
        System.out.println("Advice run. Get Method called.");
    }
}
