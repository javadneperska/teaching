import java.util.ArrayList;

public class Person {

    public static int COUNT_PERSON = 0;
    public static int COUNT_MAN_IDNUMBER = 0;
    public static int COUNT_MAN = 0;
    public static int COUNT_WOMAN_IDNUMBER = 0;
    public static int COUNT_WOMAN = 0;

    private String prveMeno;
    private String druheMeno;
    private String rodneCislo;
    private String bydlisko;
    private String narodnost;
    private String materinskyJazyk;
    private String pohlavie;


    public Person(String prveMeno, String druheMeno, String rodneCislo, String bydlisko, String narodnost, String materinskyJazyk, String pohlavie) throws Exception {
        this.prveMeno = prveMeno;
        this.druheMeno = druheMeno;
        this.rodneCislo = rodneCislo;
        this.bydlisko = bydlisko;
        this.narodnost = narodnost;
        this.materinskyJazyk = materinskyJazyk;
        this.pohlavie = pohlavie;
        PersonCounter();
    }

    public void PersonCounter() throws Exception {
        COUNT_PERSON++;
        StringBuilder id = new StringBuilder();
        char a = rodneCislo.charAt(2);
        id.append(rodneCislo.charAt(2));
        id.append(rodneCislo.charAt(3));
        try {
            int idChecker = Integer.parseInt(id.toString()) - 50;
            if(idChecker>0)
            {
                COUNT_WOMAN_IDNUMBER++;
            }
            else
            {
                COUNT_MAN_IDNUMBER++;
            }
        }
        catch (Exception e)
        {
            throw new Exception(e.toString());
        }
        if(pohlavie.contains("muz"))
        {
            COUNT_MAN++;
        }
        else
        {
            COUNT_WOMAN++;
        }
    }

    public String getPrveMeno() {
        return prveMeno;
    }

    public void setPrveMeno(String prveMeno) {
        this.prveMeno = prveMeno;
    }

    public String getDruheMeno() {
        return druheMeno;
    }

    public void setDruheMeno(String druheMeno) {
        this.druheMeno = druheMeno;
    }

    public String getRodneCislo() {
        return rodneCislo;
    }

    public void setRodneCislo(String rodneCislo) {
        this.rodneCislo = rodneCislo;
    }

    public String getBydlisko() {
        return bydlisko;
    }

    public void setBydlisko(String bydlisko) {
        this.bydlisko = bydlisko;
    }

    public String getNarodnost() {
        return narodnost;
    }

    public void setNarodnost(String narodnost) {
        this.narodnost = narodnost;
    }

    public String getMaterinskyJazyk() {
        return materinskyJazyk;
    }

    public void setMaterinskyJazyk(String materinskyJazyk) {
        this.materinskyJazyk = materinskyJazyk;
    }

    public String getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(String pohlavie) {
        this.pohlavie = pohlavie;
    }


}
