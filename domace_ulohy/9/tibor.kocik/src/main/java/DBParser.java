import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBParser {

    public static String translateDB (Connection conn, String table, int id, int column) throws SQLException {
        //String sql = "SELECT " + column + " FROM " + table + " WHERE ID=" + id;
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("Select c.MENO FROM tabulka_faktov AS c JOIN meno_ID AS s ON c.MENO = s.MENO");

        System.out.println("predmet 1 = " + rs.getString("PREDMET1"));
        return "";
    }

}
