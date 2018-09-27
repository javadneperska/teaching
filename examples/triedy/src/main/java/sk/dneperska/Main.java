package sk.dneperska;

public class Main {

    public static void main(String[] argv) {

        final Obdlznik obdl1 = new Obdlznik(5, 4);
        obdl1.printResult(SupportedMethod.OBVOD);

        final Obdlznik obdl2 = new Obdlznik(3, 4);
        obdl2.printResult(SupportedMethod.OBSAH);

        final Obdlznik obdl3 = new Obdlznik(4, 6);
        obdl3.printAllResults();

        final Stvorec stv1 = new Stvorec(5);
        stv1.printAllResults();
    }
}
