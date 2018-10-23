public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Majetok m = new Majetok(500);
        Otec syn, otec = new Otec("Patvaros", "Nigel", m);

        syn = (Otec) otec.clone();
        System.out.println("otec: " + otec.meno + " " + otec.priezvisko + " " + otec.majetok.majetok);
        System.out.println("syn: " + syn.meno + " " + syn.priezvisko + " " + syn.majetok.majetok);
        otec.meno = "Ferko";
        otec.majetok.majetok = 400000;
        System.out.println("otec: " + otec.meno + " " + otec.priezvisko + " " + otec.majetok.majetok);
        System.out.println("syn: " + syn.meno + " " + syn.priezvisko + " " + syn.majetok.majetok);


    }
}
