package com.oraclejava.springdi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class StudentApplication implements CommandLineRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(StudentApplication.class, args);
        StudentService sa = ctx.getBean("studentService", StudentService.class);

        sa.registerStudent("홍길동");
        sa.updateStudent("홍길동");
        sa.deleteStudent("홍길동");

    }

    @Override
    public void run(String... args) throws Exception {

    }
}
