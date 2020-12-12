package org.spring.example6.beans;

import org.springframework.stereotype.Component;

public class Address {

    public Address()
    {
        System.out.println("cons executed."+this.getClass());
    }
}
