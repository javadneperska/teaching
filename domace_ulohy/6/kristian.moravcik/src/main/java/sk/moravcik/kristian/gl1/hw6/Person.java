package sk.moravcik.kristian.gl1.hw6;

public class Person {
    public Person() {
        COUNT_PERSON++;
    }

    private static int COUNT_PERSON = 0;
    private static int COUNT_MALE = 0;
    private static int COUNT_FEMALE = 0;
    private String title;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private String rodne_cislo;
    private String job_title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("Male")) {
            COUNT_MALE++;
        }
        else {
            COUNT_FEMALE++;
        }
        this.gender = gender;
    }

    public String getRodne_cislo() {
        return rodne_cislo;
    }

    public void setRodne_cislo(String rodne_cislo) {
        this.rodne_cislo = rodne_cislo;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public static int getCountPerson() {
        return COUNT_PERSON;
    }

    public static int getCountMale() {
        return COUNT_MALE;
    }

    public String getGenderByRodneCislo() {
        if (Integer.parseInt(rodne_cislo.substring(2,4)) - 50 > 0) {
            return "Zena";
        }
        else {
            return "Muz";
        }
    }
}
