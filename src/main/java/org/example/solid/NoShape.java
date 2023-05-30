package org.example.solid;

public class NoShape implements Shape{

    @Override
    public double area() {
        throw new IllegalStateException("No shape");
    }
}
