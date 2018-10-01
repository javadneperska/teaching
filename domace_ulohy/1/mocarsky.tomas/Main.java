import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initializing Scanner
        Scanner sc = new Scanner(System.in);

        // Assign values from the console to variables
        System.out.printf("Add value A: ");
        int valA = sc.nextInt();
        System.out.printf("Add value B: ");
        int valB = sc.nextInt();

        // Printing result
        System.out.printf("Result: %d + %d = %d ", valA, valB, valA + valB);
    }
}
