package sk.moravcik.kristian.gl1.hw7;

import java.util.Arrays;
import java.util.List;

public class Circle implements Shape {
    private final double radius;
    private final double pi = Math.PI;

    public Circle() {
        this(1);
    }
    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return pi * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * pi * radius;
    }

    List<String> toCsv() {
        return Arrays.asList("circle", String.valueOf(this.radius), "area:" + String.valueOf(area()), "perimeter:" + String.valueOf(perimeter()));
    }
}