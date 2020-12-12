package org.spring.example6.main;


import org.spring.example6.beans.Address;
import org.spring.example6.beans.Person;
import org.spring.example6.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AppMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class); // JAVA CONFIG

        String[] beanNames = context.getBeanDefinitionNames();

        System.out.println(Arrays.toString(beanNames));

        Address a = context.getBean(Address.class);
        Person p = context.getBean("personBean", Person.class);
                // context.getBean("personBean1",Person.class); // NoSuchBeanDefinitionException: No bean named 'personBean1' available

        System.out.println(a.hashCode());
        System.out.println(p.hashCode());

        System.out.println(p.getName());
        System.out.println(p.getAddress());
    }
}
