package org.spring.example4.beans;

import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    public Person() {

        System.out.println("cons executed."+this.getClass());
    }
}
