package com.oraclejava.springdi;

import org.springframework.stereotype.Component;

@Component
public class Triangle {

    private String name = "오니기리";

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
