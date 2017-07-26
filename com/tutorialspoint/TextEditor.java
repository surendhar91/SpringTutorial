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
    public void setName(String name) {
        this.name = name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}