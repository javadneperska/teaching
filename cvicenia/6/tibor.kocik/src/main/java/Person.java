public class Person {

    public static int COUNT_PERSON = 0;
    private String firstName;
    private String lastName;


    public Person()
    {
        COUNT_PERSON ++;
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
}
