package sk.varga.martin.gl1;

public class Main {

    private static int[][] a = new int[2][2];
    private static int[][] b = new int[2][2];
    private static int[][] c = new int[2][2];

    public static void main(String[] args) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = 3;
                b[i][j] = 5;
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + ", ");
            }
            System.out.println("");
        }
    }
}
