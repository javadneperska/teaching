package sk.robovarga.les7;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) {
        // urobte program ktory spocita dve matice o rozmere 2x2 a pri prechode sa skuste pouzit foreach

        int[][] matica1 = {{1, 4}, {6, 2}};
        int[][] matica2 = {{2, 3}, {1, 7}};



        printMatica(matica1);
        printMatica(matica2);




        int[][] vysledok = new int[2][2];
        for (int i = 0; i < matica1.length; i++) {

            for (int j = 0; j < matica1[i].length; j++) {

                vysledok[i][j] = matica1[i][j] + matica2[i][j];

            }

        }


        printMatica(vysledok);


    }

    public static void printMatica(int[][] matica){

        for (int i = 0; i < matica.length; i++) {

            for (int j = 0; j < matica[i].length; j++) {

                System.out.print(matica[i][j] + " ");

            }

            System.out.println("");
        }
        
        System.out.println("");

    }


}
