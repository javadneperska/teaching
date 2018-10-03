package sk.zajac.tomas.gl1;

class MatrixOperations {

    /**
     * Function for multiplying 2 matrices
     * @param firstMatrix first matrix
     * @param secondMatrix second matrix
     * @return multiplied matrix
     */
    static int[][] multiplyMatrix(int[][] firstMatrix, int[][] secondMatrix) {

        int firstRows = firstMatrix.length;
        int firstColumns = firstMatrix[0].length;
        int secondRows = secondMatrix.length;
        int secondColumns = secondMatrix[0].length;

        if (firstColumns != secondRows) throw new IllegalArgumentException("Illegal matrix dimensions.");

        int[][] finalMatrix = new int[firstRows][secondColumns];
        for (int i = 0; i < firstRows; i++)
            for (int j = 0; j < secondColumns; j++)
                for (int k = 0; k < firstColumns; k++)
                    finalMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];

        return finalMatrix;
    }
}

