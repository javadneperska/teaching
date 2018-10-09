import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        //urobte program ktory nacita zoznam osob z ext. suboru pricom minimalne 7 vlastnosti bude mat
        // kazda osoba. program nasledne scita zoznam osob, vypise pocet zien a muzov a plus prida moznost vyratat
        // pocet osob na zaklade rodneho cisla


        ArrayList<ArrayList<String>> data = readCSVFromFile("testData");
        ArrayList<Person> people = new ArrayList<Person>();

        for (int i = 1; i < data.size(); i++) {
            Person person = new Person(data.get(i).get(0), data.get(i).get(1), data.get(i).get(2), data.get(i).get(3), data.get(i).get(4), data.get(i).get(5), data.get(i).get(6));
            people.add(person);
        }
        System.out.println("PEOPLE: " + Person.COUNT_PERSON);
        System.out.println("MAN: " + Person.COUNT_MAN);
        System.out.println("WOMAN: " + Person.COUNT_WOMAN);
        System.out.println("MAN BY ID: " + Person.COUNT_MAN_IDNUMBER);
        System.out.println("WOMAN BY ID: " + Person.COUNT_WOMAN_IDNUMBER);

    }



    public static ArrayList<ArrayList<String>> readCSVFromFile(String nameOfTheFile) throws IOException {
        File file = new File(nameOfTheFile + ".csv");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        StringBuilder sb = new StringBuilder();
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        ArrayList<String> inner = new ArrayList<String>();
        while ((st=br.readLine()) != null)
        {
            for (int i = 0; i < st.length(); i++) {
                if(st.charAt(i) != ',')
                {
                    sb.append(String.valueOf(st.charAt(i)));
                }
                else
                {
                    inner.add(sb.toString());
                    sb = new StringBuilder();
                }
                if(i==st.length()-1)
                {
                    inner.add(sb.toString());
                }

            }
            data.add(inner);
            inner = new ArrayList<String>();
            sb = new StringBuilder();
        }

        return data;
    }

}
