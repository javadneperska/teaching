
import java.util.Scanner;

public class Main {

    public static  void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Zadajte prosím prvé číslo");
        while(!sc.hasNextInt())
        {
            System.out.println("Nezadali ste číslo");
            System.out.println("\nZadajte prosím prvé číslo");
            sc.next();
        }
        num1 = sc.nextInt();

        System.out.println("Zadajte prosím druhé číslo");
        while(!sc.hasNextInt())
        {
            System.out.println("Nezadali ste číslo");
            System.out.println("\nZadajte prosím druhé číslo");
            sc.next();
        }
        num2 = sc.nextInt();

        System.out.println("Výsledok je: " + (num1+num2));
    }
}
