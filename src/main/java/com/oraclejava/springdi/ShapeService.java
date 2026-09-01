package com.oraclejava.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //어떠한 서비스를 할 것이다.
public class ShapeService {
    @Autowired
    private Circle circle;

    @Autowired
    private Triangle triangle;

    public Circle getCircle() {
        return circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }
}
