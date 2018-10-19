package sk.zajac.tomas.gl1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

    private String firstName;
    private String lastName;
    private Date dateStart;
    private String workTitle;
    private int yearsOfExperience;
    private int salary;

    @Override
    public String toString() {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(dateStart);

        return String.format("%-15s %-15s %-15s %-20s %-5d %-10d ", firstName, lastName, date, workTitle, yearsOfExperience, salary);
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    Date getDateStart() {
        return dateStart;
    }

    void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    String getWorkTitle() {
        return workTitle;
    }

    void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }

    int getYearsOfExperience() {
        return yearsOfExperience;
    }

    void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }
}
