package sk.varga.martin.gl1.shape.impl;

import sk.varga.martin.gl1.shape.Shape;
import sk.varga.martin.gl1.shape.ShapeType;

public class Rectangle implements Shape {

    public Rectangle(final double aLength, final double bLength) {
        this();
        this.aLength = aLength;
        this.bLength = bLength;
        this.title = TITLE_PREFIX + COUNT;
    }

    public Rectangle() {
        COUNT++;
    }

    private final static String TITLE_PREFIX = "Rectangle_";
    private static int COUNT = 0;
    private static final ShapeType type = ShapeType.RECTANGLE;

    public double getaLength() {
        return aLength;
    }

    public void setaLength(double aLength) {
        this.aLength = aLength;
    }

    public double getbLength() {
        return bLength;
    }

    public void setbLength(double bLength) {
        this.bLength = bLength;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private double aLength;
    private double bLength;
    private String title;

    public double ContentOfShape() {
        return aLength * bLength;
    }

    public double CircumferenceOfShape() {
        return aLength * 2 + bLength * 2;
    }

    public double DiagonalOfShape() {
        return Math.sqrt(Math.pow(aLength, 2) + Math.pow(bLength, 2));
    }

    public String getShapeType() {
        return type.getEnumValue();
    }
}
