package org.spring.example10.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {

    public Person() {

        System.out.println("cons executed."+this.getClass());
    }
}
