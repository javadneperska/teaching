package sk.zajac.tomas.gl1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class CSVOperations {

    private static final String SEPARATOR = ",";

    static List<Person> parseCSV(String filePath) {

        String line = "";

        List<Person> personList = new ArrayList<Person>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            line = br.readLine();
            String[] header = line.split(SEPARATOR);

            while ((line = br.readLine()) != null) {
                String[] data = line.split(SEPARATOR);

                Person person = createPerson(data);

                personList.add(person);
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return personList;
    }

    private static Person createPerson(String[] data) {
        Person person = new Person();
        person.setFirstName(data[0]);
        person.setLastName(data[1]);
        person.setBirthNumber(data[2]);
        person.setSex(data[3]);
        person.setHeight(Integer.parseInt(data[4]));
        person.setWeight(Double.parseDouble(data[5]));
        person.setOccupation(data[6]);
        person.setBloodType(data[7]);
        person.setFavoriteColor(data[8]);
        return person;
    }
}
