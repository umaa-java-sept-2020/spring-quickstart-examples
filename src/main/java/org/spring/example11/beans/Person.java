package org.spring.example11.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Value("${person_fullname}")
    private String name;
    @Value("${person_age:40}")
    private Integer age;
    @Value("${person_salary:2500.67}") // default value is 2500.67 if not given from properties
    private Double salary;

    public Person() {

        System.out.println("cons executed."+this.getClass());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
