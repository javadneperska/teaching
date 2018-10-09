package sk.zajac.tomas.gl1;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = CSVOperations.parseCSV("src/main/resources/Persons.csv");

        System.out.println("1. Get Gender By Sex");
        System.out.println("2. Get Gender By Birth Number");
        System.out.println("3. Print all Persons");
        System.out.println("\nMake your choice");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                getGenderBySex(persons);
                break;
            case 2:
                getGenderByBirthNumber(persons);
                break;
            case 3:
                printAllPersons(persons);
                break;
            default:
                System.out.println("Incorrect choice");
        }
    }

    private static void getGenderBySex(List<Person> persons) {
        int males = 0;
        int females = 0;

        if (persons != null) {
            for (Person per : persons) {
                if (per.getSex().equals("Male")) {
                    males++;
                } else {
                    females++;
                }
            }
        }

        System.out.println("Persons: " + Person.COUNT_PERSON);
        System.out.println("Males: " + males);
        System.out.println("Females: " + females);
    }

    private static void getGenderByBirthNumber(List<Person> persons) {
        int males = 0;
        int females = 0;
        String birthNumber;

        if (persons != null) {
            for (Person per : persons) {
                birthNumber = per.getBirthNumber();
                birthNumber = birthNumber.substring(2, 4);
                if (Integer.parseInt(birthNumber) > 12) {
                    females++;
                } else {
                    males++;
                }
            }
        }

        System.out.println("Persons: " + Person.COUNT_PERSON);
        System.out.println("Males: " + males);
        System.out.println("Females: " + females);
    }

    private static void printAllPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}