package com.tutorialspoint;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class TextEditor implements BeanNameAware{

    /*
    * The @Resource annotation takes a 'name' attribute which will be interpreted as the bean name to be injected. You can say, it follows by-name autowiring semantics*/
    private Job job;

    @Resource(name="spellChecker")
    private SpellChecker spellChecker;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "spellChecker=" + spellChecker +
                ", name='" + name + '\'' +
                '}';
    }

//    @Autowired @Qualifier("helloIndia")
//    private HelloIndia helloIndia; you cannot use both the configurations.



    @Autowired(required = false)//if set to false, then the value will not be set.
    private String name;

    public TextEditor(Job job) {
        this.job = job;
        //@Qualifier(value = "spellChecker1") before the constructor
        //if the name is not specified in the constructor-arg, then on autowiring exception will be thrown.
        System.out.println("Inside text editor constructor");
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

    @Override
    public void setBeanName(String name) {
        System.out.println("Text Bean name is "+name);
    }

}