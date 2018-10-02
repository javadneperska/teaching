package sk.kovacova.milota.gl1.less4;

public class Main {


    public static void main(String args[]) {

        System.out.println("less 4");


        int x = 3;

        int vysledok;
        vysledok = isOdd(x);

        if(vysledok == 0){
            System.out.println("Parne");
        }else {
            System.out.println("Neparne");
        }

}

    public static int isOdd(int x) {
        if (x % 2 == 0) {
            return 0;
        }else {
            return 1;
        }
    }
}
