package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Required;

public class TextEditor {
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    @Required
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    private SpellChecker spellChecker;
    private String name;

    public TextEditor() {
        System.out.println("Inside text editor constructor");
    }

    public String getName() {
        return name;
    }

    @Required
    //applies to bean property setter methods, must be populated in xml configuration file
    public void setName(String name) {
        this.name = name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}