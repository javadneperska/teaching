package sk.zajac.tomas.gl1;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CreateAndPopulateDB {

    private static Connection connection;

    private static String connectionString = "jdbc:hsqldb:file:db-data/mydatabase";

    static List<Employee> CreateDB() throws Exception {

        String createEmployees = readToString("sql/employee");
        String populateEmployees = readToString("sql/populate-employee");

        //creates empty List of Employee
        List<Employee> employees = new ArrayList<Employee>();

        System.out.println("Creating the database...");

        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR: failed to load HSQLDB JDBC driver.");
            e.printStackTrace();
            return null;
        }

        try {
            connection = DriverManager.getConnection(connectionString, "SA", "");

            System.out.println("Deleting the schema...");
            connection.createStatement().executeUpdate("DROP SCHEMA PUBLIC CASCADE");

            System.out.println("Creating employee table...");
            connection.createStatement().executeUpdate(createEmployees);

            System.out.println("Populating employee table...");
            connection.createStatement().executeUpdate(populateEmployees);
            System.out.println("Done!");

            PreparedStatement ps = connection.prepareStatement("SELECT * FROM employee");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                employees.add(new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5))
                );
            }

            for (Employee e : employees) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }

    private static String readToString(String fileName) throws IOException {
        File file = new File(fileName);
        return FileUtils.readFileToString(file, "utf-8");
    }
}
