package com.tutorialspoint;

import org.springframework.beans.factory.BeanNameAware;

public class SpellChecker implements BeanNameAware {
    public SpellChecker(){
        System.out.println("Inside SpellChecker constructor." );
    }
    public void checkSpelling() {
        System.out.println("Inside checkSpelling." );
    }

    @Override
    public String toString() {
        return "SpellChecker{}";
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is "+name);
    }
}
