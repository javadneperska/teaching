package sk.katrak.miroslav.gl1.less5;

public class Util {
    public static void printEur(int euro){
        System.out.println("Price is: " + euro  + " eur");
    }

    public static long fakt(long n) {
        if (n > 1)
            return n * fakt(n -1);
        else return 1;
    }
}
