package sk.kocik.tibor.gl1.less5;

import java.util.Scanner;

public class Util {



    static int scitaj(){
        System.out.println("Give me number");
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        System.out.println("a: " + a);
        b = sc.nextInt();
        System.out.println("b: " + b);
        return (a+b);

        //urobte program ktory nacita 2 externe subory pricom externy subor bude obsahovat maticu cisel 4x4 a druhy 4x4. Prggram nasledne sa spyta uzivatela na nazvy suborov, nacita tieto subory a urobi nasobenie matic a vypise vysledok na obrazovku. podporny program je vytvorenie matic random
    }
}
