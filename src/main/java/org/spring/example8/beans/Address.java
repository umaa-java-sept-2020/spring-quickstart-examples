package org.spring.example8.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component // stereo annotations
public class Address {

    public Address()
    {
        System.out.println("cons executed."+this.getClass());
    }

    @PostConstruct
    public void init()
    {
        System.out.println("init for: "+this.getClass());
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("pre-destroy for: "+this.getClass());
    }
}
