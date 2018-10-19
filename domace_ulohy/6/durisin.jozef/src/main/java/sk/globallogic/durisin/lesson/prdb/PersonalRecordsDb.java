package sk.globallogic.durisin.lesson.prdb;

import java.io.IOException;
import java.util.ArrayList;


/**
 * Class for handling personal records.
 */
public class PersonalRecordsDb {
    private ArrayList<Person> personalRecords;

    /**
     * Initializes PersonalRecordsDb
     *
     * @param fileName personal records file name
     *
     * @throws IOException if cannot be initialized from the file
     */
    public PersonalRecordsDb(String fileName) throws IOException {
        personalRecords = Util.readPersonalRecords(fileName);
    }

    /**
     * Gets gender statistics from personal records.
     */
    public void genderStatistics() {
        int female = 0;
        for (Person person: personalRecords) {
//                System.out.println(person.toString());
            if (person.getAttributes().get("birthNumber").charAt(2) == '5'
                    || person.getAttributes().get("birthNumber").charAt(2) == '6') {
                female++;
            }
        }

        System.out.println("Female: " + female);
        System.out.println("Male: " + (personalRecords.size() - female));
    }
}
