package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class TextEditor {


    @Autowired //always perform auto wiring byType
    private SpellChecker spellChecker;
    private String name;

    public TextEditor() {
        System.out.println("Inside text editor constructor");
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "spellChecker=" + spellChecker +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    //applies to bean property setter methods, must be populated in xml configuration file
    public void setName(String name) {
        this.name = name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}