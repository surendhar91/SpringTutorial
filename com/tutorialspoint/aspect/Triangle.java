package com.tutorialspoint.aspect;

public class Triangle {
    private String name;

    public String getName() {
        return name;
    }
    @Loggable
    public void setName(String name) {
        this.name = name;
    }
}
