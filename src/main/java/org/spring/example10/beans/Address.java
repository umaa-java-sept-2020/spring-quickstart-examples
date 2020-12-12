package org.spring.example10.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // stereo annotations
@Scope("prototype")
public class Address {

    public Address()
    {
        System.out.println("cons executed."+this.getClass());
    }
}
