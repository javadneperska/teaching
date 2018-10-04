public class Main {

    public static void main(String[] args) {
        int euro = 6;
        Util.printEur(euro);
        System.out.println("Faktorial " + euro + " je: " + Util.fakt(euro));


        Person ja = new Person("Tibor", "Kocik");

        Person dakto = new Person("Patvaroš", "Božemoj");


        System.out.println("1: " + ja.getFirstName() + ", " + ja.getLastName());
        System.out.println("2: " + dakto.getFirstName() + ", " + dakto.getLastName());
        System.out.println("COUNT_PERSO: " + Person.COUNT_PERSON);

    }

    /*private static Person createPerson(String firstname, String lastname) {   //alt+shift+m   vytvori toto
        Person person = new Person();
        person.setFirstName(firstname);
        person.setLastName(lastname);
        return person;
    }*/

    private static void printPerson(Person tibor)
    {

    }

}
