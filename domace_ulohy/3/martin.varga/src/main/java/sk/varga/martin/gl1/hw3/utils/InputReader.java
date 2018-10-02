package sk.varga.martin.gl1.hw3.utils;

import sk.varga.martin.gl1.hw3.enums.Localization;
import sk.varga.martin.gl1.hw3.enums.Operation;

import java.util.Scanner;

public class InputReader {

    private static final String CLOSE_CHAR = "c";
    private String invalidInteger = System.getProperty("invalid.integer");

    public Localization getLanguage() {
        Scanner keyboard = new Scanner(System.in);
        int languageIndex = 0;

        while(true){
            try {
                String input = keyboard.next();
                if(isCloseChar(input)){
                    close();
                }
                languageIndex = Integer.valueOf(input);
                if(languageIndex > 0 && languageIndex <= Localization.values().length) {
                    break;
                }
                else {
                    System.out.print(invalidInteger +"\n");
                }
            }
            catch (NumberFormatException e){
                System.out.print(invalidInteger +"\n");
            }
        }
        return Localization.values()[languageIndex -1];
    }

    public static Operation getOperation(){
        System.out.println("Enter operation (+/-/:/x) and press enter: ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.next();
        if(isCloseChar(input)){
            close();
        }

        if(input.length() != 1){
            System.out.println("Invalid key! Use +/-/:/x or c to close \n");
            return getOperation();
        }

        char c = input.charAt(0);

        switch (c){
            case '+' :
                return Operation.ADD;
            case '-' :
                return Operation.SUBTRACT;
            case ':' :
                return Operation.DIVIDE;
            case 'x' :
                return Operation.MULTIPLE;
            default:
                System.out.println("Invalid key! Use +/- or c to close \n");
        }
        return getOperation();
    }

    public double readValue(){
        System.out.println("Enter number and press enter: ");
        Scanner keyboard = new Scanner(System.in);
        double number = 0;
        String input = keyboard.next();
        if(isCloseChar(input)){
            close();
        }

        try {
            number = Double.valueOf(input);
        }
        catch (NumberFormatException e){
            System.out.print("Invalid number value! Enter value again \n");
            readValue();
        }
        return number;
    }

    private static boolean isCloseChar(String s) {
        return s.length() == 1 && s.equals(CLOSE_CHAR);
    }

    private static void close() {
        System.exit(0);
    }
}
