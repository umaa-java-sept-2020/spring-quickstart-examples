package org.spring.example3.beans;

import org.springframework.stereotype.Component;

@Component("addressBean") // stereo annotations
public class Address {

    public Address()
    {
        System.out.println("cons executed."+this.getClass());
    }
}
