import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstFile,secondFile;
        System.out.println("Type name of the first file: ");
        firstFile = sc.nextLine();
        System.out.println("Type name of the second file: ");
        secondFile = sc.nextLine();

        System.out.println("Files are being processed with names: " +firstFile + " and " + secondFile);


        int a[][] = getIntArrayFromFile(firstFile);
        int b[][] = getIntArrayFromFile(secondFile);
        int lengthOfMatrix = a.length;

        int c[][] = multiplyMatrix(a,b,lengthOfMatrix);
        printMatrix(c);

    }

    /*FUNCTION FOR MULTIPLYING THE MATRIXES*/
    public static int[][] multiplyMatrix(int a[][],int b[][],int lengthOfMatrix){
        int c[][] = new int[lengthOfMatrix][lengthOfMatrix];

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                c[i][j] =0;
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                for(int k=0;k<b.length;k++){
                    c[i][j]= c[i][j] +(a[i][k] * b[k][j]);
                }
            }
        }
        return c;
    }

    /*FUNCTION FOR PRINTING THE FINAL MATRIX*/
    public static void printMatrix(int c[][])
    {
        System.out.println("\n");
        System.out.println("--------------");
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                System.out.print(c[i][j]+" ");
            }

            System.out.println("\n");
            System.out.println("--------------");
        }
    }


    /*GETS THE FILE FROM SYSTEM DOCUEMNTS BY GIVEN FILE NAME*/
    public static int[][] getIntArrayFromFile(String fileName){
        String fName = System.getProperty("user.home") +"\\" + "Documents"+"\\";
        String thisLine;

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fName+fileName);
            DataInputStream myInput = new DataInputStream(fis);
            List<String[]> lines = new ArrayList<String[]>();
            while ((thisLine = myInput.readLine()) != null) {
                lines.add(thisLine.split(","));
            }


            String[][] array = new String[lines.size()][0];
            lines.toArray(array);
            int sizeToApply = array.length;

            int[][] intArray = new int[sizeToApply][sizeToApply];
            int temp;
            for(int i=0;i<array.length;i++) {
                for (int j = 0; j < array.length; j++) {
                    temp = Integer.valueOf(array[i][j]);
                    intArray[i][j] = temp;
                }
            }
            return intArray;


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
