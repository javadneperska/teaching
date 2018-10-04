package sk.varga.martin.gl1.hw4.util;

import sk.varga.martin.gl1.hw4.enums.MatrixDimension;
import sk.varga.martin.gl1.hw4.models.Matrix;

import java.util.Random;

public class Utils {

    public static Matrix multiplyMatrices(Matrix a, Matrix b){
        int aRows = a.getHeight();
        int aCols = a.getWidth();
        int bRows = b.getHeight();
        int bCols = b.getWidth();

        if(aCols != bRows){
            throw new IllegalArgumentException("A:Rows: " + aCols + " did not match B:Columns " + bRows + ".");
        }

        Matrix c  = new Matrix(aRows, bCols);
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bCols; j++) {
                c.setValue(i, j, 0);
            }
        }

        for (int i = 0; i < aRows; i++) { // aRow
            for (int j = 0; j < bCols; j++) { // bColumn
                for (int k = 0; k < aCols; k++) { // aColumn
                    c.setValue(i,j, a.getValue(i,k)* b.getValue(k,j));
                }
            }
        }
        return c;
    }

    public static Matrix[] generateMatrices(){
        UserInteraction userInteraction = new UserInteraction();

        int aRows = userInteraction.loadNumber(1, MatrixDimension.HEIGHT);
        int aCols = userInteraction.loadNumber(1, MatrixDimension.WIDTH);
        int bRows = userInteraction.loadNumber(2, MatrixDimension.HEIGHT);
        int bCols = userInteraction.loadNumber(2, MatrixDimension.WIDTH);

        Matrix a = new Matrix(aRows, aCols);
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < aCols; j++) {
                Random random = new Random();
                int value = 1 + random.nextInt(100);
                a.setValue(i,j, value);
            }
        }
        System.out.println(a.toString());

        Matrix b = new Matrix(bRows, bCols);
        for (int i = 0; i < bRows; i++) {
            for (int j = 0; j < bCols; j++) {
                Random random = new Random();
                int value = 1 + random.nextInt(100);
                b.setValue(i,j, value);
            }
        }

        Matrix[] matrices = new Matrix[2];
        matrices[0] = a;
        matrices[1] = b;

        return matrices;
    }
}
