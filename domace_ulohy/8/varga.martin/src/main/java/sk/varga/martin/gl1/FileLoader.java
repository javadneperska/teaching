package sk.varga.martin.gl1;

import org.apache.commons.io.IOUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class FileLoader {

    public static List<Person> loadEmployers(String fileName) throws IOException {
        List<Person> employers = new ArrayList<Person>();

        InputStream inputStream = FileLoader.class.getResourceAsStream("/" + fileName);
        if(inputStream == null){
            throw  new FileNotFoundException("unable to find resource:" + fileName);
        }

        String resourceString = "";

        try {
            resourceString = IOUtils.toString(inputStream, Charset.defaultCharset());
        }
        finally {
            inputStream.close();
        }

        String[] rows = resourceString.split("\r\n");

        for(String row : rows){
            String[] properties = row.split(",");
            Person p = new Person();
            p.setFirstName(properties[0]);
            p.setLastName(properties[1]);
            p.setGender(Gender.fromString(properties[2]));
            p.setEntryIntoEmployment(properties[3]);
            p.setYearsOfPractice(Double.valueOf(properties[4]));
            p.setPosition(properties[5]);
            employers.add(p);
        }

        return employers;
    }
}
