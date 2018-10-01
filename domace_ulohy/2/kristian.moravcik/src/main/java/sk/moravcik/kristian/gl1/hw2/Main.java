package sk.moravcik.kristian.gl1.hw2;

import java.util.Scanner;

public class Main {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program functions as a simple calculator.");
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        boolean exit = false;

        do {
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Division");
            System.out.println("0. Exit");
            System.out.print("\n");
            System.out.print("Enter your choice: ");
            int num = sc.nextInt();

            switch(num) {
                case 1:
                    System.out.print("Result of addition: " + add(a, b));
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.print("Result of multiplication: " + mul(a, b));
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.print("Result of division: " + div(a, b));
                    System.out.println("\n");
                    break;
                case 0:
                    exit=true;
                    break;
            }
        } while(!exit);
    }
}