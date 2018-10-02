package sk.katrak.miroslav.gl1.less4;

public class Main {


    public static void main(String args[]) {
        System.out.println("less 4");

        //urob metody ktora vrati 0 ak je to parne cislo
        // ak neparne tak 1

        int x = 4;
        int y = 3;

        final boolean even = isEve(x);
        System.out.print    ln("x: " + even);

        final boolean evenY = isEve(y);
        System.out.println("y: " + evenY);

    }

    private static final boolean isEve(final int a){
        return (a%2==0);
    }

    private static int isEven(int a) {
        return (a % 2 == 0) ? 0 : 1;

//        if (a % 2 == 0) {
//            return 0;
//        } else
//            return 1;
    }


}