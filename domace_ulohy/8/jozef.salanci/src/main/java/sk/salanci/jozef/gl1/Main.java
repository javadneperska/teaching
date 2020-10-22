package sk.salanci.jozef.gl1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;



public class Main {
    public static String fileName;


    public static void main(String[] args) {
        System.out.println("Zoznam zamestnancov");
//        fileName = FileHandler.fileName("vasho");
        fileName = "zamestnanci.csv";
        System.out.println(FileHandler.getPath(fileName));
        System.out.println("*********************************");
        FileHandler.parserCsv(FileHandler.getPath(fileName));
        FileHandler.arrayOutput(FileHandler.myArray);

        ArrayList<String> al = new ArrayList<String>();

        for (int i = 0; i < FileHandler.myArray.length; i++) {
            al.add(FileHandler.myArray[i][1]);
//            System.out.println(FileHandler.myArray[i][1]);

        }
        System.out.println(al);

        Collections.sort(al, String.CASE_INSENSITIVE_ORDER);
        System.out.println(al);


    }
}