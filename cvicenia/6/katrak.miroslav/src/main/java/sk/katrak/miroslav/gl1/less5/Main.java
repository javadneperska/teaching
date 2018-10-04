package sk.katrak.miroslav.gl1.less5;

public class Main {


    public static void main(String args[]) {
        int euro = 30;
        Util.printEur(euro);

        int fakt = 3;
        final long faktResult = Util.fakt(3);
        System.out.println("faktorial of number: " + fakt + " is: " + faktResult);

        Person miro = new Person();
        miro.setFirstName("Miro");
        miro.setLastName("Katrak");

        Person miroK = new Person();
        miroK.setFirstName("Miro");
        miroK.setLastName("Katrak");

        printPerson(miro);
        printPerson(miroK);


    }

    private static void printPerson(Person miro) {
        System.out.println("firstName: " +  miro.getFirstName());
        System.out.println("lastName: " +  miro.getLastName());
    }


}
