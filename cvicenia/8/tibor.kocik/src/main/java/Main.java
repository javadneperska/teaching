public class Main {
    public static void main(String[] args) {
        String x2 = "xedo";
        String uppercase = x2.toUpperCase();
        String lowercase = x2.toLowerCase();
        System.out.println(x2);
        System.out.println(uppercase);
        System.out.println(lowercase);
        System.out.println(x2.concat(uppercase.concat(lowercase)));
        String a = "daco";
        System.out.println(a.toString());

        //urobte program, ktory z ext suboru nacita zoznam zamestnancov firmy GL, pricom tam budu ulozene nasledujuce vlastnosti
        //meno, priezvisko, datum nastupu(rok mesiac den), pracovna pozicia, pocet rokov praxe, platy, ...usporiada ludi
        //podla datumu nastupu do zamestnania, resp. umozni uzivatelo vylistovat uzivatelov podla mena priezviska datumu nastupu a prac pozicie
        //pouzite nasledujuce metody v programe: csv, split, sort, arrays.ToString();
    }
}
