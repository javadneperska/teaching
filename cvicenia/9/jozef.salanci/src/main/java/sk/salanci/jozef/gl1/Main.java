package sk.salanci.jozef.gl1;


public class Main {

    public static void main(String[] args) {
        System.out.println("lesson9");
        Student a =new Student();
        a.setFirstName("Dodo");
        a.setLastName("Salanci");
        Datum narodky =new Datum(1, 1, 1900);
        a.setNarodeniny(narodky);



        System.out.println(a.getFirstName());
        System.out.println(a.getLastName());
        System.out.println(a.getNarodeniny().toString());

        System.out.println(a.toString());

        System.out.println("==============");


    }
}