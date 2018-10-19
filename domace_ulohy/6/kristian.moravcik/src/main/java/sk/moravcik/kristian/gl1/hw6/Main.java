package sk.moravcik.kristian.gl1.hw6;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            List<Person> list = mapper.readValue(new File("Person.json"), new TypeReference<List<Person>>(){});
            for (Person person : list) {
                System.out.println(person.getGenderByRodneCislo());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Pocet osob: " + Person.getCountPerson());
        System.out.println("Pocet muzov: " + Person.getCountMale());
        System.out.println("Pocet zien: " + Person.getCountMale());
    }
}