public class Person {
    public static int COUNT_PERSON = 0;

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        COUNT_PERSON++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
        COUNT_PERSON++;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "First name: " + firstName + ", Last name: " + lastName;
    }
}

/// zoznam stundentov z csv
// minimalne 7 vlastnosti ma kazda osoba
// scita pocet zien a muzov na zaklade rodneho cisla
