public class Main {

    public static void main(String[] args) {
        int euro = 6;
        Util.printEur(euro);
        System.out.println("Faktorial " + euro + " je: " + Util.fakt(euro));

        Person ja = new Person();
        Person dakto = new Person();

        ja.setFirstName("Tibor");
        ja.setLastName("Kocik");

        dakto.setFirstName("Patvaroš");
        dakto.setLastName("Božemoj");

        System.out.println("1: " + ja.getFirstName() + ", " + ja.getLastName());
        System.out.println("2: " + dakto.getFirstName() + ", " + dakto.getLastName());
        System.out.println("COUNT_PERSO: " + Person.COUNT_PERSON);
    }

}
