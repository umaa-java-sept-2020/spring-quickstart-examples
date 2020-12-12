package org.spring.example3.beans;

import org.springframework.stereotype.Component;

@Component("personBean") // give custom name to resolve conflict with same bean name person coming from example2
public class Person {

    public Person() {

        System.out.println("cons executed."+this.getClass());
    }
}
