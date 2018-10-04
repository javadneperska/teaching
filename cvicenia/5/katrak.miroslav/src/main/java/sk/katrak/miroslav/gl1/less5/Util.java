package sk.katrak.miroslav.gl1.less5;

import java.util.Scanner;

public class Util {

    /**
     * Count 2 numbers
     * @return
     */
    public static int add2numbers() {
        System.out.println("Give me number:");
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        System.out.println("a: " + a);
        b = sc.nextInt();
        System.out.println("b: " + b);
        return (a + b);
    }

}
