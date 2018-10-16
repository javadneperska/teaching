package sk.zajac.tomas.gl1;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class CSV_Operations {

    static ArrayList<Employee> CSVReader(String filePath) {

        ArrayList<Employee> employees = new ArrayList<>();

        try (Reader reader = Files.newBufferedReader(Paths.get(filePath));
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                     .withFirstRecordAsHeader()
                     .withIgnoreHeaderCase()
                     .withTrim())
        ) {
            for (CSVRecord csvRecord : csvParser) {
                String meno = csvRecord.get("Meno");
                String priezvisko = csvRecord.get("Priezvisko");
                String datumNastupu = csvRecord.get("Datum nastupu");
                String pracovnaPozicia = csvRecord.get("Pracovna pozicia");
                String rokyPraxe = csvRecord.get("Roky praxe");
                String plat = csvRecord.get("Plat");

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
                Date date = null;

                try {
                    date = simpleDateFormat.parse(datumNastupu);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                Employee employee = new Employee();
                employee.setFirstName(meno);
                employee.setLastName(priezvisko);
                employee.setDateStart(date);
                employee.setWorkTitle(pracovnaPozicia);
                employee.setYearsOfExperience(Integer.parseInt(rokyPraxe));
                employee.setSalary(Integer.parseInt(plat));

                employees.add(employee);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
