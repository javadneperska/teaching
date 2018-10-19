import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    //DU 9 - Urobte program, ktory z lokalneho file systemu alebo z lubovolnej DB nacita zoznam studentov, kazdy student bude mat
    //minimalne 3 predmety, 2 volitelne 1 volitelny, s tym Å¾e, predmet bude maÅ¥ udavane info ako:
    // vyuÄujÃºci, poÄet hodin do tyzdna, Äi konÄi skuÅ¡kou (true false ) a nÃ¡vaznosÅ¥(iba jednu)
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:STUDENTS.db");
        ArrayList<String> person = processDBPerson(conn);
        ArrayList<Predmet> predmet = processDBPredmet(conn);
        ArrayList<VolPredmet> volPredmet = processDBVolPredmet(conn);
        conn.close();
        Person[] students = new Person[person.size()];
        Random rnd = new Random();

        for(int i=0;i<person.size();i++)
        {
            students[i] = new Person(person.get(i),predmet.get(i), predmet.get(i),volPredmet.get(rnd.nextInt((2-0)+1)+0));
            System.out.println(students[i]);
        }

    }


    public static ArrayList<String> processDBPerson (Connection conn) throws SQLException {
        ArrayList<String> res = new ArrayList<String>();
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from " + "studenti");

        while (rs.next()) {
            res.add(rs.getString("MENO"));
        }

        rs.close();
        return res;
    }

    public static ArrayList<Predmet> processDBPredmet (Connection conn) throws SQLException {
        ArrayList<Predmet> res = new ArrayList<Predmet>();
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from " + "predmety");

        while (rs.next()) {
            res.add(new Predmet(rs.getString("PREDMET"), rs.getString("VYUCUJUCI"), Integer.parseInt(rs.getString("POCET_HODIN")), Integer.parseInt(rs.getString("SKUSKA"))));
        }

        rs.close();
        return res;
    }

    public static ArrayList<VolPredmet> processDBVolPredmet (Connection conn) throws SQLException {
        ArrayList<VolPredmet> res = new ArrayList<VolPredmet>();
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from " + "volitelne_predmety");

        while (rs.next()) {
            res.add(new VolPredmet(rs.getString("PREDMET"), rs.getString("VYUCUJUCI"), Integer.parseInt(rs.getString("POCET_HODIN")), Integer.parseInt(rs.getString("SKUSKA"))));
        }

        rs.close();
        return res;
    }

}
