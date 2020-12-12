package org.spring.example3.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        String[] basePackages = {"org.spring.example3", "org.spring.example2"};
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(basePackages);

        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.

        System.out.println(context.getClass());

    }
}
