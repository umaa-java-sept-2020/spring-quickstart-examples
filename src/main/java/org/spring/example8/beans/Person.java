package org.spring.example8.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Person {

    public Person() {

        System.out.println("cons executed."+this.getClass());
    }

    @PostConstruct
    public void init()
    {
        System.out.println("init for"+this.getClass());
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("pre-destroy bean"+ this.getClass());
    }
}
