package sk.katrak.miroslav.gl1.less9;

public class Student {

    private String firstName;
    private String lastName;
    private PersonDate dob;

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

    public PersonDate getDob() {
        return dob;
    }

    public void setDob(PersonDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                '}';
    }
}
