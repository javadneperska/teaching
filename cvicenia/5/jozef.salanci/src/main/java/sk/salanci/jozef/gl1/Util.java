package sk.salanci.jozef.gl1;

import java.util.Scanner;

public class Util {

    static int add2numbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Util");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        return (a + b);
    }

}
