package sk.zajac.tomas.gl1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Employee> employees = new ArrayList<>();
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            employees = CreateAndPopulateDB.CreateDB();
        } catch (Exception e) {
            System.out.println("The database creation has FAILED!");
            e.printStackTrace();
        }

        mainLoop();

    }

    /**
     * Goes through all employees - selects the employee from input ID
     * if employee is not at work - saves the time when he arrived and marks him at work
     * if employee is at work - calculates the time he was at work and increments his total time - marks him not at work
     */
    public static void mainLoop() {
        while (true) {
            System.out.println("Press 'm' for Menu");

            String inputId = sc.next();

            if (inputId.equalsIgnoreCase("m")) {
                Menu.printMenu();
            }

            int i = Integer.parseInt(inputId);

            for (Employee e : employees) {
                if (e.getId() == i) {
                    if (!e.isAtWork()) {
                        e.setStartTime();
                        System.out.println(e.getFirstName() + " " + e.getLastName() + " came to work at " + dtf.format(e.getStartTime()));
                        e.setAtWork(true);
                        break;
                    } else {
                        LocalDateTime future = e.getFutureTime();
                        System.out.println(e.getFirstName() + " " + e.getLastName() + " left the work " + dtf.format(future));
                        e.timeDifference(e.getStartTime(), future);
                        System.out.println(e.getFirstName() + " " + e.getLastName() + " : " + e.getSecondsAtWork() + " seconds");
                        e.setAtWork(false);
                        break;
                    }
                }
            }
        }
    }
}
