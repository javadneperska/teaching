public class Util {
    public static void printEuro(int euro) {
        System.out.println("Price: " + euro + "Eur");
    }

    public static int fact(int n) {
        if (n > 0) {
            return n * fact(n-1);
        } else {
            return 1;
        }
    }
}
