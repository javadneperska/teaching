/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Boss
 */
public class Person {

    private String firstName;
    private String lastName;
    private String title;
    private String birthNumber;
    private int age;
    private Gender gender;
    public static int counter = 0;


    public Person(String firstName, String lastName, String title, String birthNumber, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.birthNumber = birthNumber;
        this.age = age;
        this.gender = gender;
        counter++;
    }
    public Person(){

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBirthNumber() {
        return birthNumber;
    }

    public void setBirthNumber(String birthNumber) {
        this.birthNumber = birthNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public final void printGender() {
        System.out.println(gender.name());
    }


}
