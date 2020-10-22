package sk.salanci.jozef.gl1;

import java.util.Date;

public class Student {



    public String firstName;
    public String lastName;
    public Datum narodeniny;

    public Student(String firstName, String lastName, Datum narodeniny) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.narodeniny = narodeniny;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Datum getNarodeniny() {
        return narodeniny;
    }

    public void setNarodeniny(Datum narodeniny) {
        this.narodeniny = narodeniny;
    }
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", narodeniny=" + narodeniny +
                '}';
    }
}
