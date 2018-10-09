package sk.varga.martin.gl1;

public class Matrix {

    public Matrix(){
        matrix = new int[WIDTH][HEIGHT];
    }
    private final int WIDTH = 2;
    private final int HEIGHT = 2;

    private int matrix[][];

    public void setMatrix(int width, int height, int value){
        matrix[width][height] = value;
    }

    public int getMatrix(int width, int height){
        return matrix[width][height];
    }

    @Override
    public String toString(){
        String s = "";
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                s = s + matrix[i][j] + ", ";
            }
            System.out.println("");
        }
        return s;
    }
}
