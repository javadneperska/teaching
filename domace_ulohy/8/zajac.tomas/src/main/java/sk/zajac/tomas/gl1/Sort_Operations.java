package sk.zajac.tomas.gl1;

import java.util.*;

class Sort_Operations {

    static void sortByFirstName(ArrayList<Employee> recordsFromCSV) {
        System.out.println("Zoradenie podla mena: ");

        recordsFromCSV.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.getFirstName().compareTo(o2.getFirstName()));
            }
        });

        for (Employee output :
                recordsFromCSV) {
            System.out.println(output);
        }

        Menu.switcher();
    }

    static void sortByLastName(ArrayList<Employee> recordsFromCSV) {
        System.out.println("Zoradenie podla priezviska: ");

        recordsFromCSV.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.getLastName().compareTo(o2.getLastName()));
            }
        });

        for (Employee output :
                recordsFromCSV) {
            System.out.println(output);
        }

        Menu.switcher();
    }

    static void sortByDate(ArrayList<Employee> recordsFromCSV) {
        System.out.println("Zoradenie podla datumu nastupu: ");

        recordsFromCSV.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.getDateStart().compareTo(o2.getDateStart()));
            }
        });

        for (Employee output :
                recordsFromCSV) {
            System.out.println(output);
        }

        Menu.switcher();
    }

    static void sortByWorkTitle(ArrayList<Employee> recordsFromCSV) {
        System.out.println("Zoradenie podla pracovnej pozicie: ");

        recordsFromCSV.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getWorkTitle().compareTo(o2.getWorkTitle());
            }
        });

        for (Employee output :
                recordsFromCSV) {
            System.out.println(output);
        }

        Menu.switcher();
    }

    static void sortByExperience(ArrayList<Employee> recordsFromCSV){
        System.out.println("Zoradenie podla Rokov Praxe: ");

        recordsFromCSV.sort(Comparator.comparingInt(Employee::getYearsOfExperience));

        for (Employee output :
                recordsFromCSV) {
            System.out.println(output);
        }

        Menu.switcher();
    }

    static void sortBySalary(ArrayList<Employee> recordsFromCSV){
        System.out.println("Zoradenie podla platu: ");

        recordsFromCSV.sort(Comparator.comparingInt(Employee::getSalary));

        for (Employee output :
                recordsFromCSV) {
            System.out.println(output);
        }

        Menu.switcher();
    }
}
