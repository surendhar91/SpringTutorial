package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//        helloWorld.getMessage1();
//        helloWorld.getMessage2();

        HelloIndia helloIndia = (HelloIndia) context.getBean("helloIndia");
        helloIndia.getMessage1();
        helloIndia.getMessage2();
        helloIndia.getMessage3();

        context.registerShutdownHook();
    }
}
