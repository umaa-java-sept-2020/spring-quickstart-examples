package org.spring.example10.main;


import org.spring.example10.beans.Address;
import org.spring.example10.beans.Employee;
import org.spring.example10.beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.spring.example10");

        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.

        // prototype scope, need to specify the class with annotation @Scope. Here Address is prototype.
        // each request to context will give you different objects
        Address a = context.getBean(Address.class);
        Address a1 = context.getBean(Address.class);

        // both the address objects will not same as they are prototype scoped
        System.out.println(a==a1);
    }

    public static void singleTonScope(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.spring.example10");

        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.

        // singleton scope for a given context. only one instance of bean configuration is maintained for a given context.
        Person p = context.getBean(Person.class);
        Person p1 = context.getBean(Person.class);

        System.out.println(p == p1); // spring beans are by default singleton


        AnnotationConfigApplicationContext context1 =
                new AnnotationConfigApplicationContext("org.spring.example10");

        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.

        Person p11 = context1.getBean(Person.class);
        Person p12 = context1.getBean(Person.class);

        System.out.println(p11 == p12); // spring beans are by default singleton
        System.out.println(p11 == p1); // spring beans are by default singleton in a context only. not across the contexts.


    }
    public static void m1(String[] args) {



//        Employee e = new Employee();
//        e = new Employee(); 2 objects

        // Employee is a singleton class
        Employee e = Employee.getInstance();
        Employee e1 = Employee.getInstance();
      //  Employee e2 = new Employee();
        System.out.println(e == e1);

    }


}
