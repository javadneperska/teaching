public class Otec implements Cloneable{
    String meno, priezvisko;
    Majetok majetok;

    public Otec(String meno, String priezvisko, Majetok majetok) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.majetok = majetok;
    }



    protected Object clone() throws CloneNotSupportedException {
        Otec o = null;
        try{
            o = (Otec) super.clone();
            o.meno = this.meno;
            o.priezvisko = this.priezvisko;
            o.majetok = (Majetok) majetok.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return o;
    }
}
