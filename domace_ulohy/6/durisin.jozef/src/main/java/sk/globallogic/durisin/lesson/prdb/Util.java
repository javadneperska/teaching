package sk.globallogic.durisin.lesson.prdb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;


/**
 * This class provides IO support.
 */
public class Util {
    // Suppresses default constructor, ensuring non-instantiability.
    private Util() {
    }

    /**
     * Reads personal records from a file.
     *
     * @param fileName file name
     *
     * @return personal records
     *
     * @throws IOException if open/read error occurs
     */
    public static ArrayList<Person> readPersonalRecords(String fileName) throws IOException {
        ArrayList<Person> personalRecords = new ArrayList<>();
        ArrayList<String> keys = null;

        Path file_path = java.nio.file.Paths.get("src", "main", "resources", fileName);
        try (BufferedReader file = new BufferedReader(new FileReader(file_path.toString()))) {
            String line;
            while ((line = file.readLine()) != null) {
                if (keys == null) {
                    keys = new ArrayList<>();
                    for (String item: line.split(",")) {
                        keys.add(item.trim());
                    }
                    continue;
                }

                HashMap<String, String> tmp = new HashMap<>();
                for (int i = 0; i < keys.size(); i++) {
                    String[] values = line.split(",");
                    try {
                        tmp.put(keys.get(i), values[i]);
                    } catch (ArrayIndexOutOfBoundsException ex) {
                        tmp.put(keys.get(i), null);
                    }

                }
                personalRecords.add(new Person(tmp));
            }
        }

        return personalRecords;
    }

}
