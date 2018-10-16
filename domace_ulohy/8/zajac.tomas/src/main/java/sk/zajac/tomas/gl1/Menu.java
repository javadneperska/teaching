package sk.zajac.tomas.gl1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static final String NL = "\n";
    private static Scanner scanner = new Scanner(System.in);

    static void printMenu() {

        StringBuffer menu = new StringBuffer("Zorad podla: ");
        menu.append(NL);
        menu.append("1. Mena");
        menu.append(NL);
        menu.append("2. Priezviska");
        menu.append(NL);
        menu.append("3. Datumu nastupu");
        menu.append(NL);
        menu.append("4. Pracovnej pozicie");
        menu.append(NL);
        menu.append("5. Rokov praxe");
        menu.append(NL);
        menu.append("6. Platu");
        menu.append(NL);
        menu.append("7. Skoncit program");

        System.out.println(menu.toString());

        inputListener();
    }

    @SuppressWarnings("InfiniteLoopStatement")
    private static void inputListener() {

        do {
            try {
                int input = scanner.nextInt();

                switch (input) {
                    case 1:
                        Sort_Operations.sortByFirstName(Main.employeeRecordsFromCSV);
                        break;
                    case 2:
                        Sort_Operations.sortByLastName(Main.employeeRecordsFromCSV);
                        break;
                    case 3:
                        Sort_Operations.sortByDate(Main.employeeRecordsFromCSV);
                        break;
                    case 4:
                        Sort_Operations.sortByWorkTitle(Main.employeeRecordsFromCSV);
                        break;
                    case 5:
                        Sort_Operations.sortByExperience(Main.employeeRecordsFromCSV);
                        break;
                    case 6:
                        Sort_Operations.sortBySalary(Main.employeeRecordsFromCSV);
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Incorrect menu choice");
                }

            } catch (InputMismatchException e) {
                System.out.println("Incorrect menu choice");
                scanner.next();
            }
        } while (true);
    }


    static void switcher() {
        do {
            System.out.println("Sort again? Y/N");
            String scan = scanner.next();

            switch (scan.toLowerCase()) {
                case "y":
                    printMenu();
                    break;
                case "n":
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect choice");
            }
        } while (true);
    }
}
