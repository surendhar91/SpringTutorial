package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TextEditor {

    private SpellChecker spellChecker;
    @Autowired(required = false)//if set to false, then the value will not be set.
    private String name;

    @Autowired
    public TextEditor(@Qualifier(value = "spellChecker1")SpellChecker spellChecker) {
        //@Qualifier(value = "spellChecker1") before the constructor
        //if the name is not specified in the constructor-arg, then on autowiring exception will be thrown.
        System.out.println("Inside text editor constructor");
        this.spellChecker = spellChecker;
    }


    @Override
    public String toString() {
        return "TextEditor{" +
                "spellChecker=" + spellChecker +
                ", name='" + name + '\'' +
                '}';
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}