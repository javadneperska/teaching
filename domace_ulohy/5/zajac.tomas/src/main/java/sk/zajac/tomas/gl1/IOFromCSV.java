package sk.zajac.tomas.gl1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

class IOFromCSV {

    private static final String SEPARATOR = ",";
    private static final int BOUNDARY = 200; //size of random values for matrix

    private int row;
    private int col;

    /**
     * Reads matrix data from CSV file and saves it to 2-dimensional array
     * @param filePath path to CSV file
     * @return matrix in 2-dimensional array
     */
    static int[][] readMatrixFromCSV(String filePath) {

        IOFromCSV obj = getNumberOfRowsCols(filePath);
        int[][] matrix = new int[obj.row][obj.col];

        String line = "";
        int rowsCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            while ((line = br.readLine()) != null) {
                String[] stringArray = line.split(SEPARATOR);

                for (int i = 0; i < stringArray.length; i++) {
                    matrix[rowsCount][i] = Integer.parseInt(stringArray[i].trim());
                }
                rowsCount++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return matrix;
    }

    /**
     * Writes random matrix data to CSV file
     * @param filePath path to CSV file
     */
    static void writeDataToMatrix(String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            DataOutputStream data = new DataOutputStream(fos);

            Random rand = new Random();
            for (int i = 0; i < 4; i++) {
                int input1 = rand.nextInt(BOUNDARY);
                int input2 = rand.nextInt(BOUNDARY);
                int input3 = rand.nextInt(BOUNDARY);
                int input4 = rand.nextInt(BOUNDARY);

                data.writeBytes(input1 + "," + input2 + "," + input3 + "," + input4 + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Function to calculate number of Rows and Columns of matrix from CSV file
     * @param filePath path to CSV file
     * @return Object that contains rows and columns
     */
    private static IOFromCSV getNumberOfRowsCols(String filePath) {
        IOFromCSV rowsCols = new IOFromCSV();
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            while ((line = br.readLine()) != null) {
                rowsCols.row++;
                String[] stringArray = line.split(SEPARATOR);
                rowsCols.col = stringArray.length;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return rowsCols;
    }
}