package com.springDemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringDemo1Application {

    public static void main(String[] args) {

        // 1: Launch a Spring Context
        SpringApplication.run(SpringDemo1Application.class, args);

        try (var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
            // 2: Configure things that we want spring to manage
            //ApplicationConfiguration -> @Configuration
            //name - Bean

            // 3: Retrieving Beans manage by Spring
            System.out.println(context.getBean("name"));

            System.out.println(context.getBean("age"));

            System.out.println(context.getBean("person"));

            System.out.println(context.getBean("person2"));

            System.out.println(context.getBean("person3Parameter"));

            System.out.println(context.getBean("Add2"));

            // Using type of bean to print
            System.out.println(context.getBean(Address.class));

            System.out.println(context.getBean(Person.class));

//		context.getBeanDefinitionNames();
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBeanDefinitionCount());

        }


    }

}
