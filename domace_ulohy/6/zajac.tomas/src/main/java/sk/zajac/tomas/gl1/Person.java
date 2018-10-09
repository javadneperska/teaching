package sk.zajac.tomas.gl1;

public class Person {

    static int COUNT_PERSON = 0;

    private String firstName;
    private String lastName;
    private String birthNumber;
    private String sex;
    private int height;
    private double weight;
    private String occupation;
    private String bloodType;
    private String favoriteColor;

    public Person(String firstName, String lastName, String birthNumber, String sex, int height, double weight, String occupation, String bloodType, String favoriteColor) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthNumber = birthNumber;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.occupation = occupation;
        this.bloodType = bloodType;
        this.favoriteColor = favoriteColor;
    }

    public Person(){
        COUNT_PERSON++;
    }

    @Override
    public String toString() {
        return ("First Name: " + this.getFirstName() +
                "   Last Name: " + this.getLastName() +
                "   Birth Number: "+ this.getBirthNumber() +
                "   Sex: " + this.getSex()) +
                "   Height: " + this.getHeight() +
                "   Weight: " + this.getWeight() +
                "   Occupation: " + this.getOccupation() +
                "   Blood Type: " + this.getBloodType() +
                "   Fav Color: " + this.getFavoriteColor();
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

    public String getBirthNumber() {
        return birthNumber;
    }

    public void setBirthNumber(String birthNumber) {
        this.birthNumber = birthNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
}