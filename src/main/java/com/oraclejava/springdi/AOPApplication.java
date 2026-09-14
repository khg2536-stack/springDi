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
        Triangle t = ss.getTriangle();
        Person p = ctx.getBean("hurjae", Person.class);

        //Person p = new Person();와 같은 형태는 객체를 새로 만드는 것이기때문에
        //System.out.println(p.getName());과 같은 형태는 아예 새로운 객체 생성이다.

        System.out.println(c);
        System.out.println(t);
        System.out.println(p.getName());
        System.out.println(p.getAddr());
        System.out.println(p.getAge());
        System.out.println(p.getNoteBook().getBrand());
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
