package sk.varga.martin.gl1.hw4.util;

import sk.varga.martin.gl1.hw4.enums.MatrixDimension;
import sk.varga.martin.gl1.hw4.enums.MatrixLoadMethod;
import sk.varga.martin.gl1.hw4.models.Matrix;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class UserInteraction {
    private static Scanner scanner = new Scanner(System.in);
    private Matrix matrix;

    public Matrix loadMatrix() {
        ResourceLoader resourceLoader = new ResourceLoader();

        System.out.println("Enter name of Matrix resource: \n");
        String resourceName = scanner.next();

        try {
            matrix = resourceLoader.returnMatrixFromResource(resourceName);
        } catch (FileNotFoundException e) {
            e.getMessage();
            loadMatrix();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(matrix.toString());
        return matrix;
    }

    public MatrixLoadMethod getMethod(){
        int index = 0;
        try {
            index = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("Enter valid number!");
            getMethod();
        }

        MatrixLoadMethod matrixLoadMethod = null;

        switch (index){
            case 1:
                matrixLoadMethod = MatrixLoadMethod.FROM_FILE;
                break;
            case 2:
                matrixLoadMethod = MatrixLoadMethod.GENERATED;
                break;
                default:
                    System.out.println("Enter valid number!");
                    getMethod();
                    break;
        }
        return matrixLoadMethod;
    }

    public int loadNumber(int matrixIndex, MatrixDimension matrixDimension){
        System.out.println("Enter " + matrixDimension.getValue() + " of matrix " + matrixIndex);
        int number = 0;
        try {
            number = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("Enter valid number!");
            getMethod();
        }
        return number;
    }

}
