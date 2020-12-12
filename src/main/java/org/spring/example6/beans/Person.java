package org.spring.example6.beans;

import org.springframework.stereotype.Component;

public class Person {

    private String name;
    private Address address;
    public Person() {

        name = "john";
        System.out.println("cons executed."+this.getClass());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
