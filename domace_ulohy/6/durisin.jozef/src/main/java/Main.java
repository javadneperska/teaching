import sk.globallogic.durisin.lesson.prdb.PersonalRecordsDb;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            PersonalRecordsDb records = new PersonalRecordsDb("personal_records");
            records.genderStatistics();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
