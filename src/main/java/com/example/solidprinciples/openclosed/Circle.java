package com.example.solidprinciples.openclosed;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle implements Shape {
    private double radius;

    // getters/setters …
    @Override
    public double getArea() {
        return (radius * radius * Math.PI);
    }
}
