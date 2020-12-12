package org.spring.example7.config;

import org.spring.example7.beans.Address;
import org.spring.example7.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.spring.example2", "org.spring.example7"}) // to catch beans with stereo annotations defined inthe package or sub package
public class AppConfig {


    @Bean(name = "personBean") // to make the return type as spring bean
    public Person getPerson() {
        return new Person();
    }

    @Bean
    public Address getAddress() {
        return new Address();
    }
}
