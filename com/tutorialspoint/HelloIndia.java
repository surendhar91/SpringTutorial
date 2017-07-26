package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class HelloIndia {
    private String message1;
    private String message2;
    private String message3;

    public void getMessage1() {
        System.out.println("India Message1 : " + message1);
    }

    @Override
    public String toString() {
        return "HelloIndia{" +
                "message1='" + message1 + '\'' +
                ", message2='" + message2 + '\'' +
                ", message3='" + message3 + '\'' +
                '}';
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public void getMessage2() {
        System.out.println("India Message2 : " + message2);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void getMessage3() {
        System.out.println("India Message3 : " + message3);
    }

    public void setMessage3(String message3) {
        this.message3 = message3;
    }
}
