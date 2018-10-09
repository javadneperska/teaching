package sk.zajac.tomas.gl1;

import java.util.Arrays;

public class Main{

    public static void main(String[] args) {

        int[][] matrix1 = {{2, 6}, {5, 8}};
        int[][] matrix2 = {{3, 6}, {7, 9}};
        int[][] matrix3 = new int[2][2];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }
        System.out.println(Arrays.toString(matrix3[0]));
        System.out.println(Arrays.toString(matrix3[1]));

    }
}