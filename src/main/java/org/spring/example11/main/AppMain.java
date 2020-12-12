package org.spring.example11.main;


import org.spring.example11.beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.spring.example11");

        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.

        Person p = context.getBean(Person.class);
        System.out.println(p);
    }
}
