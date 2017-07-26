package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class TextEditor {


    private SpellChecker spellChecker;
    private String name;

    @Autowired
    public TextEditor(SpellChecker spellChecker,String name) {
        //if the name is not specified in the constructor-arg, then on autowiring exception will be thrown.
        System.out.println("Inside text editor constructor");
        this.spellChecker = spellChecker;
        this.name = name;
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