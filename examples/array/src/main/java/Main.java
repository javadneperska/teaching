import java.util.Random;

public class Main {
    public static void main(String[] argv) {

        final int[][] doubleArray = new int[5][5];
        initArray(doubleArray);
        printArray(doubleArray);
        System.out.println("count: " + countArray(doubleArray));
        System.out.println("multiply: " + multiplyArray(doubleArray));

        System.out.println("****");

    }

    private static void initArray(int[][] doubleArray) {
        Random rn = new Random();
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                int k = rn.nextInt(15) + 1;
                doubleArray[i][j] = k;
            }
        }
    }

    private static void printArray(int[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.println(doubleArray[i][j]);
            }
        }
    }
    private static int countArray(int[][] doubleArray) {
        int sum = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                int var = doubleArray[i][j];
                sum += var;
            }
        }
        return sum;
    }
    private static Long multiplyArray(int[][] doubleArray) {
        Long sum = new Long(1L);
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                int var = doubleArray[i][j];
                sum *= var;
            }
        }
        return sum;
    }

}
