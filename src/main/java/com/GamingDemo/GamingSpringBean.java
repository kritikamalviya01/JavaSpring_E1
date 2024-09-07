package com.GamingDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GamingSpringBean {
    public static void main(String[] args) {
        SpringApplication.run(GamingSpringBean.class, args);
       var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

       context.getBean(GamingConsole.class).up();
       context.getBean(GameRunner.class).run();
    }
}
