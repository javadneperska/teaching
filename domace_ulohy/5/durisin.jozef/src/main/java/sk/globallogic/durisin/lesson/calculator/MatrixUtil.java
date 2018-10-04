package sk.globallogic.durisin.lesson.calculator;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


/**
 * Matrix utility class.
 */
public class MatrixUtil {
    // Suppresses default constructor, ensuring non-instantiability.
    private MatrixUtil() {
    }

    /**
     * Generates a random matrix.
     *
     * @param rows number of rows
     * @param columns number of columns
     * @param min minimal number value
     * @param max maximum number value
     *
     * @return random matrix
     */
    public static Matrix generate(int rows, int columns, int min, int max) {
        ArrayList<ArrayList<Integer>> matrixList = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add(ThreadLocalRandom.current().nextInt(min, max + 1));
            }
            matrixList.add(row);
        }

        return new Matrix(matrixList);
    }

    /**
     * Provides console interface for matrix multiplication.
     */
    public static void multiplication() {
        String input;
        boolean quit;

        do {
            System.out.println(Language.messages.getString("matrixFileName") + "A");
            Matrix a = Util.readMatrix();
            System.out.println(Language.messages.getString("matrixFileName") + "B");
            Matrix b = Util.readMatrix();

            Matrix result = a.multi(b);
            if (result != null) {
                System.out.println(Language.messages.getString("result"));
                Util.printMatrix(result);
            } else {
                System.out.println(Language.messages.getString("matrixMultiError"));
            }

            System.out.println(">>> " + Language.messages.getString("continue") + " ["
                    + Language.messages.getString("yes") + "/" + Language.messages.getString("no") + "]");
            while (true) {
                input = Util.scanner.nextLine();
                if (input.equals(Language.messages.getString("yes"))) {
                    System.out.println(String.format("%80s", "").replace(' ', '*'));
                    quit = false;
                    break;
                } else if (input.equals(Language.messages.getString("no"))) {
                    quit = true;
                    break;
                }

                System.out.println(">>> " + Language.messages.getString("invalidOption"));
            }
        } while (!quit);
    }

}
