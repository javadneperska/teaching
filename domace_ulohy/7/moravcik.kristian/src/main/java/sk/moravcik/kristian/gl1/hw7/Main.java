package sk.moravcik.kristian.gl1.hw7;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String csvFile = "Shapes.csv";
        String csvFileOut = "ShapesOut.csv";
        String line;
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            FileWriter writer = new FileWriter(csvFileOut);

            while ((line = br.readLine()) != null) {

                String[] shapes = line.split(cvsSplitBy);
                switch (shapes[0]) {
                    case "rectangle":
                        Rectangle r = new Rectangle(Double.parseDouble(shapes[1]), Double.parseDouble(shapes[2]));
                        CSVUtils.writeLine(writer, r.toCsv());
                        break;
                    case "circle":
                        Circle c = new Circle(Double.parseDouble(shapes[1]));
                        CSVUtils.writeLine(writer, c.toCsv());
                        break;
                    case "triangle":
                        Triangle t = new Triangle(Double.parseDouble(shapes[1]), Double.parseDouble(shapes[2]), Double.parseDouble(shapes[3]));
                        CSVUtils.writeLine(writer, t.toCsv());
                        break;
                    default:
                        break;
                }
            }

            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}