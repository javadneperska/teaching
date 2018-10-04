package sk.varga.martin.gl1.hw4.models;

public class Matrix {
    private int[][] matrix;
    private int height;
    private int width;

    public Matrix(int height, int width) {
        this.matrix = new int[height][width];
        this.height = height;
        this.width = width;
    }

    public void setValue(int height, int width, int value) {
        this.matrix[height][width] = value;
    }

    public int getValue(int height, int width) {
        return matrix[height][width];
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public String toString() {
        String matrixString = "";

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrixString = matrixString + getValue(i, j);
                if (j != width - 1) {
                    matrixString = matrixString + ",";
                }
            }
            matrixString = matrixString + "\n";
        }

        return matrixString;
    }
}
