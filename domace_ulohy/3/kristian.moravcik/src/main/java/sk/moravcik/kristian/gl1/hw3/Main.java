package sk.moravcik.kristian.gl1.hw3;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<String, String>();

        System.out.println("Welcome to Calculus / Vita Vas aplikacia Calculus");
        System.out.print("Select language / Vyberte jazyk (EN - 1, SK - 2): ");
        int langChoice = sc.nextInt();
        Calculator c = new Calculator();
        c.setLang(langChoice);
        System.out.print(c.getMap().get(c.getLang()+"num1"));
        double a = sc.nextDouble();

        System.out.print(c.getMap().get(c.getLang()+"num2"));
        double b = sc.nextDouble();

        boolean exit = false;

        do {
            System.out.println("1. " + c.getMap().get(c.getLang()+"add"));
            System.out.println("2. " + c.getMap().get(c.getLang()+"mul"));
            System.out.println("3. " + c.getMap().get(c.getLang()+"div"));
            System.out.println("0. " + c.getMap().get(c.getLang()+"quit"));
            System.out.print("\n");
            System.out.print(c.getMap().get(c.getLang()+"choice"));
            int num = sc.nextInt();

            switch(num) {
                case 1:
                    System.out.print(c.getMap().get(c.getLang()+"addres") + c.add(a, b));
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.print(c.getMap().get(c.getLang()+"mulres") + c.mul(a, b));
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.print(c.getMap().get(c.getLang()+"divres") + c.div(a, b));
                    System.out.println("\n");
                    break;
                case 0:
                    exit=true;
                    break;
            }
        } while(!exit);
    }
}