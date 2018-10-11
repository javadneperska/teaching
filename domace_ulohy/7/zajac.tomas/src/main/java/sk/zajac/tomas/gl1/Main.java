package sk.zajac.tomas.gl1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String INPUT_CSV_FILE = "src/main/resources/Geometry.csv";
    private static final String OUTPUT_CSV_FILE = "src/main/resources/GeometryResults.csv";

    public static void main(String[] args) {

        List<String[]> inputFromCSV = CSVOperations.parseCSV(INPUT_CSV_FILE);

        List<String[]> calculatedGeometryObjects = calculateGeometryOfObject(inputFromCSV);

        CSVOperations.writeToCSV(OUTPUT_CSV_FILE, calculatedGeometryObjects);
    }

    /**
     * Function will split input according to geometry objects and calculates their operations
     * @param inputFromCSV parsed CSV file as List of String arrays
     * @return List of lines prepared to write to CSV file
     */
    private static List<String[]> calculateGeometryOfObject(List<String[]> inputFromCSV) {

        List<String[]> geometryCalculated = new ArrayList<>();

        for (String[] input :
                inputFromCSV) {

            switch (input[0]) {
                case "square":
                    Square square = createSquare(input);

                    double squareArea = square.squareArea();
                    double squarePerimeter = square.squarePerimeter();
                    double squareDiagonal = square.squareDiagonal();

                    String[] squareData = {"square", String.valueOf(squareArea), String.valueOf(squarePerimeter), String.valueOf(squareDiagonal)};
                    geometryCalculated.add(squareData);
                    break;
                case "rectangle":
                    Rectangle rectangle = createRectangle(input);

                    double rectangleArea = rectangle.rectangleArea();
                    double rectanglePerimeter = rectangle.rectanglePerimeter();
                    double rectangleDiagonal = rectangle.rectangleDiagonal();

                    String[] rectangleData = {"rectangle", String.valueOf(rectangleArea), String.valueOf(rectanglePerimeter), String.valueOf(rectangleDiagonal)};
                    geometryCalculated.add(rectangleData);
                    break;
                case "triangle":
                    Triangle triangle = createTriangle(input);

                    double triangleArea = triangle.triangleArea();
                    double trianglePerimeter = triangle.trianglePerimeter();
                    double triangleHeight = triangle.triangleHeight();

                    String[] triangleData = {"triangle", String.valueOf(triangleArea), String.valueOf(trianglePerimeter), String.valueOf(triangleHeight)};
                    geometryCalculated.add(triangleData);
                    break;
                case "circle":
                    Circle circle = createCircle(input[1]);

                    double circleArea = circle.circleArea();
                    double circlePerimeter = circle.circlePerimeter();
                    double circleDiagonal = circle.circleDiameter();

                    String[] circleData = {"circle", String.valueOf(circleArea), String.valueOf(circlePerimeter), String.valueOf(circleDiagonal)};
                    geometryCalculated.add(circleData);
                    break;
                default:
                    System.out.println("This is not a geometry object!");
            }
        }
        return geometryCalculated;
    }

    private static Circle createCircle(String s) {
        Circle circle = new Circle();
        circle.setRadius(Integer.parseInt(s));
        System.out.println(circle);
        return circle;
    }

    private static Triangle createTriangle(String[] input) {
        Triangle triangle = new Triangle();
        triangle.setSideA(Integer.parseInt(input[1]));
        triangle.setSideB(Integer.parseInt(input[2]));
        triangle.setSideC(Integer.parseInt(input[3]));
        System.out.println(triangle);
        return triangle;
    }

    private static Rectangle createRectangle(String[] input) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(Integer.parseInt(input[1]));
        rectangle.setWidth(Integer.parseInt(input[2]));
        System.out.println(rectangle);
        return rectangle;
    }

    private static Square createSquare(String[] input) {
        Square square = new Square();
        square.setWidth(Integer.parseInt(input[1]));
        System.out.println(square);
        return square;
    }
}