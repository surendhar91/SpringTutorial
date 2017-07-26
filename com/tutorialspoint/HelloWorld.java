package com.tutorialspoint;

public class HelloWorld {

    public void getMessage1() {
        System.out.println("World Message1 : " + message1);
    }

    public void getMessage2() {
        System.out.println("World Message2: " + message2);
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    private String message1, message2;

    public void myInitializer() {
        System.out.println("-- Object Initialized --");
    }

    public void myDestroyer() {
        System.out.println("-- Object Destroyed --");
    }
}
