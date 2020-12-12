package org.spring.example2.beans;

import org.springframework.stereotype.Component;

@Component
public class Person {

    public Person() {

        System.out.println("cons executed."+this.getClass());
    }
}
