public class Util {
    public static void printEur(int eura)
    {
        System.out.println("Cena: " + eura + " Eur");
    }

    public static long fakt(long n)
    {
        if(n>1)
        {
            return n*fakt(n-1);
        }
        else return 1;
    }
}
