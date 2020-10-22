package sk.salanci.jozef.gl1;

public class Datum {


    public int den;
    public int mesiac;
    public int rok;

    public Datum(int den, int mesiac, int rok) {
        this.den = den;
        this.mesiac = mesiac;
        this.rok = rok;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "den=" + den +
                ", mesiac=" + mesiac +
                ", rok=" + rok +
                '}';
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }


    public int getMesiac() {
        return mesiac;
    }

    public void setMesiac(int mesiac) {
        this.mesiac = mesiac;
    }


    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }




}
