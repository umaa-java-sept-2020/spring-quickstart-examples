package org.spring.example6.config;

import org.spring.example6.beans.Address;
import org.spring.example6.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
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
