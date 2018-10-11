package sk.varga.martin.gl1;

import sk.varga.martin.gl1.shape.Shape;
import sk.varga.martin.gl1.util.Utils;

import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Shape> shapes = Utils.loadShapes();
        for (Shape shape : shapes){
            Utils.printResults(shape);
        }
    }
}
