import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static  void main(String []args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        MathOperations math = new MathOperations();
        ArrayList<String> mode = new ArrayList<String>();

        System.out.println("Zadajte prosím prvé číslo");
        while(!sc.hasNextDouble())
        {
            System.out.println("Nezadali ste číslo");
            System.out.println("\nZadajte prosím prvé číslo");
            sc.next();
        }
        num1 = sc.nextDouble();

        System.out.println("Zadajte prosím druhé číslo");
        while(!sc.hasNextDouble())
        {
            System.out.println("Nezadali ste číslo");
            System.out.println("\nZadajte prosím druhé číslo");
            sc.next();
        }
        num2 = sc.nextDouble();

        System.out.println("*********************");
        System.out.println("\nVyberte mód výpočtu");
        System.out.println("\n1. súčet");
        System.out.println("\n2. rozdiel");
        System.out.println("\n3. súčin");
        System.out.println("\n4. podiel\n");
        System.out.println("\nPre ukončenie režimu vyberu módu zadajte 's'\n");
        System.out.println("*********************");

        while(!sc.hasNext("s")) {
            String value = sc.next();
            switch (value.charAt(0)) {
                case '1':
                case '2':
                case '3':
                case '4':
                    mode.add(value);
                    break;
                default:
                    System.out.println("Nezadali ste správne číslo módu\n");
            }
        }
        for(int i=0;i<mode.size();i++)
        {
            switch (mode.get(i).charAt(0))
            {
                case '1':
                    math.Add(num1,num2);
                    break;
                case '2':
                    math.Diff(num1,num2);
                    break;
                case '3':
                    math.Mult(num1,num2);
                    break;
                case '4':
                    math.Div(num1,num2);
                    break;
                default:
                    System.out.println("\nError");
            }
        }
    }
}
