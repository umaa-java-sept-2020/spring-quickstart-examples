package org.spring.example4.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AppMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.spring.example4");
        // scans the package (sub package) of org.spring.example4, to find classes having annotations

        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.

        String[] beanNames = context.getBeanDefinitionNames();

        System.out.println(Arrays.toString(beanNames));
    }
}
