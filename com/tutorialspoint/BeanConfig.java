package com.tutorialspoint;

import org.springframework.aop.scope.DefaultScopedObject;
import org.springframework.context.annotation.*;

@Configuration
/*
the class can be used by the Spring IoC container as a source of bean definitions.
* */
public class BeanConfig {
    @Bean
    //NOTE: Even if you have multiple bean names, if the scope of bean is singleton, when getting the bean you will get only one instance..
    //a method annotated with @Bean will return an object that should be registered as a bean in the Spring application context.
    public TextEditor textEditor(){
        return new TextEditor();
    }
    @Bean
    @Primary
    @Lazy
    //Bean names are essentially alias, here spellChecker2 is the id, then we can specify textEditor2 were the alias.
    public SpellChecker dictSpellChecker(){
        return new SpellChecker();
    }
    @Bean
    @Lazy
    public SpellChecker normalSpellChecker(){
        return new SpellChecker();
    }

}
