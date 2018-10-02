package com.globallogic.durisin.lesson;

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
                scanner.nextLine();  // Remove \n from the scanner.
                break;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Enter double");
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

        if (input.contains("+")) {
            System.out.println("Sum: " + sum(a, b));
        }
        if (input.contains("-")) {
            System.out.println("Difference: " + diff(a, b));
        }
        if (input.contains("*")) {
            System.out.println("Product: " + multi(a, b));
        }
        if (input.contains("/")) {
            System.out.println("Fraction: " + div(a, b));
        }
    }

}
