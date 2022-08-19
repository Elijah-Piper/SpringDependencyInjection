package org.genspark;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    public Student getStudent() {
        return new Student();
    }

    @Bean
    @Primary
    public Phone getPhone() {
        return new Phone();
    }

    @Bean
    @Primary
    public Address getAddress() {
        return new Address();
    }

}
