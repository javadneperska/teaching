package sk.durisin.jozef.gl1.less5;

import java.util.Scanner;


public class Util {
    public static int addNumber() {
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        a = sc.nextInt();
        b = sc.nextInt();

        return (a + b);
    }
}
