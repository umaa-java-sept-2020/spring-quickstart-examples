package org.spring.example5.main;


import org.spring.example5.beans.Address;
import org.spring.example5.beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AppMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.spring.example5");
        // scans the package (sub package) of org.spring.example4, to find classes having annotations

        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.

        String[] beanNames = context.getBeanDefinitionNames();

        System.out.println(Arrays.toString(beanNames));

        Address a = context.getBean(Address.class);
        Person p = context.getBean("personBean",Person.class);
                // context.getBean("personBean1",Person.class); // NoSuchBeanDefinitionException: No bean named 'personBean1' available

        System.out.println(a.hashCode());
        System.out.println(p.hashCode());

        System.out.println(p.getName());
        System.out.println(p.getAddress());
    }
}
