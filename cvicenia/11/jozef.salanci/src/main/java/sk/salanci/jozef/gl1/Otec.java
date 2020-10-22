package sk.salanci.jozef.gl1;

public class Otec {
    public String firstname;
    public String secondname;
    public Majetok majetok;

    public Majetok getMajetok() {
        return majetok;
    }

    public void setMajetok(Majetok majetok) {
        this.majetok = majetok;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
