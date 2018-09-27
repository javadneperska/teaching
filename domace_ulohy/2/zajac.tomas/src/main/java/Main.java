import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    enum Operations{
        ADDITION,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION
    }

    public static void main(String[] args) {
        //Initializing Scanner
        Scanner keyboard = new Scanner(System.in);

        int menuChoice = 0; //Saves choices from the user input
        double firstNumber;
        double secondNumber;
        List<Operations> selectedChoices = new ArrayList<Operations>(); //Stores selected choices from the menu

        System.out.println("CALCULATOR");

        System.out.println("MENU: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Make your choices and press 'X'");

        while(true){
            String input = keyboard.next();

            if (input.toLowerCase().equals("x")){
                break;
            }

            try{
                menuChoice = Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("Your choice is not from the Menu.");
            }

            switch (menuChoice){
                case 1: System.out.println("You selected Addition");
                    if (!selectedChoices.contains(Operations.ADDITION)) {
                        selectedChoices.add(Operations.ADDITION);
                    }
                    break;
                case 2: System.out.println("You selected Subtraction");
                    if (!selectedChoices.contains(Operations.SUBTRACTION)){
                        selectedChoices.add(Operations.SUBTRACTION);
                    }
                    break;
                case 3: System.out.println("You selected Multiplication");
                    if (!selectedChoices.contains(Operations.MULTIPLICATION)){
                        selectedChoices.add(Operations.MULTIPLICATION);
                    }
                    break;
                case 4: System.out.println("You selected Division");
                    if (!selectedChoices.contains(Operations.DIVISION)){
                        selectedChoices.add(Operations.DIVISION);
                    }
                    break;
                default:
                    System.out.println("Entered choice is not from the Menu.");
                    break;
            }
        }

        System.out.println("You chose following: " + selectedChoices);

        while (true) {
            System.out.print("Enter first number: ");
            String keyInput = keyboard.next();
            try {
                firstNumber = Double.parseDouble(keyInput);
                break;
            } catch (NumberFormatException e){
                System.out.println("Entered number is not integer.");
            }
        }

        while (true) {
            System.out.print("Enter second number: ");
            String keyInput = keyboard.next();
            try {
                secondNumber = Double.parseDouble(keyInput);
                break;
            } catch (NumberFormatException e){
                System.out.println("Entered number is not integer.");
            }
        }

        if (selectedChoices.contains(Operations.ADDITION)){
            double result = MathOperations.addition(firstNumber, secondNumber);
            System.out.println("ADDITION: " + result);
        }
        if (selectedChoices.contains(Operations.SUBTRACTION)){
            double result = MathOperations.subtraction(firstNumber, secondNumber);
            System.out.println("SUBTRACTION: " + result);
        }
        if (selectedChoices.contains(Operations.MULTIPLICATION)){
            double result = MathOperations.multiplication(firstNumber, secondNumber);
            System.out.println("MULTIPLICATION: " + result);
        }
        if (selectedChoices.contains(Operations.DIVISION)){
            double result = MathOperations.division(firstNumber, secondNumber);
            System.out.println("DIVISION: " + result);
        }
    }
}
