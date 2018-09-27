import java.util.Scanner;

public class Main {

    public static void main(String []args) {
        int numberOne;
        int numberTwo;

        //Initializing Scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.println("CALCULATOR");

        //Assigning first number from user input to variable
        while (true) {
            System.out.print("Enter first number: ");
            String input = keyboard.next();
            try {
                numberOne = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e){
                System.out.println("Entered number is not integer.");
            }
        }

        //Assigning second number from user input to variable
        while (true) {
            System.out.print("Enter second number: ");
            String input = keyboard.next();
            try {
                numberTwo = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e){
                System.out.println("Entered number is not integer.");
            }
        }

        //Calculating Sum of two numbers
        int numbersSum = numberOne + numberTwo;

        System.out.printf("Sum of numbers %d and %d is %d", numberOne, numberTwo, numbersSum);
    }
}
