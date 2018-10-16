package sk.varga.martin.gl1;


import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Person> employers = FileLoader.loadEmployers("employers");
    }
}
