package sk.dneperska.school;

public class Person implements Cloneable, Comparable<Person> {

    private String firstName;
    private String lastName;
    private Dob dob;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
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

    public Dob getDob() {
        return dob;
    }

    public void setDob(Dob dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                '}';
    }


    public int compareTo(Person o) {
        if (dob.getYear() > o.getDob().getYear())
            return 1;
        else if (dob.getYear() < o.getDob().getYear())
            return -1;
        else
            return 0;
    }
}
