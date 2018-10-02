package sk.moravcik.kristian.gl1.hw3;

import java.util.HashMap;
import java.util.Map;

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

    private String lang;
    private Map<String, String> map = new HashMap<String, String>();


    public Calculator() {
        map.put("ennum1", "Enter first number: ");
        map.put("ennum2", "Enter second number: ");
        map.put("sknum1", "Zadaj prve cislo: ");
        map.put("sknum2", "Zadaj druhe cislo: ");
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
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double mul(double a, double b) {
        return a * b;
    }
}
