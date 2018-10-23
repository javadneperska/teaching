public class Person {
    private int id;
    private String meno,priezvisko, pohlavie, pozicia,nastup;



    public Person(int id, String meno, String priezvisko, String pohlavie, String pozicia, String nastup) {
        this.id = id;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.pohlavie = pohlavie;
        this.pozicia = pozicia;
        this.nastup = nastup;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", pohlavie='" + pohlavie + '\'' +
                ", pozicia='" + pozicia + '\'' +
                ", nastup='" + nastup + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public String getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(String pohlavie) {
        this.pohlavie = pohlavie;
    }

    public String getPozicia() {
        return pozicia;
    }

    public void setPozicia(String pozicia) {
        this.pozicia = pozicia;
    }

    public String getNastup() {
        return nastup;
    }

    public void setNastup(String nastup) {
        this.nastup = nastup;
    }
}
