package sk.zajac.tomas.gl1;

import java.util.Date;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String workPosition;
    private Date dateOfEntry;
    private boolean atWork;

    public Person(int id, String firstName, String lastName, String workPosition, Date dateOfEntry) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.workPosition = workPosition;
        this.dateOfEntry = dateOfEntry;
        atWork = false;
    }

    public Person() {
    }

    public boolean isAtWork() {
        return atWork;
    }

    public void setAtWork(boolean atWork) {
        this.atWork = atWork;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public Date getDateOfEntry() {
        return dateOfEntry;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", workPosition='" + workPosition + '\'' +
                ", dateOfEntry=" + dateOfEntry +
                '}';
    }
}
