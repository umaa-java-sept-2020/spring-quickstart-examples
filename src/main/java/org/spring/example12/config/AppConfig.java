package org.spring.example12.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // this is reuired to resolve $ symbols in @Value annotations, default values injected.
@PropertySource("person-data-11.properties")
public class AppConfig {


}
