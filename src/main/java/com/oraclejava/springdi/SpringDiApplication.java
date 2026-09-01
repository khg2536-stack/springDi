package com.oraclejava.springdi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

// Web -> App
@ImportResource("classpath:SpringConfig.xml")
@SpringBootApplication
public  class SpringDiApplication implements CommandLineRunner {

    public static void main(String[] args){
        ConfigurableApplicationContext ctx =
            SpringApplication.run(SpringDiApplication.class, args);

        Person  person = ctx.getBean("hurjae", Person.class);
        System.out.println("이름 : " + person.getName());
        System.out.println("주소 : " + person.getAddr());
        System.out.println("나이 : " + person.getAge());

        /*NoteBook noteBook = ctx.getBean("LG그램", NoteBook.class);*/
        NoteBook noteBook = person.getNoteBook();
        System.out.println("브랜드 : " + noteBook.getBrand());
        System.out.println("아이디 : " + noteBook.getNid());

        ctx.close();
    }

    @Override
    public void run(String... args /*가변형인수*/) throws Exception {
        System.out.println();
    }
}


