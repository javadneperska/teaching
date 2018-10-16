package sk.moravcik.kristian.gl1.hw7;

import java.util.Arrays;
import java.util.List;

public class Rectangle implements Shape {
    private final double width, length;

    public Rectangle() {
        this(1,1);
    }
    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return 2 * (width + length);
    }

    List<String> toCsv() {
        return Arrays.asList("rectangle", String.valueOf(this.width), String.valueOf(this.length), "area:" + String.valueOf(area()), "perimeter:" + String.valueOf(perimeter()));
    }

}