package sk.moravcik.kristian.gl1.hw7;

import java.util.Arrays;
import java.util.List;

public class Triangle implements Shape {
    private final double a, b, c;

    public Triangle() {
        this(1,1,1);
    }
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter() {
        return a + b + c;
    }

    List<String> toCsv() {
        return Arrays.asList("triangle", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), "area:" + String.valueOf(area()), "perimeter:" + String.valueOf(perimeter()));
    }
}