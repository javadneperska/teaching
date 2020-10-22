package sk.salanci.jozef.gl1;

import java.io.*;
import java.util.Scanner;


public class FileHandler {
    public static String csvFile;
    public static String[][] myArray;


//    public static double[][] myArray;
//    public static double[][] matrixMultiplication;


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

        Scanner scanIn = null;
        int Rowc = 0;
        String InputLine = "";
        String CSVFileName;
        CSVFileName = filePath;

        try {
            //setup a scaner
            scanIn = new Scanner(new BufferedReader(new FileReader(CSVFileName)));

            while (scanIn.hasNextLine()){
                Rowc++;
                scanIn.nextLine();
            }
            myArray = new String[Rowc][6];

            Rowc=0;

            scanIn = new Scanner(new BufferedReader(new FileReader(CSVFileName)));
            while (scanIn.hasNextLine())
            {
                InputLine = scanIn.nextLine();
                String[] InArray = InputLine.split(",");
                for (int i = 0; i < InArray.length; i++) {
                    myArray[Rowc][i]= InArray[i];
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


    public static void arrayOutput(double[][] matrix){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void arrayOutput(String[][] matrix){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
