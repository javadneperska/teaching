package sk.varga.martin.gl1.shape.impl;

import sk.varga.martin.gl1.shape.Shape;
import sk.varga.martin.gl1.shape.ShapeType;

public class Circle implements Shape {

    public Circle(final double radius){
        this();
        this.radius = radius;
        this.title = TITLE_PREFIX + COUNT;
    }

    public Circle(){
        COUNT++;
    }

    private final static String TITLE_PREFIX = "Circle_";
    private static int COUNT = 0;
    private static final ShapeType type = ShapeType.CIRCLE;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private String title;
    private double radius;

    public double ContentOfShape(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double CircumferenceOfShape(){
        return 2 * Math.PI * radius;
    }

    public double DiagonalOfShape(){
        return 0;
    }

    public String getShapeType() {
        return type.getEnumValue();
    }
}
