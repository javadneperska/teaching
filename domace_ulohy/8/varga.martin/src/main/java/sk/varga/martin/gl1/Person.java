package sk.varga.martin.gl1;

public class Person {

    private static int PERSON_COUNT = 0;
    public Person(){
        PERSON_COUNT ++;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEntryIntoEmployment() {
        return entryIntoEmployment;
    }

    public void setEntryIntoEmployment(String entryIntoEmployment) {
        this.entryIntoEmployment = entryIntoEmployment;
    }

    public double getYearsOfPractice() {
        return yearsOfPractice;
    }

    public void setYearsOfPractice(double yearsOfPractice) {
        this.yearsOfPractice = yearsOfPractice;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String firstName;
    private String lastName;
    private Gender gender;
    private String entryIntoEmployment;
    private double yearsOfPractice;
    private String position;
}
