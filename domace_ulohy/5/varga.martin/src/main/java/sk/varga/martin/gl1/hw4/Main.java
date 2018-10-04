package sk.varga.martin.gl1.hw4;

import sk.varga.martin.gl1.hw4.enums.MatrixLoadMethod;
import sk.varga.martin.gl1.hw4.models.Matrix;
import sk.varga.martin.gl1.hw4.util.UserInteraction;
import sk.varga.martin.gl1.hw4.util.Utils;

public class Main {

    private static Matrix matrixA;
    private static Matrix matrixB;
    private static Menu menu = new Menu();
    private static UserInteraction userInteraction = new UserInteraction();
    private static MatrixLoadMethod method;

    public static void main(String[] args) {
        while (true) {
            menu.printMenu1();
            method = userInteraction.getMethod();

            if (method == MatrixLoadMethod.FROM_FILE) {
                matrixA = userInteraction.loadMatrix();
                matrixB = userInteraction.loadMatrix();
            } else if (method == MatrixLoadMethod.GENERATED) {
                Matrix[] matrices = Utils.generateMatrices();
                matrixA = matrices[0];
                matrixB = matrices[1];
            }

            Matrix c = Utils.multiplyMatrices(matrixA, matrixB);
            System.out.println("Result matrix:");
            System.out.println(c.toString());
        }
    }

}
