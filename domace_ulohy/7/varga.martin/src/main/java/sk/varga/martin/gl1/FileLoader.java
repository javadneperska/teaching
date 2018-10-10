package sk.varga.martin.gl1;

import sk.varga.martin.gl1.shape.Shape;
import org.apache.commons.io.IOUtils;
import sk.varga.martin.gl1.shape.ShapeType;
import sk.varga.martin.gl1.shape.impl.Circle;
import sk.varga.martin.gl1.shape.impl.Rectangle;
import sk.varga.martin.gl1.shape.impl.Square;
import sk.varga.martin.gl1.shape.impl.Trapezoid;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class FileLoader {

    public List<Shape> loadShapes(String fileName) throws IOException {
        List<Shape> shapes = new ArrayList<Shape>();

        InputStream inputStream = FileLoader.class.getResourceAsStream("/" + fileName);
        if(inputStream == null){
            throw  new FileNotFoundException("unable to find resource:" + fileName);
        }

        String resourceString = "";

        try {
            resourceString = IOUtils.toString(inputStream, Charset.defaultCharset());
        }
        finally {
            inputStream.close();
        }

        String[] shapesStrings = resourceString.split("\r\n");

        for (int i = 0; i < shapesStrings.length; i++) {
            String[] shapeProperties = shapesStrings[i].split(",");

            ShapeType type = ShapeType.fromString(shapeProperties[0]);

            assert type != null;

            Shape shape = null;
            switch (type){
                case CIRCLE:
                    shape = new Circle(Double.valueOf(shapeProperties[1]));
                    break;
                case RECTANGLE:
                    shape = new Rectangle(Double.valueOf(shapeProperties[1]), Double.valueOf(shapeProperties[2]));
                    break;
                case SQUARE:
                    shape = new Square(Double.valueOf(shapeProperties[1]));
                    break;
                case TRAPEZOID:
                    shape = new Trapezoid(Double.valueOf(shapeProperties[1]),Double.valueOf(shapeProperties[2]),Double.valueOf(shapeProperties[3]),Double.valueOf(shapeProperties[4]),Double.valueOf(shapeProperties[5]));
                    break;
                    default:
                        break;
            }

            shapes.add(shape);
        }
        return shapes;
    }
}
