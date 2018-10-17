import java.sql.*;

public class Main {
    //DU 9 - Urobte program, ktory z lokalneho file systemu alebo z lubovolnej DB nacita zoznam studentov, kazdy student bude mat
    //minimalne 3 predmety, 2 volitelne 1 volitelny, s tym že, predmet bude mať udavane info ako:
    // vyučujúci, počet hodin do tyzdna, či konči skuškou (true false ) a návaznosť(iba jednu)
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:STUDENTS.db");
        Statement stat = conn.createStatement();
        //ResultSet rs = stat.executeQuery("select * from tabulka_faktov");
        ResultSet rs = stat.executeQuery("SELECT tabulka_faktov.MENO, tabulka_faktov.PREDMET1, tabulka_faktov.PREDMET2 FROM tabulka_faktov ");
        while (rs.next()) {
            System.out.println(rs.getString("MENO"));
            System.out.println("predmet 1 = " + rs.getString("PREDMET1"));
            System.out.println("predmet 2 = " + rs.getString("PREDMET2"));
            //System.out.println("volitelny = " + rs.getString("VOLITELNY_PREDMET"));
        }
        rs.close();
        conn.close();
    }




}
