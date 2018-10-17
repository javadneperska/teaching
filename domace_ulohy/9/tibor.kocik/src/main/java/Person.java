public class Person {
    private static String meno;
    private static String predmet1;
    private static String predmet2;
    private static String volPredmet;

    public Person(String meno, String predmet1, String predmet2, String volPredmet) {
        this.meno = meno;
        this.predmet1 = predmet1;
        this.predmet2 = predmet2;
        this.volPredmet = volPredmet;
    }


    public static String getMeno() {
        return meno;
    }

    public static void setMeno(String meno) {
        Person.meno = meno;
    }

    public static String getPredmet1() {
        return predmet1;
    }

    public static void setPredmet1(String predmet1) {
        Person.predmet1 = predmet1;
    }

    public static String getPredmet2() {
        return predmet2;
    }

    public static void setPredmet2(String predmet2) {
        Person.predmet2 = predmet2;
    }

    public static String getVolPredmet() {
        return volPredmet;
    }

    public static void setVolPredmet(String volPredmet) {
        Person.volPredmet = volPredmet;
    }
}
