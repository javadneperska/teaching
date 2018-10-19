package sk.katrak.miroslav.gl1.less5;

import java.util.Date;

//VERSION 2
public class Person {

    private int age;
    private String firstName;
    private String lastName;
    private boolean woman = true;
    private Date dob;

//    public Person(int age, String firstName, String lastName, boolean woman, Date dob) {
//        this(firstName, lastName);
//        this.age = age;
//        this.woman = woman;
//        this.dob = dob;
//    }

    public Person() {
    }


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public boolean isWoman() {
        return woman;
    }

    public void setWoman(boolean woman) {
        this.woman = woman;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
