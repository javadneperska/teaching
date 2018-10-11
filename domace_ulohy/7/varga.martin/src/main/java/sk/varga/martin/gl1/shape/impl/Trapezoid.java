package sk.varga.martin.gl1.shape.impl;

import sk.varga.martin.gl1.shape.Shape;
import sk.varga.martin.gl1.shape.ShapeType;

public class Trapezoid implements Shape {

    public Trapezoid(final double aLength, final double bLength, final double cLength, final double dLength, final double aHeight) {
        this();
        this.aLength = aLength;
        this.bLength = bLength;
        this.cLength = cLength;
        this.dLength = dLength;
        this.aHeight = aHeight;
        this.title = TITLE_PREFIX + COUNT;
    }

    public Trapezoid() {
        COUNT++;
    }

    private final static String TITLE_PREFIX = "Trapezoid_";
    private static int COUNT = 0;
    private static final ShapeType type = ShapeType.TRAPEZOID;

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

    public double getcLength() {
        return cLength;
    }

    public void setcLength(double cLength) {
        this.cLength = cLength;
    }

    public double getdLength() {
        return dLength;
    }

    public void setdLength(double dLength) {
        this.dLength = dLength;
    }

    public double getaHeight() {
        return aHeight;
    }

    public void setaHeight(double aHeight) {
        this.aHeight = aHeight;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //S = (a+c)*v/2

    private double aLength;
    private double bLength;
    private double cLength;
    private double dLength;
    private double aHeight;
    private String title;

    public double ContentOfShape() {
        return (aLength + cLength) * aHeight / 2;
    }

    public double CircumferenceOfShape() {
        return aLength + bLength + cLength + dLength;
    }

    public double DiagonalOfShape() {
        return Math.sqrt(Math.pow(aLength, 2) + Math.pow(bLength, 2));
    }

    public String getShapeType() {
        return type.getEnumValue();
    }
}
