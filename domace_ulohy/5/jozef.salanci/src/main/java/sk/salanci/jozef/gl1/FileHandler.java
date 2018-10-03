package sk.salanci.jozef.gl1;

import java.io.*;
import java.util.Scanner;

public class FileHandler {
    public static String csvFile;

    public static double[][] myArray;
    public static double[][] matrixMultiplication;


    public static String fileName(String a) {
        Scanner in = new Scanner(System.in);
        System.out.println("Zadaj nazov " + a + " suboru:");
        csvFile = in.nextLine();
        return csvFile;
    }

    public static String getPath(String fileName) {
        File file = new File(fileName);
        String path = file.getAbsolutePath();
        return path;
    }

    public static void parserCsv(String filePath) {

        myArray = new double[4][4];

        Scanner scanIn = null;
        int Rowc = 0;
        String InputLine = "";
        String CSVFileName;
        CSVFileName = filePath;

        try {
            //setup a scaner
            scanIn = new Scanner(new BufferedReader(new FileReader(CSVFileName)));

            while (scanIn.hasNextLine())
            {
//                Read line in from file
                InputLine = scanIn.nextLine();
//                Split the InputLine into an array at the commas
                String[] InArray = InputLine.split(",");
                for (int i = 0; i < InArray.length; i++) {
                    myArray[Rowc][i]= Double.parseDouble(InArray[i]);
                }
                Rowc++;
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            CSVFileName + "'");
        }
    }

    public static void matrixMultiplication(double[][] matA, double[][] matB) {
        matrixMultiplication = new double[4][4];
        System.out.println(" ");
        System.out.println("Vynasobene matice");
        System.out.println(" ");
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matB[0].length; j++) {
                double mul = 0;
                for (int s = 0; s < matB.length; s++) {
                    mul += (matA[i][s] * matB[s][j]);

                }
                matrixMultiplication[i][j] = mul;
            }
        }

    }

    public static void arrayOutput(double[][] matrix){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
