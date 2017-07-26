package com.tutorialspoint;

import javax.xml.soap.Text;

public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    public TextEditor(SpellChecker spellChecker, String name){
        System.out.println("Inside text editor constructor");
        this.spellChecker = spellChecker;
        this.name = name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}