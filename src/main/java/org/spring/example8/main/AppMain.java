package org.spring.example8.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.spring.example8");

        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.

        context.registerShutdownHook(); // this will terminate the bean context gracefully. @PreDestroy callbacks will execute
    }
}
