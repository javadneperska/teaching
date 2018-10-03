import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) throws Exception {
        //urobte program ktory nacita 2 externe subory pricom externy subor bude obsahovat maticu cisel 4x4 a druhy 4x4.
        // Prggram nasledne sa spyta uzivatela na nazvy suborov, nacita tieto subory a urobi nasobenie matic a vypise vysledok na obrazovku.
        // podporny program je vytvorenie matic random

        MatriceGenerator.randMatrice(4,4, "firstMatrix");
        MatriceGenerator.randMatrice(4,4, "secondMatrix");

        ArrayList<ArrayList<Integer>> firstMatrice = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> secondMatrice = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> resultMatrice = new ArrayList<ArrayList<Integer>>();

        firstMatrice = readMatriceFromFile("firstMatrix.csv");
        secondMatrice = readMatriceFromFile("secondMatrix.csv");

        resultMatrice = multiplyMatrix(firstMatrice, secondMatrice);
        printMatrix(resultMatrice);


    }

    private static ArrayList<ArrayList<Integer>> readMatriceFromFile(String nameOfTheFile) throws IOException {
        File file1 = new File(nameOfTheFile);
        BufferedReader br = new BufferedReader(new FileReader(file1));
        ArrayList<ArrayList<Integer>> matrice = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> inner = new ArrayList<Integer>();
        String st;
        StringBuilder number = new StringBuilder();
        while ((st = br.readLine()) != null) {
            for(int i=0;i<st.length();i++)
            {
                if(st.charAt(i) !=',') {
                    number.append(String.valueOf(st.charAt(i)));
                }
                else
                {
                    inner.add(Integer.parseInt(number.toString()));
                    number = new StringBuilder();
                }
                if(i==st.length()-1)
                {
                    inner.add(Integer.parseInt(number.toString()));
                }
            }
            matrice.add(inner);
            inner = new ArrayList<Integer>();
            number = new StringBuilder();
        }
        return matrice;
    }
    private static ArrayList<ArrayList<Integer>> multiplyMatrix(ArrayList<ArrayList<Integer>> firstMatrix, ArrayList<ArrayList<Integer>> secondMatrix)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> column = new ArrayList<ArrayList<Integer>>();

        int partialSum = 0;

        for (int j = 0; j < firstMatrix.size(); j++) {
            for (int k = 0; k < firstMatrix.size(); k++) {
                for (int l = 0; l < firstMatrix.size(); l++) {
                    partialSum = partialSum + firstMatrix.get(j).get(l) * secondMatrix.get(l).get(k);
                }
                row.add(partialSum);
                partialSum = 0;
            }
            result.add(row);
            row = new ArrayList<Integer>();

        }


        return  result;
    }
    private static void printMatrix(ArrayList<ArrayList<Integer>> matrix)
    {
        /*for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(0).size(); j++) {
            }
            System.out.println();
        }*/

        System.out.println(Arrays.deepToString(matrix.toArray()).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

    }
}
