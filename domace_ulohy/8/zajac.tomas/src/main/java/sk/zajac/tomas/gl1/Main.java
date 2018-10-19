package sk.zajac.tomas.gl1;

import java.util.ArrayList;

public class Main{

    private static final String FILE_PATH = "src/main/resources/GL_Employees.csv";

    public static ArrayList<Employee> employeeRecordsFromCSV = CSV_Operations.CSVReader(FILE_PATH);

    public static void main(String[] args) {

        for (Employee employee :
                employeeRecordsFromCSV) {
            System.out.println(employee);
        }

        Menu.printMenu();
    }
}