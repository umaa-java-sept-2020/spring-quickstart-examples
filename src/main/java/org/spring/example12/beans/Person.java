package org.spring.example12.beans;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired // perform DEPENDENCY INJECTION: (initialized), constructor injection, property injection
    private Address address; //complex object as a dependency.

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
