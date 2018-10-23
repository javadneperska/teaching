import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {


    //DU 10 - urobte SW ktory bude riesit evidenciu prichadzajucich zamestnancov do prace a ich odchody z pracoviska aj pocas dna
    //program bude obsahovat zoznam zamestnancov s minimalnym poctom 10 pricom o kazdom zamestnancovi bude 5 vastnosti : meno priezvisko pohlavie pozicia
    // a datum nastupu do zamestnania. Program bude simulovat check in a check out z pracoviska a bude poskytovat rozpis jeho dochadzky za
    // kalendarny mesiac plus upozornenie ked neodpracoval viac ako 160 hodin

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:ZAM.db");
        ArrayList<ArrayList<Person>> zamestnanci = processDBPerson(conn);
        conn.close();

        for(int i=0;i<zamestnanci.size();i++)
        {
            System.out.println(zamestnanci.get(i).toString());
        }

    }

    public static ArrayList<ArrayList<Person>> processDBPerson (Connection conn) throws SQLException {
        ArrayList<ArrayList<Person>> res = new ArrayList<ArrayList<Person>>();
        ArrayList<Person> row = new ArrayList<Person>();
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from zamestnanci");

        while (rs.next()) {

            row.add(new Person(rs.getInt("ID"), rs.getString("MENO"), rs.getString("PRIEZVISKO"), rs.getString("POHLAVIE"), rs.getString("POZICIA"), rs.getString("NASTUP")));
            res.add(row);
            row = new ArrayList<Person>();
        }

        rs.close();
        return res;
    }
}
