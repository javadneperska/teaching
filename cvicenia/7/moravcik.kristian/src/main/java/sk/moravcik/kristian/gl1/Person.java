package sk.moravcik.kristian.gl1;

public class Person {
    private static int COUNT_PERSON = 0;
    private String fname;
    private String lname;

    public Person(String fname, String lname) {
        COUNT_PERSON++;
        this.fname = fname;
        this.lname = lname;
    }

    public void printName() {
        System.out.println(fname + lname);
    }

    public static int getCountPerson() {
        return COUNT_PERSON;
    }
}
