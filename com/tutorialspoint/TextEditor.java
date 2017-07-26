package com.tutorialspoint;

import javax.xml.soap.Text;

public class TextEditor {
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public TextEditor(){
        System.out.println("Inside TextEditor constructor.");
    }
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}