package com.tutorialspoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.beans.beancontext.BeanContext;

public class MainApp {
    public static void main(String[] args) {
        //Inversion of control

        //as and when the beans.xml is loaded, all the objects will be instantiated.
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        //only when you call the getBean method, the object will be instantiated.
//        Resource resource = new ClassPathResource("Beans.xml");
//        BeanFactory context = new XmlBeanFactory(resource);

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();
        ((ClassPathXmlApplicationContext)context).close();//calls the destroy method.
    }
}
