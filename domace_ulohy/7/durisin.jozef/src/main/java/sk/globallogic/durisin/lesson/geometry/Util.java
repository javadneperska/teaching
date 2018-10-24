package sk.globallogic.durisin.lesson.geometry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;


/**
 * Utility class for polygon manipulation.
 */
public class Util {
    // Suppresses default constructor, ensuring non-instantiability.
    private Util() {
    }

    /**
     * Reads polygons from a file.
     *
     * @param fileName file name
     *
     * @return polygons
     *
     * @throws IOException if open/read error occurs
     */
    public static ArrayList<Parallelogram> readPolygons(String fileName) throws IOException {
        ArrayList<Parallelogram> polygons = new ArrayList<>();

        Path file_path = java.nio.file.Paths.get("src", "main", "resources", fileName);
        try (BufferedReader file = new BufferedReader(new FileReader(file_path.toString()))) {
            String line;
            while ((line = file.readLine()) != null) {
                Parallelogram polygon;
                String[] tmp = line.split(",");
                switch (tmp[0]) {
                    case Square.name:
                        polygon = new Square(Integer.valueOf(tmp[1].trim()));
                        break;
                    case Rectangle.name:
                        polygon = new Rectangle(Integer.valueOf(tmp[1].trim()), Integer.valueOf(tmp[2].trim()));
                        break;
                    case Rhombus.name:
                        polygon = new Rhombus(Integer.valueOf(tmp[1].trim()), Integer.valueOf(tmp[2].trim()));
                        break;
                    case Parallelogram.name:
                        polygon = new Parallelogram(Integer.valueOf(tmp[1].trim()), Integer.valueOf(tmp[2].trim()),
                                Integer.valueOf(tmp[3].trim()));
                        break;
                    default:
                        continue;
                }

                polygons.add(polygon);
            }
        }

        return polygons;
    }

    /**
     * Writes polygons to a file.
     *
     * @param fileName file name
     * @param polygons polygons
     */
    public static void writePolygons(String fileName, ArrayList<Parallelogram> polygons) {
        Path file_path = java.nio.file.Paths.get("src", "main", "resources", fileName);
        try (BufferedWriter file = new BufferedWriter(new FileWriter(file_path.toString()))) {
            StringBuilder sb = new StringBuilder();
            for (Parallelogram item: polygons) {
                sb.append(item.getName());
                sb.append(", ");
                sb.append(item.toString());
                sb.append("\n");
            }

            file.write(sb.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
