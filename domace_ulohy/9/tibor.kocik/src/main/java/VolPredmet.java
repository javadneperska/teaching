public class VolPredmet {
    private static String predmet;
    private static String vyucujuci;
    private static int pocet_hodin;
    private static int skuska;

    public VolPredmet(String predmet, String vyucujuci, int pocet_hodin, int skuska) {
        this.predmet = predmet;
        this.vyucujuci = vyucujuci;
        this.pocet_hodin = pocet_hodin;
        this.skuska = skuska;
    }
    @Override
    public String toString() {
        return "Person{" +
                "predmet='" + predmet + '\'' +
                ", vyucujuci='" + vyucujuci + '\'' +
                ", pocet_hodin='" + pocet_hodin + '\'' +
                ", skuska='" + skuska +
                '}';
    }

    public static String getPredmet() {
        return predmet;
    }

    public static void setPredmet(String predmet) {
        VolPredmet.predmet = predmet;
    }

    public static String getVyucujuci() {
        return vyucujuci;
    }

    public static void setVyucujuci(String vyucujuci) {
        VolPredmet.vyucujuci = vyucujuci;
    }

    public static int getPocetHodin() {
        return pocet_hodin;
    }

    public static void setPocetHodin(int pocet_hodin) {
        VolPredmet.pocet_hodin = pocet_hodin;
    }

    public static int getSkuska() {
        return skuska;
    }

    public static void setSkuska(int skuska) {
        VolPredmet.skuska = skuska;
    }
}