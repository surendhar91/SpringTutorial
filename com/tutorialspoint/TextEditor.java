package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class TextEditor {

    @Resource(name="spellChecker1")//Autowiring by name
    /*
    * The @Resource annotation takes a 'name' attribute which will be interpreted as the bean name to be injected. You can say, it follows by-name autowiring semantics*/
    private SpellChecker spellChecker;

    @Autowired(required = false)//if set to false, then the value will not be set.
    private String name;

    public TextEditor() {
        //@Qualifier(value = "spellChecker1") before the constructor
        //if the name is not specified in the constructor-arg, then on autowiring exception will be thrown.
        System.out.println("Inside text editor constructor");
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

    @PostConstruct
    public void init(){
        System.out.println("--Text Editor Object Initialized--");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("--Text Editor Object destroyed--");
    }
}