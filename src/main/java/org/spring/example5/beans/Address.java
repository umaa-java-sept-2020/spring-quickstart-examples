package org.spring.example5.beans;

import org.springframework.stereotype.Component;

@Component // stereo annotations
public class Address {

    public Address()
    {
        System.out.println("cons executed."+this.getClass());
    }
}
