import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        // Initializing Scanner and variables
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String op[] = {"Summary", "Subtract", "Multiply", "Divide"};
        int ret[] = new int[4];
        String an;
        double numA, numB;

        // Assigning values from the console to variables
        System.out.printf("Add value A: ");
        numA = sc.nextInt();
        System.out.printf("Add value B: ");
        numB = sc.nextInt();

        // Some logic
        System.out.println("Choose the operation");
        for (int i = 0; i < op.length; i++) {
            System.out.println(op[i] + "? Y/N or Q for quit");
            an = input.nextLine();
            if (an.equalsIgnoreCase("Y")) {
                ret[i] = i+1;
            } else if (an.equalsIgnoreCase("N")) {
                ret[i] = 0;
            } else if (an.equalsIgnoreCase("Q")){
                break;
            } else {
                System.out.println("No key");
            }
        }

        for (int i = 0; i < op.length; i++) {
            if (ret[i] != 0) {
                System.out.println(op[i] + " " + result(numA, numB, ret[i]));
            }
        }
    }

    private static double result(double numA, double numB, int res) {
        switch (res) {
            case 1:
                return numA + numB;
            case 2:
                return numA - numB;
            case 3:
                return numA * numB;
            case 4:
                return numA / numB;
            default:
                System.out.printf("Nope ");
        }
        return 0;
    }
}
