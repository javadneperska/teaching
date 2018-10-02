package com.globallogic.durisin.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * This class provides arithmetic operations.
 *
 * @author Durisin Jozef
 */
public class Calculator {
    private static Scanner scanner = new Scanner(System.in);

    // Suppresses default constructor, ensuring non-instantiability.
    private Calculator() {
    }

    /**
     * Gets a number from the user.
     *
     * @return number entered by the user
     */
    private static double getNumber() {
        double number;

        // Repeat reading until the user enters a valid number.
        while (true) {
            try {
                number = scanner.nextDouble();
                scanner.nextLine();  // Remove \n and any other data left from the scanner.
                break;
            } catch (java.util.InputMismatchException ex) {
//                System.out.println("Enter double");
                System.out.println("\\    /\\     ???\n" + " )  ( ')\n" + " (  /  )\n" + "  \\(__)|");
                scanner.nextLine();  // Remove invalid data from the scanner.
            }
        }

        return number;
    }

    /**
     * Performs addition of two numbers.
     *
     * @param a augend
     * @param b addend
     *
     * @return sum of two numbers
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * Performs addition of two numbers.
     *
     * @return sum of two numbers
     */
    public static double sum() {
        System.out.println("Enter augend");
        double a = getNumber();
        System.out.println("Enter addend");
        double b = getNumber();

        return a + b;
    }

    /**
     * Performs subtraction of two numbers.
     *
     * @param a minuend
     * @param b subtrahend
     *
     * @return difference of two numbers
     */
    public static double diff(double a, double b) {
        return a - b;
    }

    /**
     * Performs subtraction of two numbers.
     *
     * @return difference of two numbers
     */
    public static double diff() {
        System.out.println("Enter minuend");
        double a = getNumber();
        System.out.println("Enter subtrahend");
        double b = getNumber();

        return a - b;
    }

    /**
     * Performs multiplication of two numbers.
     *
     * @param a multiplier
     * @param b multiplicand
     *
     * @return product of two numbers
     */
    public static double multi(double a, double b) {
        return a * b;
    }

    /**
     * Performs multiplication of two numbers.
     *
     * @return product of two numbers
     */
    public static double multi() {
        System.out.println("Enter multiplier");
        double a = getNumber();
        System.out.println("Enter multiplicand");
        double b = getNumber();

        return a * b;
    }

    /**
     * Performs division of two numbers.
     *
     * @param a dividend
     * @param b divisor
     *
     * @return fraction of two numbers
     */
    public static double div(double a, double b) {
        return a / b;
    }

    /**
     * Performs division of two numbers.
     *
     * @return fraction of two numbers
     */
    public static double div() {
        System.out.println("Enter dividend");
        double a = getNumber();
        System.out.println("Enter divisor");
        double b = getNumber();

        return a / b;
    }

    /**
     * Prints out operations result of two numbers.
     */
    public static void operations() {
        System.out.println("Enter two numbers");
        double a = getNumber();
        double b = getNumber();

        System.out.println("Enter operations (as one string)");
        String input = scanner.nextLine();

        if (input.contains(Operation.ADDITION.getValue())) {
            System.out.println("Sum: " + sum(a, b));
        }
        if (input.contains(Operation.SUBTRACTION.getValue())) {
            System.out.println("Difference: " + diff(a, b));
        }
        if (input.contains(Operation.MULTIPLICATION.getValue())) {
            System.out.println("Product: " + multi(a, b));
        }
        if (input.contains(Operation.DIVISION.getValue())) {
            System.out.println("Fraction: " + div(a, b));
        }
    }

    /**
     * Provides arithmetic operations via console interface.
     */
    public static void menu() {
        System.out.println(String.format("%80s", "").replace(' ', '*'));
        System.out.println(String.format("%50s%30s", "Calculatronix-50-000", "")
                .replace(' ', '*').replace("-", " "));
        System.out.println(String.format("%80s", "").replace(' ', '*'));

        ArrayList<String> supportedLanguages = new ArrayList<String>(Arrays.asList("en", "sk"));
        String input;
        ResourceBundle messages;
        boolean quit;

        System.out.println(">>> Select language. Available options: " + supportedLanguages.toString());
        while (true) {
            input = scanner.nextLine();
            if (supportedLanguages.contains(input)) {
                Locale locale = new Locale(input);
                messages = ResourceBundle.getBundle("MessagesBundle", locale);
                break;
            } else {
                System.out.println(">>> Unsupported language");
            }
        }

        do {
            System.out.println(">>> " + messages.getString("enterNumbers"));
            double a = getNumber();
            double b = getNumber();

            System.out.println(">>> " + messages.getString("enterOperations") + EnumSet.allOf(Operation.class));
            System.out.println(">>> " + messages.getString("doneMessage"));

            HashSet<Operation> operations = new HashSet<Operation>();

            while (true) {
                input = scanner.nextLine();

                if (input.equals("")) {
                    break;
                } else if (input.length() == 0) {
                    continue;
                }

                try {
                    if (EnumSet.allOf(Operation.class).contains(Operation.getByValue(input.charAt(0)))) {
                        operations.add(Operation.getByValue(input.charAt(0)));
                    }
                } catch (IllegalArgumentException ex) {
                    System.out.println(">>> " + messages.getString("invalidOperation"));
                }

                if (operations.size() == Operation.size) {
                    System.out.println(">>> " + messages.getString("allOperationsSelected"));
                    break;
                }
            }

            System.out.println(String.format("%80s", "").replace(' ', '*'));
            ArrayList<Operation> sortedOperations = new ArrayList<Operation>(operations);
            Collections.sort(sortedOperations);
            for (Operation operation : sortedOperations) {
                switch (operation) {
                    case ADDITION:
                        System.out.println(messages.getString("sum") + a + " " + Operation.ADDITION.toString()
                                + " " + b + messages.getString("equals") + sum(a, b));
                        break;
                    case SUBTRACTION:
                        System.out.println(messages.getString("difference") + a + " " + Operation.SUBTRACTION.toString()
                                + " " + b + messages.getString("equals") + diff(a, b));
                        break;
                    case MULTIPLICATION:
                        System.out.println(messages.getString("product") + a + " " + Operation.MULTIPLICATION.toString()
                                + " " + b + messages.getString("equals") + multi(a, b));
                        break;
                    case DIVISION:
                        System.out.println(messages.getString("fraction") + a + " " + Operation.DIVISION.toString()
                                + " " + b + messages.getString("equals") + div(a, b));
                        break;
                }
            }
            System.out.println(String.format("%80s", "").replace(' ', '*'));

            System.out.println(">>> " + messages.getString("continue") + " ["
                + messages.getString("yes") + "/" + messages.getString("no") + "]");
            while (true) {
                input = scanner.nextLine();
                if (input.equals(messages.getString("yes"))){
                    quit = false;
                    break;
                } else if (input.equals(messages.getString("no"))) {
                    quit = true;
                    break;
                }

                System.out.println(">>> " + messages.getString("invalidOption"));
            }

        } while (!quit);
    }

}
