package sk.globallogic.durisin.lesson.calculator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * This class provides IO support.
 */
public class Util {
    public static Scanner scanner = new Scanner(System.in);

    // Suppresses default constructor, ensuring non-instantiability.
    private Util() {
    }

    /**
     * Reads matrix from a file.
     *
     * @param fileName name of the file
     *
     * @return matrix, on error null
     */
    public static Matrix readMatrix(String fileName) {
        ArrayList<ArrayList<Integer>> matrixList = new ArrayList<>();

        Path file_path = java.nio.file.Paths.get("src", "main", "resources", "matrix", fileName);
        try (BufferedReader file = new BufferedReader(new FileReader(file_path.toString()))) {
            String line;
            while ((line = file.readLine()) != null) {
                ArrayList<Integer> tmp = new ArrayList<>();
                for (String item: line.split(",")) {
                    tmp.add(Integer.valueOf(item.trim()));
                }
                matrixList.add(tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return new Matrix(matrixList);
    }

    /**
     * Reads matrix from a file.
     *
     * @return matrix
     */
    public static Matrix readMatrix() {
        ArrayList<ArrayList<Integer>> matrixList = new ArrayList<>();
        String input;

        while (true) {
            input = Util.scanner.nextLine();
            Path file_path = java.nio.file.Paths.get("src", "main", "resources", "matrix", input);
            try (BufferedReader file = new BufferedReader(new FileReader(file_path.toString()))) {
                String line;
                while ((line = file.readLine()) != null) {
                    ArrayList<Integer> tmp = new ArrayList<>();
                    for (String item : line.split(",")) {
                        tmp.add(Integer.valueOf(item.trim()));
                    }
                    matrixList.add(tmp);
                }
                break;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        return new Matrix(matrixList);
    }

    /**
     * Writes matrix to a file.
     *
     * @param fileName name of the file
     * @param a matrix
     */
    public static void writeMatrix(String fileName, final Matrix a) {
        Path file_path = java.nio.file.Paths.get("src", "main", "resources", "matrix", fileName);
        try (BufferedWriter file = new BufferedWriter(new FileWriter(file_path.toString()))) {
            StringBuilder sb = new StringBuilder();
            for (ArrayList<Integer> row: a.getMatrix()) {
                for (Integer item : row) {
                    sb.append(item);
                    sb.append(",");
                }
                sb.append("\n");
            }
            sb.deleteCharAt(sb.lastIndexOf(","));

            file.write(sb.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Prints given matrix.
     *
     * @param a matrix
     */
    public static void printMatrix(final Matrix a) {
        for (ArrayList<Integer> row: a.getMatrix()) {
            for (Integer value: row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}
