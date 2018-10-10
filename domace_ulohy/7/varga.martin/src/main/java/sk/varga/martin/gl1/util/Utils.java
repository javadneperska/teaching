package sk.varga.martin.gl1.util;

import sk.varga.martin.gl1.FileLoader;
import sk.varga.martin.gl1.shape.Shape;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Shape> loadShapes(){
        List<Shape> shapes = new ArrayList<Shape>();

        FileLoader fileLoader = new FileLoader();
        try {
            shapes = fileLoader.loadShapes("shapes");
        } catch (IOException e) {
            System.out.println("Unable to load from file: shapes, add to resources");
        }
        return shapes;
    }

    @SuppressWarnings("ConstantConditions")
    public static void printResults(Shape shape) throws IOException {
        String shapeName = shape.getTitle();
        String shapeType = shape.getShapeType();
        double circum = shape.CircumferenceOfShape();
        double content = shape.ContentOfShape();
        double diagonal = shape.DiagonalOfShape();
        System.out.println("Shape: " + shapeName);
        System.out.println("Type: " + shapeType);
        System.out.println("Circum: " + circum);
        System.out.println("Content: " + content);
        System.out.println("Diagonal: " + diagonal);
        System.out.println("\n");

    }

}
