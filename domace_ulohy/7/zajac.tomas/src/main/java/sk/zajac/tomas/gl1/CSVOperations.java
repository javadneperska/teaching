package sk.zajac.tomas.gl1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVOperations {

    private static final String SEPARATOR = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    private static final String FILE_HEADER = "Object,Area,Perimeter,Diagonal";

    static List<String[]> parseCSV(String filePath) {

        String line;
        List<String[]> personList = new ArrayList<String[]>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            while ((line = br.readLine()) != null) {
                String[] data = line.split(SEPARATOR);

                personList.add(data);
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        return personList;
    }

    static void writeToCSV(String filePath, List<String[]> calculatedGeometryObjects) {

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(filePath);

            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (String[] str :
                    calculatedGeometryObjects) {
                for (int i = 0; i < str.length; i++) {
                    fileWriter.append(str[i]);
                    fileWriter.append(SEPARATOR);
                }
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }

}
