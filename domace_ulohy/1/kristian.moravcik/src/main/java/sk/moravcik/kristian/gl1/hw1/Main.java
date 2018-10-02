package sk.moravcik.kristian.gl1.hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("This program prints out the sum of two numbers entered by user.");
        System.out.print("Enter first number: ");
        int i = reader.nextInt();
        System.out.print("Enter second number: ");
        int j = reader.nextInt();
        System.out.printf("Sum: %d", i+j);
        reader.close();
    }
}
