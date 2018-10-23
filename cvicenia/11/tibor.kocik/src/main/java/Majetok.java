public class Majetok implements Cloneable{
    int majetok;

    public Majetok(int majetok) {
        this.majetok = majetok;
    }

    protected Object clone() throws CloneNotSupportedException {
        Majetok m = null;
        try{
            m = (Majetok) super.clone();
            m.majetok = this.majetok;
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return  m;
    }
}
