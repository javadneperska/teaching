package sk.robovarga.les5;

import java.util.Scanner;

public class Util {

    public static int add(){

        System.out.println("Give me a numbers");
        Scanner sc = new Scanner(System.in);

        int a,b;

        a= sc.nextInt();
        System.out.println("a = " + a);
        b= sc.nextInt();
        System.out.println("b = " + b);

        return (a+b);

    }
}
