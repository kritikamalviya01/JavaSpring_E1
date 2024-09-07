package com.springDemo.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){};

record Address(String firstLine, String city){};

@Configuration
public class ApplicationConfiguration {

    @Bean
    public String name(){
        return "Kritika's First Spring Project";
    }

    @Bean
    public int age(){
        return 23;
    }

    @Bean
    public Person person(){
        return new Person("Kritika", 23, new Address("Main Street", "London"));
    }

    @Bean
    public Person person2(){
        return new Person(name(), age(), address());
    }

    @Bean
    @Primary
    public Person person3Parameter(String name, int age, Address address){
        return new Person(name, age, address3());
    }

    // We can give custom Name to bean
    @Bean(name = "Add2")
    @Qualifier("Address2")
    public Address address(){
        return new Address("Santacruz","Mumbai");
    }

    @Bean
    @Primary
    public Address address3(){
        return new Address("Khar","Mumbai");
    }
}
