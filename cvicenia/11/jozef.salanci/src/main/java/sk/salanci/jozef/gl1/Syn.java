package sk.salanci.jozef.gl1;

public class Syn extends Otec {

    public String firstname;
    public String secondname;

    @Override
    public String getFirstname() {
        return firstname;
    }

    @Override
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String getSecondname() {
        return secondname;
    }

    @Override
    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }
}
