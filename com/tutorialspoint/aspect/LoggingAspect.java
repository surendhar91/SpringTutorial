package com.tutorialspoint.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
    //Cross cutting concerns are the secondary requirement / system wide requirements for our application.
    // Example: logging, security, data transfer, authentication/authorization of method calls, transaction management etc..
    @Before("allGetters() && allCircleMethods()")
    //(*) - one ore more arguments
    //(..) - zero or more arguments
    //() - zero arguments
    public void LoggingAdvice(){//standard terminology
        System.out.println("Advice run. Get Method called.");
    }

    @Before("allGetters()")
    public void secondAdvice(){
        System.out.println("Second advice running..");
    }
    @Pointcut("execution(public * get*())")
    public void allGetters(){//define this expression and use it.

    }

    @Pointcut("within(com.tutorialspoint.aspect.Circle)")
    public void allCircleMethods(){

    }
    //@Pointcut("within(com.tutorialspoint.aspect.*)")    find all the methods in this root package.
    @Pointcut("within(com.tutorialspoint..*)")//all the methods in the subpackages as well.
    public void allMethods(){

    }
    //@Pointcut(args()) find all the methods which takes this as argument.
}
