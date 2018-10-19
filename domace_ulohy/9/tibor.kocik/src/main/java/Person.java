public class Person {
    private static String meno;
    private static Predmet predmet1;
    private static Predmet predmet2;
    private static VolPredmet volPredmet;

    public Person(String meno, Predmet predmet1, Predmet predmet2, VolPredmet volPredmet) {
        this.meno = meno;
        this.predmet1 = predmet1;
        this.predmet2 = predmet2;
        this.volPredmet = volPredmet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "meno='" + meno + '\'' +
                ", predmet1='" + predmet1.toString() + '\'' +
                ", predmet2='" + predmet2.toString() + '\'' +
                ", volPredmet='" + volPredmet.toString() +
                '}';
    }

    public static String getMeno() {
        return meno;
    }

    public static void setMeno(String meno) {
        Person.meno = meno;
    }

    public static Predmet getPredmet1() {
        return predmet1;
    }

    public static void setPredmet1(Predmet predmet1) {
        Person.predmet1 = predmet1;
    }

    public static Predmet getPredmet2() {
        return predmet2;
    }

    public static void setPredmet2(Predmet predmet2) {
        Person.predmet2 = predmet2;
    }

    public static VolPredmet getVolPredmet() {
        return volPredmet;
    }

    public static void setVolPredmet(VolPredmet volPredmet) {
        Person.volPredmet = volPredmet;
    }

}