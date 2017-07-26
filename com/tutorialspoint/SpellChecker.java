package com.tutorialspoint;

public class SpellChecker {
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
}
