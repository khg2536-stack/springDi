package com.oraclejava.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

    private String name;
    private String addr;
    private int age;

    @Autowired
    @Qualifier("n1")
    private NoteBook noteBook;

    public Person() {

    }

    public NoteBook getNoteBook() {
        return noteBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
