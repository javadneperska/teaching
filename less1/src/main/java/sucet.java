import java.util.Scanner;
public class Sucet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("*********************");
        System.out.println("* Zadaj prve cislo: *");
        System.out.println("*********************");
        double a = sc.nextInt();

        System.out.println("*********************");
        System.out.println("*Zadaj druhe cislo: *");
        System.out.println("*********************");
        double b = sc.nextInt();

        System.out.println("*********************");
        System.out.println("*Zadaj operaciu:    *");
        System.out.println("*********************");
        int rozhodniSa = sc.nextInt();


        switch (rozhodniSa) {
            case 0:
                double sucet = a + b;
                System.out.println("Sucet je: " + sucet);
                break;
            case 1:
                double rozdiel = a - b;
                System.out.println("Rozdiel je: " + rozdiel);
                break;
            case 2:
                double sucin = a * b;
                ;
                System.out.println("Sucin je: " + sucin);
                break;
            case 3:
                double podiel = a / b;
                System.out.println("Podiel je: " + podiel);
                break;
//            case k:
//                System.out.println("Koniec");
//                break;
            default:
                System.out.println("Koniec");
                break;


        }

    }
}