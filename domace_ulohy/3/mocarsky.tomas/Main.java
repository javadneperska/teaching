import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner language = new Scanner(System.in);
        Scanner endProgram = new Scanner(System.in);

        String en[] = {"Summary", "Subtract", "Multiply", "Divide"};
        String sk[] = {"Pripocitanie", "Odpocitanie", "Nasobenie", "Delenie"};
        String numbersOperations[] = {"+", "-", "*", "/"};
        String lang[] = new String[4];

        int ret[] = new int[4];
        String l;
        String end = null;
        String op;
        double numA = 0;
        double numB = 0;

        System.out.println("__________████████_____██████\n" +
                "_________█░░░░░░░░██_██░░░░░░█\n" +
                "________█░░░░░░░░░░░█░░░░░░░░░█\n" +
                "_______█░░░░░░░███░░░█░░░░░░░░░█\n" +
                "_______█░░░░███░░░███░█░░░████░█\n" +
                "______█░░░██░░░░░░░░███░██░░░░██\n" +
                "_____█░░░░░░░░░░░░░░░░░█░░░░░░░░███\n" +
                "____█░░░░░░░░░░░░░██████░░░░░████░░█\n" +
                "____█░░░░░░░░░█████░░░████░░██░░██░░█\n" +
                "___██░░░░░░░███░░░░░░░░░░█░░░░░░░░███\n" +
                "__█░░░░░░░░░░░░░░█████████░░█████████\n" +
                "_█░░░░░░░░░░█████_████___████_█████___█\n" +
                "_█░░░░░░░░░░█______█_███__█_____███_█___█\n" +
                "█░░░░░░░░░░░░█___████_████____██_██████\n" +
                "░░░░░░░░░░░░░█████████░░░████████░░░█\n" +
                "░░░░░░░░░░░░░░░░█░░░░░█░░░░░░░░░░░░█\n" +
                "░░░░░░░░░░░░░░░░░░░░██░░░░█░░░░░░██\n" +
                "░░░░░░░░░░░░░░░░░░██░░░░░░░███████\n" +
                "░░░░░░░░░░░░░░░░██░░░░░░░░░░█░░░░░█\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█\n" +
                "░░░░░░░░░░░█████████░░░░░░░░░░░░░░██\n" +
                "░░░░░░░░░░█▒▒▒▒▒▒▒▒███████████████▒▒█\n" +
                "░░░░░░░░░█▒▒███████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█\n" +
                "░░░░░░░░░█▒▒▒▒▒▒▒▒▒█████████████████\n" +
                "░░░░░░░░░░████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█\n" +
                "░░░░░░░░░░░░░░░░░░██████████████████\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█\n" +
                "██░░░░░░░░░░░░░░░░░░░░░░░░░░░██\n" +
                "▓██░░░░░░░░░░░░░░░░░░░░░░░░██\n" +
                "▓▓▓███░░░░░░░░░░░░░░░░░░░░█\n" +
                "▓▓▓▓▓▓███░░░░░░░░░░░░░░░██\n" +
                "▓▓▓▓▓▓▓▓▓███████████████▓▓█\n" +
                "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██\n" +
                "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\n" +
                "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█");


        do {
            System.out.print("Choose the language/ Zvolit jazyk (en/sk): ");
            l = language.nextLine();
            if (!l.equalsIgnoreCase("EN") && !l.equalsIgnoreCase("SK")) {
                System.out.println("Wrong choice/ Nespravna volba.");
            } else {
                Lang.greet(l);
            }
        } while (!l.equalsIgnoreCase("EN") && !l.equalsIgnoreCase("SK"));


        if (l.equalsIgnoreCase("EN")) {
            lang = en;

        } else if (l.equalsIgnoreCase("SK")) {
            lang = sk;
        }

        while (end == null || !end.equalsIgnoreCase("N")) {
            if (l.equalsIgnoreCase("EN")) {
                System.out.println();

                System.out.print("Add value A: ");
                numA = sc.nextInt();
                System.out.print("Add value B: ");
                numB = sc.nextInt();

            } else if (l.equalsIgnoreCase("SK")) {

                System.out.println();

                System.out.print("Zadaj hodnotu A: ");
                numA = sc.nextInt();
                System.out.print("Zadaj hodnotu B: ");
                numB = sc.nextInt();
            }

            Lang.operation(l);
            for (int i = 0; i < lang.length; i++) {
                System.out.printf("%s%s: ", lang[i], "?");
                op = input.nextLine();
                if (op.equalsIgnoreCase("Y")) {
                    ret[i] = i + 1;
                } else if (op.equalsIgnoreCase("N")) {
                    ret[i] = 0;
                } else if (op.equalsIgnoreCase("Q")) {
                    break;
                } else {
                    System.out.println("No key");
                }
            }

            System.out.println();
            for (int i = 0; i < lang.length; i++) {
                if (ret[i] != 0) {
                    System.out.printf("%.1f %s %.1f = %.2f\n", numA, numbersOperations[i], numB, result(numA, numB, ret[i]));
                }
            }
            Lang.ends(l);
            end = endProgram.nextLine();
        }
        Lang.farewell(l);
    }

    private static double result(double numA, double numB, int res) {
        switch (res) {
            case 1:
                return numA + numB;
            case 2:
                return numA - numB;
            case 3:
                return numA * numB;
            case 4:
                return numA / numB;
            default:
                System.out.println("Nope.");
        }
        return 0;
    }
}

class Lang {
    static void greet(String l) {
        if (l.equalsIgnoreCase("EN")) {
            System.out.println("Hello stranger!");

        } else if (l.equalsIgnoreCase("SK")) {
            System.out.println("Ahoj pozemstan!");
        }
    }

    static void operation(String l) {
        if (l.equalsIgnoreCase("EN")) {
            System.out.println("Please choice the operation. For leaving program press Q.");
        } else if (l.equalsIgnoreCase("SK")) {
            System.out.println("Zvol si operaciu. Pre opustenie programu stlac Q");
        }
    }

    static void farewell(String l) {
        if (l.equalsIgnoreCase("EN")) {
            System.out.println("Good bye!");
        } else if (l.equalsIgnoreCase("SK")) {
            System.out.println("Dovidenia.");
        }
    }

    static void ends(String l) {
        if (l.equalsIgnoreCase("EN")) {
            System.out.print("Continue? Y/N ");
        } else if (l.equalsIgnoreCase("SK")) {
            System.out.print("Pokracovat? Y/N ");
        }
    }
}
