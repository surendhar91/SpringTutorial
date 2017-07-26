package com.tutorialspoint;

import org.springframework.aop.scope.DefaultScopedObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
/*
the class can be used by the Spring IoC container as a source of bean definitions.
* */
public class BeanConfig {
    @Bean("textEditor")
    //NOTE: Even if you have multiple bean names, if the scope of bean is singleton, when getting the bean you will get only one instance..
    //a method annotated with @Bean will return an object that should be registered as a bean in the Spring application context.
    @Lazy
    public TextEditor textEditor(){
        return new TextEditor();
    }
    @Bean({"spellChecker2","spellChecker1"})
    //Bean names are essentially alias, here spellChecker2 is the id, then we can specify textEditor2 were the alias.
    @Lazy
    public SpellChecker spellChecker(){
        return new SpellChecker();
    }

}
