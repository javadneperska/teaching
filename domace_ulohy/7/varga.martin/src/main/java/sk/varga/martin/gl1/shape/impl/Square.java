package sk.varga.martin.gl1.shape.impl;

import sk.varga.martin.gl1.shape.Shape;
import sk.varga.martin.gl1.shape.ShapeType;

public class Square implements Shape {

    public Square(final double aLength){
        this();
        this.aLength = aLength;
        this.title = TITLE_PREFIX + COUNT;
    }

    public Square(){
        COUNT++;
    }

    private final static String TITLE_PREFIX = "Square_";
    private static int COUNT = 0;
    private static final ShapeType type = ShapeType.SQUARE;

    public double getaLength() {
        return aLength;
    }

    public void setaLength(double aLength) {
        this.aLength = aLength;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private double aLength;
    private String title;

    public double ContentOfShape() {
        return Math.pow(aLength, 2);
    }

    public double CircumferenceOfShape() {
        return aLength * 4;
    }

    public double DiagonalOfShape() {
        return Math.sqrt(2 * Math.pow(aLength, 2));
    }

    public String getShapeType() {
        return type.getEnumValue();
    }
}
