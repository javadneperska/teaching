package sk.salanci.jozef.gl1;

public class Majetok {
    public int cena;

    public Majetok(int cena) {
        this.cena = cena;
    }
    @Override
    public String toString() {
        return "Majetok{" +
                "cena=" + cena +
                '}';
    }

    public int getCena() {
        return cena;
    }


    public void setCena(int cena) {
        this.cena = cena;

    }
}
