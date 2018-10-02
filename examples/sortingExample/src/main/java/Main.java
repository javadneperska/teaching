import sk.dneperska.school.Dob;
import sk.dneperska.school.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static int SON_DOB_YEAR = 1982;
    public static int FATHER_DOB_YEAR = 1959;
    public static int GRAND_FATHER_DOB_YEAR = 1924;

    public static void main(String[] argv) throws CloneNotSupportedException {


        final List<Person> personList = new ArrayList<Person>();

        final Person grandFather = addGrandFather();
        personList.add(grandFather);

        final Person father = addFather(grandFather);
        personList.add(father);

        final Person son = addSon(father);
        personList.add(son);

        Collections.sort(personList);
        printListOfPerson(personList);


    }

    private static void printListOfPerson(List<Person> personList) {
        for (Person person : personList) System.out.println(person);
    }

    private static Person addSon(Person father) throws CloneNotSupportedException {
        final Person son = (Person) father.clone();
        Dob sonDob = new Dob();
        sonDob.setYear(SON_DOB_YEAR);
        son.setDob(sonDob);
        System.out.println("son: " + son);
        return son;
    }

    private static Person addFather(Person grandFather) throws CloneNotSupportedException {
        final Person father = (Person) grandFather.clone();
        Dob fatherDob = new Dob();
        fatherDob.setYear(FATHER_DOB_YEAR);
        father.setDob(fatherDob);
        System.out.println("father: " + father);
        return father;
    }

    private static Person addGrandFather() {
        //grandFather
        final Person grandFather = new Person();
        grandFather.setFirstName("Miroslav");
        grandFather.setLastName("Katrak");
        Dob dob = new Dob();
        dob.setDay(1);
        dob.setYear(GRAND_FATHER_DOB_YEAR);
        dob.setMonth(8);
        grandFather.setDob(dob);
        System.out.println("grandFather: " + grandFather);
        return grandFather;
    }
}
