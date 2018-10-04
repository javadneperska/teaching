package sk.varga.martin.gl1;

public class Util {

    public static void printEur(int euros){
        System.out.println("Euro: " + euros + "€");
    }

    public static int factorial(int n){
        if(n > 1){
            return n * factorial(n-1);
        }
        else{
            return 1;
        }
    }
}
