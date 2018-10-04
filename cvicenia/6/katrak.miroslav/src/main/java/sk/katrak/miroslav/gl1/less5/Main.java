package sk.katrak.miroslav.gl1.less5;

public class Main {


    public static void main(String args[]) {
        int euro = 30;
        Util.printEur(euro);

        int fakt = 3;
        final long faktResult = Util.fakt(3);
        System.out.println("faktorial of number: " + fakt + " is: " + faktResult);

        Person jakub = new Person();
        jakub.setFirstName("Jakub");
        jakub.setLastName("Katrak");

        Person miro = new Person("Mirko", "Katrak");
        Person miroK = new Person("Miro", "Katrak");

        printPerson(miro);
        printPerson(miroK);

        System.out.println("COUNT_PERSON: " + Person.COUNT_PERSON);


    }

    private static void printPerson(Person miro) {
        System.out.println("firstName: " + miro.getFirstName());
        System.out.println("lastName: " + miro.getLastName());
    }


}
