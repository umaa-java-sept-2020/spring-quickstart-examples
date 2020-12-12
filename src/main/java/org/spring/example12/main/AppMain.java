package org.spring.example12.main;


import org.spring.example12.beans.Address;
import org.spring.example12.beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.spring.example12");

        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.

        Person p = context.getBean(Person.class);
        System.out.println(p);

        Address a = context.getBean(Address.class);
        System.out.println(a);

        p.setAddress(a);
    }
}
