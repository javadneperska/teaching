package sk.mocarsky.tomas.gl1.less4;

public class Main {
    public static void main(String []args) {
        System.out.println("Hello Pepe");
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Pepe");
        int n;

        //fori
        for (int i = 0; i < 2; i++) {
            System.out.println(i);
        }

        System.out.println("Zadaj cislo");
        n = sc.nextInt();
        num(n);

    }

    public static int num(double n) {
        if (n%2 == 0) {
            System.out.println("Parne");
            return 0;
        } else {
            System.out.println("Neparne");
            return 0;
        }
        //return (n%2 == 0) ? 0 : 1;
    }
}
