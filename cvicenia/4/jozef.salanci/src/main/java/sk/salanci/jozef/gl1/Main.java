package sk.salanci.jozef.gl1;


public class Main {

public static int odd(int cislo){
        if (cislo%2==0){
        return 0;
        }
        else {
        return 1;
        }
}
    public static void main(String[] args) {
        System.out.println("lesson4");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        odd(2);
        odd(3);

        System.out.println(odd(2));
        System.out.println(odd(3));
    }
}
