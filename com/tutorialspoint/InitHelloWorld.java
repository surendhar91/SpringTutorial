package com.tutorialspoint;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor{

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //before init method of bean getting called.
//        ((HelloWorld)bean).getMessage1();
//        System.out.println("Post process before initialization of bean "+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //after init method of bean getting called.
//        System.out.println("Post process after initialization of bean "+beanName);
        return bean;
    }
}
