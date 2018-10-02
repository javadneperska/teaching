package sk.varga.martin.gl1.hw3;

import sk.varga.martin.gl1.hw3.config.LocalizationLoader;
import sk.varga.martin.gl1.hw3.enums.Localization;
import sk.varga.martin.gl1.hw3.enums.Operation;
import sk.varga.martin.gl1.hw3.mathOperations.MathOperations;
import sk.varga.martin.gl1.hw3.menu.Menu;
import sk.varga.martin.gl1.hw3.utils.InputReader;

public class Main {

    private static Localization localization;

    public static void main(String[] args) {
        init();

        Menu menu = new Menu(localization);
        menu.printMenu1();
        setLocalization();
//        menu = new Menu(localization);
//        menu.printMenu2();
//        setOperation();
        while(true) {
            double a = readNumber();
            Operation operation = setOperation();
            double b = readNumber();
            System.out.println("result: " + performOperation(operation, a, b) + "\n");
        }
    }

    private static void init(){
        localization = Localization.SLOVAK;
        LocalizationLoader.setLocalization(localization);
    }

    private static void setLocalization(){
        InputReader inputReader = new InputReader();

        localization = inputReader.getLanguage();
        LocalizationLoader.setLocalization(localization);
    }

    private static Operation setOperation(){
        InputReader inputReader = new InputReader();
        return inputReader.getOperation();
    }

    private static double readNumber(){
        InputReader inputReader = new InputReader();
        return inputReader.readValue();
    }

    public static double performOperation(Operation operation, double a, double b){
        double result = 0;
        switch (operation){
            case ADD:
                result = MathOperations.addition(a, b);
                break;
            case SUBTRACT:
                result = MathOperations.subtraction(a, b);
                break;
            case DIVIDE:
                result = MathOperations.division(a, b);
                break;
            case MULTIPLE:
                result = MathOperations.multiplication(a, b);
                break;
        }
        return result;
    }
}
