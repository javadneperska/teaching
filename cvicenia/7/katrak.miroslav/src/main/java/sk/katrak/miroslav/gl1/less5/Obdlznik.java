package sk.katrak.miroslav.gl1.less5;

public class Obdlznik {

    private int sirka;
    private int vyska;

    public Obdlznik(int sirka, int vyska) {
        this.sirka = sirka;
        this.vyska = vyska;
    }

    public double dlzkaUhlopriecky() {
        double pom;
        pom = (sirka * sirka) + (vyska * vyska);
//        pom = Math.sqrt(pom);

        pom = sqrt(pom);
        return pom;
    }

    public static double sqrt(final double pom){
        return Math.sqrt(pom);
    }
}
