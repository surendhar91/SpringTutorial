package com.tutorialspoint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.soap.Text;

public class MainApp {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("=======================");
//        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
//        textEditor.spellCheck();
//        textEditor.setName("TextEditor1..");
//        System.out.println(textEditor);
        context.start();
        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
        context.stop();
        context.registerShutdownHook();
    }
}
