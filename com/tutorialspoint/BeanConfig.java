package com.tutorialspoint;

import org.springframework.aop.scope.DefaultScopedObject;
import org.springframework.context.annotation.*;

@Configuration
/*
the class can be used by the Spring IoC container as a source of bean definitions.
* */
public class BeanConfig {
    @Bean
    public TextEditor textEditor(){
        return new TextEditor(createJob());
        //constructor injection is of best practice, it ensures that the object must be constructed with the dependency(even independent of spring)
        //without relying on some one to set the dependency through setter property
    }
    @Bean
    public SpellChecker dictSpellChecker(){
        return new SpellChecker();
    }
    @Bean(name="spellChecker")
    public SpellChecker normalSpellChecker(){
        return new SpellChecker();
    }
    @Bean(initMethod = "init",destroyMethod = "destroy")
    @Lazy
    public Job createJob(){
        return new Job();
    }

}
