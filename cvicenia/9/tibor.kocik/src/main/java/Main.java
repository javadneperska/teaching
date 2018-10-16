public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        DateStudent dob = new DateStudent(3,5,1994);

        student1.setFirstName("Fero");
        student1.setLastName("Ferovsky");
        student1.setDate(dob);
        System.out.println(student1);

        //DU 9 - Urobte program, ktory z lokalneho file systemu alebo z lubovolnej DB nacita zoznam studentov, kazdy student bude mat
        //minimalne 3 predmety, 2 volitelne 1 volitelny, s tym že, predmet bude mať udavane info ako:
        // vyučujúci, počet hodin do tyzdna, či konči skuškov (true false ) a návaznosť(iba jednu)

    }
}
