package com.oraclejava.springdi;

import org.springframework.stereotype.Component;

@Component
public class Circle {
    private String name;

    public Circle(String name) {
        this.name = name;
    }

    public Circle() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
