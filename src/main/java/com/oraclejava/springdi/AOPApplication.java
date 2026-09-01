package com.oraclejava.springdi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AOPApplication implements CommandLineRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(AOPApplication.class, args);

        ShapeService ss = ctx.getBean("shapeService", ShapeService.class);
        Circle c = ss.getCircle();
        System.out.println(c);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
