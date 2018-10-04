package sk.zajac.tomas.gl1;

public class Main {

    private static final String FILEPATH1 = "src/main/resources/firstMatrix.csv";
    private static final String FILEPATH2 = "src/main/resources/secondMatrix.csv";

    public static void main(String[] args) {

        int[][] firstMatrix;
        int[][] secMatrix;
        int[][] finalMatrix;

        //write matrix data to CSV files
        IOFromCSV.writeDataToMatrix(FILEPATH1);
        IOFromCSV.writeDataToMatrix(FILEPATH2);

        //load data from CSV file to an 2 dimensional arrays
        firstMatrix = IOFromCSV.readMatrixFromCSV(FILEPATH1);
        secMatrix = IOFromCSV.readMatrixFromCSV(FILEPATH2);

        printMatrix("First Matrix: ", firstMatrix);
        printMatrix("Second Matrix: ", secMatrix);

        //multiply two matrices
        finalMatrix = MatrixOperations.multiplyMatrix(firstMatrix, secMatrix);

        printMatrix("Final Matrix: ", finalMatrix);
    }

    /**
     * Function for printing matrices
     * @param text helpful text before matrix
     * @param matrix matrix that needs to be printed
     */
    private static void printMatrix(String text, int[][] matrix){
        System.out.println(text);
        for (int[] aMatrix : matrix) {
            System.out.print("| ");
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%-7d", aMatrix[col]);
            }
            System.out.print("|\n");
        }
        System.out.println();
    }
}
