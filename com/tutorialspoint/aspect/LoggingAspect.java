package com.tutorialspoint.aspect;

import org.aspectj.lang.JoinPoint;
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
    public void LoggingAdvice(JoinPoint joinPoint){//standard terminology
        System.out.println("Advice run. Get Method called.");
        System.out.println(joinPoint);//joinpoint provides information on the method that triggered this logging advice.
        Circle circle = (Circle) joinPoint.getTarget();// you can also get the object through getTarget.
    }

    @Before("args(name)")
    public void stringArgumentMethodAdvice(String name){
        System.out.println(name+" string argument method advice called.");
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
