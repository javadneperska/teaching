

import org.omg.CORBA.Environment;

import java.io.*;
import java.sql.*;
import java.util.*;

public class Main {


    //DU 10 - urobte SW ktory bude riesit evidenciu prichadzajucich zamestnancov do prace a ich odchody z pracoviska aj pocas dna
    //program bude obsahovat zoznam zamestnancov s minimalnym poctom 10 pricom o kazdom zamestnancovi bude 5 vastnosti : meno priezvisko pohlavie pozicia
    // a datum nastupu do zamestnania. Program bude simulovat check in a check out z pracoviska a bude poskytovat rozpis jeho dochadzky za
    // kalendarny mesiac plus upozornenie ked neodpracoval viac ako 160 hodin

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:ZAM.db");
        ArrayList<ArrayList<Person>> zamestnanci = processDBPerson(conn);
        conn.close();

        while(true) {
            Scanner sc = new Scanner(System.in);
            int id = 0;
            String gender = "";
            int mode = 0;

            System.out.println("Dobrý deň");

            do {
                try {
                    System.out.println("Zadajte prosím svoje ID: \n");
                    sc = new Scanner(System.in);
                    id = sc.nextInt();
                    if (id > zamestnanci.size() || id < 1) {
                        System.out.println("Zadali ste nesprávne ID zamestnanca");
                        System.out.println("Zadajte prosím svoje ID: \n");
                        id = -1;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Zadajte prosím ID vo forme čísla \n");
                    id = -1;
                }
            } while (id == -1);

            gender = zamestnanci.get(id - 1).get(0).getPohlavie();
            if (gender.equals("zena"))
                System.out.println("Dobrý deň pani " + zamestnanci.get(id - 1).get(0).getPriezvisko());
            else
                System.out.println("Dobrý deň pán " + zamestnanci.get(id - 1).get(0).getPriezvisko());


            sc = new Scanner(System.in);

            do {
                try {
                    System.out.println("Zadajte dôvod prihlásenia");
                    System.out.println("1. Príchod");
                    System.out.println("2. Odchod na prestávku");
                    System.out.println("3. Príchod z prestávky");
                    System.out.println("4. Odchod");
                    System.out.println("5. Výjst z menu");
                    sc = new Scanner(System.in);
                    mode = sc.nextInt();
                    if (mode > 5 || mode < 1) {
                        System.out.println("Zadali ste nesprávnu voľbu");
                        mode = -1;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Zadajte prosím voľbu vo forme čísla \n");
                    mode = -1;
                }
            } while (mode == -1);

            switch (mode) {
                case 1:
                case 2:
                case 3:
                case 4:
                    recordIntoCsv(mode, zamestnanci.get(id));
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    break;
                //should not go here

            }
            System.out.println("\n");
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

    public static void recordIntoCsv(int mode, ArrayList<Person> zamestnanec) throws IOException {
        File f = new File("checkins.csv");
        PrintWriter pw;
        StringBuilder sb;
        FileWriter fw;
        BufferedWriter bw;
        String modeString;
        switch (mode)
        {
            case 1:
                modeString = "Prichod";
                break;
            case 2:
                modeString = "Odchod na prestavku";
                break;
            case 3:
                modeString = "Prichod z prestavky";
                break;
            case 4:
                modeString = "Odchod";
                break;
            default:
                modeString = "CHYBA";
                break;
        }
        if(f.createNewFile())
        {
            pw= new PrintWriter(f);
            sb = new StringBuilder();
            sb.append("MENO,");
            sb.append("PRIEZVISKO,");
            sb.append("PRICHOD,");
            sb.append("ODCHOD_NA_PRES,");
            sb.append("PRICHOD_Z_PRES,");
            sb.append("ODCHOD");
            sb.append("\n");

            sb.append(zamestnanec.get(0).getMeno() + ",");
            sb.append(zamestnanec.get(0).getPriezvisko() + ",");

            if(modeString.equals("Prichod"))
                sb.append(System.currentTimeMillis()/1000);
            else if(modeString.equals("Odchod na prestavku")) {
                sb.append(", ");
                sb.append(System.currentTimeMillis()/1000);
            }
            else if(modeString.equals("Prichod z prestavky")) {
                sb.append(", ");
                sb.append(", ");
                sb.append(System.currentTimeMillis()/1000);
            }
            else if(modeString.equals("Odchod")) {
                sb.append(", ");
                sb.append(", ");
                sb.append(", ");
                sb.append(System.currentTimeMillis()/1000);
            }
            sb.append("\n");
            pw.write(sb.toString());
            pw.close();
        }
        else
        {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            List<String> lineSplitted = new ArrayList<String>();

            sb = new StringBuilder();
            boolean checker = false;
            boolean error = false;
            while((line = br.readLine()) != null)
            {
                lineSplitted = new ArrayList<String>(Arrays.asList(line.split(",")));

                if(lineSplitted.size() < 6)
                {
                    for (int i = lineSplitted.size(); i < 6; i++) {
                        lineSplitted.add(i," ");
                    }
                }
                if(lineSplitted.get(0).equals(zamestnanec.get(0).getMeno()) && lineSplitted.get(1).equals(zamestnanec.get(0).getPriezvisko()))
                {
                    sb.append(lineSplitted.get(0) + ",");
                    sb.append(lineSplitted.get(1) + ",");
                    if(modeString.equals("Prichod")) {
                        if(lineSplitted.get(2) == null || lineSplitted.get(2) == " ") {
                            sb.append(System.currentTimeMillis() / 1000);
                            System.out.println("Príchod uložený");
                        }
                        else {
                            System.out.println("Príchod už bol zadaný");
                            error = true;
                        }
                    }
                    else if(modeString.equals("Odchod na prestavku")) {
                        if((lineSplitted.get(3) == null || lineSplitted.get(3) == " ")) {
                            if((lineSplitted.get(2) != null && lineSplitted.get(2) != " ")) {
                                sb.append(lineSplitted.get(2) + ",");
                                sb.append(System.currentTimeMillis() / 1000);
                                System.out.println("Odchod na prestávku uložený");
                            }
                            else
                            {
                                System.out.println("Ešte nebol zadaný príchod");
                                error = true;
                            }
                        }
                        else {
                            System.out.println("Odchod na prestávku už bol zadaný");
                            error = true;
                        }
                    }
                    else if(modeString.equals("Prichod z prestavky")) {
                        if((lineSplitted.get(4) == null || lineSplitted.get(4) == " ")) {
                            if((lineSplitted.get(2) != null && lineSplitted.get(2) != " ") && (lineSplitted.get(3) != null && lineSplitted.get(3) != " ")) {
                                sb.append(lineSplitted.get(2) + ",");
                                sb.append(lineSplitted.get(3) + ",");
                                sb.append(System.currentTimeMillis() / 1000);
                                System.out.println("Príchod z prestávky uložený");
                            }
                            else
                            {
                                System.out.println("Ešte nebol zadaný odchod na prestávku");
                                error = true;
                            }
                        }
                        else {
                            System.out.println("Príchod z prestávky už bol zadaný");
                            error = true;
                        }
                    }
                    else if(modeString.equals("Odchod")) {
                        if((lineSplitted.get(5) == null || lineSplitted.get(5) == " ")) {
                            if((lineSplitted.get(2) != null && lineSplitted.get(2) != " ") && (lineSplitted.get(3) != null && lineSplitted.get(3) != " ") && (lineSplitted.get(4) != null && lineSplitted.get(4) != " ")) {
                                sb.append(lineSplitted.get(2) + ",");
                                sb.append(lineSplitted.get(3) + ",");
                                sb.append(lineSplitted.get(4) + ",");
                                sb.append(System.currentTimeMillis() / 1000);
                                System.out.println("Odchod uložený");
                            }
                            else
                            {
                                System.out.println("Ešte nebol zadaný príchod z prestávky");
                                error = true;
                            }
                        }
                        else {
                            System.out.println("Odchod už bol zadaný");
                            error = true;
                        }
                    }
                    checker = true;
                    if(error)
                    {
                        sb.append(lineSplitted.get(2));
                        sb.append(",");
                        sb.append(lineSplitted.get(3));
                        sb.append(",");
                        sb.append(lineSplitted.get(4));
                        sb.append(",");
                        sb.append(lineSplitted.get(5));
                    }
                }
                else
                {
                    sb.append(lineSplitted.get(0) + ",");
                    sb.append(lineSplitted.get(1) + ",");
                    sb.append(lineSplitted.get(2) + ",");
                    sb.append(lineSplitted.get(3) + ",");
                    sb.append(lineSplitted.get(4) + ",");
                    sb.append(lineSplitted.get(5));
                }
                sb.append("\n");
            }

            if(!checker) {
                sb.append(zamestnanec.get(0).getMeno() + ",");
                sb.append(zamestnanec.get(0).getPriezvisko() + ",");
                sb.append(System.currentTimeMillis()/1000);
                pw = new PrintWriter(f);
                pw.print(sb.toString());
                pw.close();
            }
            else
            {
                pw = new PrintWriter(f);
                pw.print(sb.toString());
                pw.close();
            }

        }

    }
}
