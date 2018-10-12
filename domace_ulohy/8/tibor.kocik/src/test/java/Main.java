

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //urobte program, ktory z ext suboru nacita zoznam zamestnancov firmy GL, pricom tam budu ulozene nasledujuce vlastnosti
    //meno, priezvisko, datum nastupu(rok mesiac den), pracovna pozicia, pocet rokov praxe, platy, ...usporiada ludi
    //podla datumu nastupu do zamestnania, resp. umozni uzivatelo vylistovat uzivatelov podla mena priezviska datumu nastupu a prac pozicie
    //pouzite nasledujuce metody v programe: csv, split, sort, arrays.ToString();
    private static Scanner sc;

    public static void main(String[] args) throws IOException {

        sc = new Scanner(System.in);
        ArrayList<ArrayList<String>> data = readCSVFromFile("testData");
        Sorter(data);
    }

    public static void Sorter (ArrayList<ArrayList<String>> array)
    {
        while (true)
        {
            System.out.println("\n\n");
            System.out.println("Podľa čoho chceš sortovať? ");
            System.out.println("1. meno");
            System.out.println("2. priezvisko");
            System.out.println("3. nástup");
            System.out.println("4. pozícia");
            System.out.println("5. prax");
            System.out.println("6. plat");
            System.out.println("7. skončiť program");
            switch (sc.nextInt())
            {
                case 1:
                    printer(array, 0);
                    break;
                case 2:
                    printer(array, 1);
                    break;
                case 3:
                    printer(array, 2);
                    break;
                case 4:
                    printer(array, 3);
                    break;
                case 5:
                    printer(array, 4);
                    break;
                case 6:
                    printer(array, 5);
                    break;
                case 7:
                    System.exit(1);
                default:
                    System.out.println("Zadajte číslo zo zoznamu");
                    break;

            }
        }

    }


    public static void printer(ArrayList<ArrayList<String>> array, int col)
    {
        System.out.println("Zoradené podľa " + array.get(0).get(col) + " :");
        //System.out.format("%59s%n",Arrays.toString(array.get(0).toArray()));
        String[][] arr = new String[array.size()][array.get(0).size()];
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.get(0).size(); j++) {
                arr[i][j] = array.get(i).get(j);
            }
        }
        arr = Sort2DMatrixByColumn.sortByColumn(arr, col);

        /*for (int i = 0; i < arr.length; i++) {
            System.out.format("%59s%n", Arrays.toString(arr[i]));
        }*/
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.format("| %15s", Arrays.toString(new String[]{arr[i][j]}));
            }
            System.out.println("\n");
        }

    }

    public static ArrayList<ArrayList<String>> readCSVFromFile(String nameOfTheFile) throws IOException {
        File file = new File(nameOfTheFile + ".csv");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        ArrayList<String> inner = new ArrayList<String>();

        while ((st=br.readLine()) != null) {
            String[] parts = st.split(",");
            for (int i = 0; i < parts.length; i++) {
                inner.add(parts[i]);
            }

            data.add(inner);
            inner = new ArrayList<String>();
        }

        return data;
    }


}
