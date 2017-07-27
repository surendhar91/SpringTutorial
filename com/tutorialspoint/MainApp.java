package com.tutorialspoint;

import com.tutorialspoint.aspect.ShapeService;
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
        /*JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();*/
        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
        shapeService.getCircle().setName("surendhar");
//        System.out.println(shapeService.getCircle().getName());
        try {
            shapeService.exceptionMethod();
        }catch (Exception ex){

        }
        context.registerShutdownHook();
    }
}
