package sk.moravcik.kristian.gl1.hw5;

import org.la4j.Matrix;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public void setLang(int langChoice) {
        switch(langChoice) {
            case 1:
                this.lang = "en";
                break;
            case 2:
                this.lang = "sk";
                break;
        }
    }

    public String getLang() {
        return lang;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public Matrix getMatrix() {
        return matrix;
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    private String lang;
    private Scanner sc = new Scanner(System.in);
    private Map<String, String> map = new HashMap<String, String>();
    private Matrix matrix;
    private double[] mat;


    public Calculator() {
        map.put("ennum1", "Enter first number: ");
        map.put("ennum2", "Enter second number: ");
        map.put("sknum1", "Zadaj prve cislo: ");
        map.put("sknum2", "Zadaj druhe cislo: ");
        map.put("ennum", "Enter number: ");
        map.put("sknum", "Zadaj cislo: ");
        map.put("enadd", "Addition");
        map.put("skadd", "Scitanie ");
        map.put("enmul", "Multiplication ");
        map.put("skmul", "Nasobenie ");
        map.put("endiv", "Division ");
        map.put("skdiv", "Delenie ");
        map.put("enquit", "Exit");
        map.put("skquit", "Ukoncenie ");
        map.put("enchoice", "Enter your choice: ");
        map.put("skchoice", "Tvoj vyber:  ");
        map.put("enaddres", "Result of addition: ");
        map.put("skaddres", "Vysledok scitania: ");
        map.put("enmulres", "Result of multiplication: ");
        map.put("skmulres", "Vysledok nasobenia ");
        map.put("endivres", "Result of division: ");
        map.put("skdivres", "Vysledok delenia: ");
        map.put("engenmatrixfile", "Generate a 4x4 matrix to a file");
        map.put("skgenmatrixfile", "Generovanie 4x4 matice do suboru");

        mat = new double[] {
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100)

        };
    }

    public double add() {
        return readNum() + readNum();
    }

    public double div() {
        return readNum() / readNum();
    }

    public double mul() {
        return readNum() * readNum();
    }

    public double readNum() {
        System.out.print(map.get(lang + "num"));
        return sc.nextDouble();
    }

    public String readFilename() {
        System.out.print("Enter name of file: ");
        return sc.next();
    }


    public double[] getMat() {
        return mat;
    }
}
