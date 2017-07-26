package com.tutorialspoint;

public class TextEditor {
    private SpellChecker spellChecker;
    private int txtID;
    public TextEditor(SpellChecker spellChecker, int txtID) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
        this.txtID = txtID;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
        System.out.println("Text Editor ID is "+this.txtID);
    }
}