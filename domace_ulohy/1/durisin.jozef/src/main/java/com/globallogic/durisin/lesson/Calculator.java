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
    private static float getNumber() {
        float number;

        /* Repeat reading until user enters a valid number. */
        while (true) {
            try {
                number = scanner.nextFloat();
                break;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Enter float");
                scanner.nextLine();  // Remove invalid data from scanner.
            }
        }

        return number;
    }

    /**
     * Performs addition of two numbers.
     *
     * @return sum of two numbers
     */
    public static float sum() {
        System.out.println("Enter two numbers");
        float a = getNumber();
        float b = getNumber();

        return a + b;
    }
}
