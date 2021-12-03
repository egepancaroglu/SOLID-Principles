package com.example.solidprinciples.openclosed;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle implements Shape {
    private double length;
    private double height;

    // getters/setters …
    @Override
    public double getArea() {
        return (length * height);
    }
}

