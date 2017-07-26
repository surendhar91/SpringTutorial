package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("=======================");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
        System.out.println(textEditor);
        /*JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();*/

        context.registerShutdownHook();
    }
}
