package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        //Inversion of control

        //as and when the beans.xml is loaded, all the objects will be instantiated.
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        //only when you call the getBean method, the object will be instantiated.
//        Resource resource = new ClassPathResource("Beans.xml");
//        BeanFactory context = new XmlBeanFactory(resource);

        HelloWorld instance1 = (HelloWorld) context.getBean("helloWorld");
        instance1.setMessage("Instance 1");
        instance1.getMessage();

        HelloWorld instance2 = (HelloWorld) context.getBean("helloWorld");
        instance2.getMessage();
        context.registerShutdownHook();
        //register the shutdown hook with jvm, so that the resources get destroyed.
    }
}
