package sk.moravcik.kristian.gl1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson4");
        System.out.println(parneNeparne(2));
    }

    public static int parneNeparne(int cislo) {
        return (cislo % 2 == 0) ? 0 : 1;
    }


}
