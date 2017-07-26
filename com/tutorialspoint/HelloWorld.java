package com.tutorialspoint;

public class HelloWorld {

    public void getMessage() {
        System.out.println("Your Message: "+this.message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public void myInitializer(){
        System.out.println("-- Object Initialized --");
    }
    public void myDestroyer(){
        System.out.println("-- Object Destroyed --");
    }
}
