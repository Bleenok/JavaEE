package com.AspectJ.aspectj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class AspectJ {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        G580 blade = (G580) applicationContext.getBean("blade");
        System.out.println(blade.getInfo());
        blade.setCondition("Fine");
    }
}