package sk.zajac.tomas.gl1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static final String NL = "\n";
    private static Scanner scanner = new Scanner(System.in);

    public static void printMenu() {

        StringBuffer menu = new StringBuffer();
        menu.append(NL);
        menu.append("1. Print All employees");
        menu.append(NL);
        menu.append("2. Search for employee");
        menu.append(NL);
        menu.append("3. Add new employee // TBD");
        menu.append(NL);
        menu.append("4. Exit");
        menu.append(NL);
        menu.append("5. Back");
        menu.append(NL);

        System.out.println(menu.toString());

        mainInputListener();
    }

    private static void mainInputListener() {
        do {
            try {
                int input = scanner.nextInt();

                switch (input) {
                    case 1:
                        printAllEmployees(Main.employees);
                        break;
                    case 2:
                        printSearchForEmployeeMenu();
                        break;
                    case 3:
                        System.out.println("Not yet implemented :( ");
                        printAllEmployees(Main.employees);
//                        CreateAndPopulateDB.addNewEmployee();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        System.exit(0);
                    case 5:
                        Main.mainLoop();
                        break;
                    default:
                        System.out.println("Incorrect menu choice");
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect menu choice");
                scanner.next();
            }
        } while (true);
    }

    private static void printSearchForEmployeeMenu() {

        StringBuffer menu = new StringBuffer();
        menu.append(NL);
        menu.append("1. Search by ID");
        menu.append(NL);
        menu.append("2. Search by First Name");
        menu.append(NL);
        menu.append("3. Search by Last Name");
        menu.append(NL);
        menu.append("4. Back to Main Menu");
        menu.append(NL);

        System.out.println(menu.toString());

        searchInputListener();

    }

    private static void searchInputListener() {
        do {
            try {
                int input = scanner.nextInt();

                switch (input) {
                    case 1:
                        searchById(Main.employees);
                        break;
                    case 2:
                        searchByFirstName(Main.employees);
                        break;
                    case 3:
                        searchByLastName(Main.employees);
                        break;
                    case 4:
                        printMenu();
                        break;
                    default:
                        System.out.println("Incorrect menu choice");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect menu choice");
                scanner.next();
            }
        } while (true);
    }

    private static void searchByLastName(List<Employee> employees) {
        System.out.println("Enter Employee Last Name: ");
        String input = scanner.next();

        for (Employee e : employees) {
            if (input.equalsIgnoreCase(e.getLastName())) {
                String atWork = e.isAtWork() ? " IS at work " : " IS NOT at work ";
                System.out.println(e.getFirstName() + " " + e.getLastName() + atWork + " and has worked for " + e.getSecondsAtWork() + " seconds.");
            }
        }
        printSearchForEmployeeMenu();
    }

    private static void searchByFirstName(List<Employee> employees) {
        System.out.println("Enter Employee First Name: ");
        String input = scanner.next();

        for (Employee e : employees) {
            if (input.equalsIgnoreCase(e.getFirstName())) {
                String atWork = e.isAtWork() ? " IS at work " : " IS NOT at work ";
                System.out.println(e.getFirstName() + " " + e.getLastName() + atWork + " and has worked for " + e.getSecondsAtWork() + " seconds.");
            }
        }
        printSearchForEmployeeMenu();
    }

    private static void searchById(List<Employee> employees) {
        System.out.println("Enter Employee ID: ");
        int input = scanner.nextInt();

        for (Employee e : employees) {
            if (input == e.getId()) {
                String atWork = e.isAtWork() ? " IS at work " : " IS NOT at work ";
                System.out.println(e.getFirstName() + " " + e.getLastName() + atWork + "and has worked for " + e.getSecondsAtWork() + " seconds.");
            }
        }
        printSearchForEmployeeMenu();
    }

    public static void printAllEmployees(List<Employee> employees) {
        System.out.println(" ____________________________________________________________");
        System.out.printf("| %-2s | %-25s | %-10s | %-11s | \n", "ID", "Name", "Is at Work", "Worked Time");
        System.out.println(" ____________________________________________________________");

        for (Employee e : employees) {
            String atWork = e.isAtWork() ? " X " : " ";

            System.out.printf("| %-2s | %-25s | %-10s | %-11s | \n", e.getId(), e.getFirstName() + " " + e.getLastName(), atWork, e.getHoursAtWork());
        }
        System.out.println(" ____________________________________________________________");
        printMenu();
    }
}
