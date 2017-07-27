package com.tutorialspoint.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

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

    @Around("@annotation(com.tutorialspoint.aspect.Loggable)")
    public Object stringArgumentMethodAdvice(ProceedingJoinPoint proceedingJoinPoint){
        //first argument should always be proceeding join point
        System.out.println("Before calling the string argument method");
        Object returnValue = null;
        try {
//            System.out.println(proceedingJoinPoint.getTarget()+"is the target");
            returnValue = proceedingJoinPoint.proceed();//now calls this method, get the return object and return it.
        } catch (Throwable throwable) {
            System.out.println("Exception thrown.."+throwable);
        }
        System.out.println("After calling the string argument method");
        return returnValue;
    }

    //@After - executes after the method execution (even when thrown excpetion this will be called)
    //@AfterReturning - only on successful method execution, this will be called
    //@AfterThrowing - after exception is thrown, call this method.

    @AfterThrowing(pointcut="allMethods()",throwing="ex")
    public void exceptionLog(Exception ex){
        System.out.println("Exception thrown.."+ex);
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
