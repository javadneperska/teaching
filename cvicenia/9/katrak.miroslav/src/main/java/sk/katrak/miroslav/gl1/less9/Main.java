package sk.katrak.miroslav.gl1.less9;

public class Main {

    public static final String NL = "\n";

    public static void main(String args[]) {

        Student miro = new Student();
        miro.setFirstName("miro");
        miro.setLastName("katrak");
        PersonDate miroDob =  new PersonDate(8, 1, 1982);
        miro.setDob(miroDob);
        miro.setMoney(5000L);


        System.out.println("miro: " + miro.toString());

    }

}
