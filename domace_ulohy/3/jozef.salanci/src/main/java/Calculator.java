import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static final String RESET = "\033[0m";

    private static String language;
    private static double firstNum;
    private static double secondNum;
    private static ArrayList<Object> operations = new ArrayList<Object>();
    private static ArrayList<Object> chosenOperations = new ArrayList<Object>();
    private static Scanner input = new Scanner(System.in);
    private static Scanner scanner = new Scanner(System.in);

    private static String operationAddEN = "Addition";
    private static String operationSubEN = "Subtraction";
    private static String operationMulEN = "Multiplication";
    private static String operationDivEN = "Division";

    private static String headerEN = "Calculator";
    private static String chooseLanEN = "Please choose language";
    private static String firstNumberEN = "Enter first number";
    private static String secondNumberEN = "Enter second number";
    private static String chooseOperationsEN ="Choose from those choices";
    private static String errorEN = "Invalid input!! (please enter number)";
    private static String error1EN = "Invalid input!! (please enter integer)";
    private static String error2EN = "Please choose any option";
    private static String error3EN = "Please enter valid option from 1 - 5";
    private static String outputEN = "Outputs";
    private static String menuQuitEN = "Quit";


    private static String operationAddSK = "Sčítanie";
    private static String operationSubSK = "Odčítanie";
    private static String operationMulSK = "Násobenie";
    private static String operationDivSK = "Delenie";

    private static String headerSK = "Kalkulačka";
    private static String firstNumberSk = "Zadaj prvé číslo";
    private static String secondNumberSK = "Zadaj druhé číslo";
    private static String chooseOperationsSK ="Vyber si operáciu";
    private static String errorSK = "Nesprávny vstup!! (please enter number)";
    private static String error1SK = "Nesprávny vstup!! (please enter integer)";
    private static String error2SK = "Prosím vyber nejaku možnosť";
    private static String error3SK = "Prosím vyber správnu možnosť od 1 - 5";
    private static String outputSK = "Výsledky";
    private static String menuQuitSK = "Koniec";

    public enum Color {
        RESET("\033[0m"),

        // Regular Colors
        RED("\033[0;31m"),      // RED
        GREEN("\033[0;32m"),    // GREEN
        BLUE("\033[0;34m");     // BLUE

        private final String code;

        Color(String code) {
            this.code = code;
        }

        @Override
        public String toString() {
            return code;
        }
    }


    //    Line formating
    private static void line() {
        System.out.format("+--------------------------------------------------+%n");
        System.out.format("|                                                  |%n");
        System.out.format("+--------------------------------------------------+%n");
    }

    private static void line(String description) {
        System.out.format("+--------------------------------------------------+%n");
//        System.out.format("|\033[1;34m %-48s \033[0m|%n", description);
        System.out.format("|%s %-48s %s|%n", Color.BLUE, description, Color.RESET);
        System.out.format("+--------------------------------------------------+%n");
    }

    private static void lineHeader(String description) {
        System.out.format("+--------------------------------------------------+%n");
        System.out.format("|%s %-48s %s|%n", Color.GREEN, description,Color.RESET);
        System.out.format("+--------------------------------------------------+%n");
    }

    //    Line formating for menuOperations items
    private static void lineMenu() {
        System.out.format("|                                                  |%n");
    }

    private static void lineMenu(String description) {
        System.out.format("|%-61s|%n", description);
    }

    private static void lineOutput(String description) {
        System.out.format("| %-49s|%n", description);
    }

    private static void lineError(String description) {
//        System.out.format("\033[0;91m\033[47m+--------------------------------------------------+\033[0m%n");
        System.out.format("%s+--------------------------------------------------+%s%n",Color.RED, Color.RESET);
        System.out.format("%s| %-48s |%s%n",Color.RED, description, RESET);
        System.out.format("%s+--------------------------------------------------+%s%n",Color.RED, Color.RESET);
    }

    private static void lineInfo(String description) {
        System.out.format("%s+--------------------------------------------------+%s%n",Color.GREEN, Color.RESET);
        System.out.format("%s| %-48s |%s%n",Color.GREEN, description, Color.RESET);
        System.out.format("%s+--------------------------------------------------+%s%n",Color.GREEN, Color.RESET);
    }

    private static String getLanguage() {
        int languageOption;
        boolean done = true;
        do {
            try {
                languageOption = input.nextInt();
                if (languageOption == 1) {
                    language = "EN";
                } else {
                    language = "SK";
                }
                done = false;
            } catch (InputMismatchException e) {
                lineError(errorEN);
                input.nextLine();
            }
        } while (done);
        return language;
    }

    private static double getFirstNum() {
//        lineHeader(headerEN);
        boolean done = true;
        do {
            line(languageVariant(firstNumberEN, firstNumberSk));
            try {
                firstNum = input.nextDouble();
                done = false;
            } catch (InputMismatchException e) {
                lineError(languageVariant(errorEN,errorSK));
                input.nextLine();
            }
        } while (done);
        return firstNum;
    }

    private static double getSecondNum() {
        boolean done = true;
        do {
            line(languageVariant(secondNumberEN, secondNumberSK));
            try {
                secondNum = input.nextDouble();
                done = false;
            } catch (InputMismatchException e) {
                lineError(languageVariant(errorEN, errorSK));
                input.nextLine();
            }
        } while (done);
        return secondNum;
    }

    private static double addition(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    private static double subtraction(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    private static double multiplication(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    private static double division(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }

    private static String additionOutput() {
        return String.format("%.2f + %.2f = %.2f", firstNum, secondNum, addition(firstNum, secondNum));
    }

    private static String subtractionOutput() {
        return String.format("%.2f - %.2f = %.2f", firstNum, secondNum, subtraction(firstNum, secondNum));
    }

    private static String multiplicationOutput() {
        return String.format("%.2f * %.2f = %.2f", firstNum, secondNum, multiplication(firstNum, secondNum));
    }

    private static String divisionOutput() {
        return String.format("%.2f / %.2f = %.2f", firstNum, secondNum, division(firstNum, secondNum));
    }


    private static void menuLanguages() {
        lineHeader(headerEN);
        line("Supported languages");
        lineMenu(" 1 - \033[0;32mEN\033[0m");
        lineMenu(" 2 - \033[0;32mSK\033[0m");
        line(chooseLanEN);
    }


    private static void languageOutputError(String enString, String skString){
        if (language == "EN") {
            lineError(enString);
        } else {
            lineError(skString);
        }

    }

    private static void languageOutputInfo(String enString, String skString){
        if (language == "EN") {
            lineInfo(enString);
        } else {
            lineInfo(skString);
        }

    }

    private static String languageVariant(String enString, String skString){
        if (language == "EN") {
            return enString;
        } else {
            return skString;
        }
    }

    private static void menuOperations(String language) {
        line(languageVariant(chooseOperationsEN, chooseOperationsSK));
//        languageOutput(chooseOperationsEN, chooseOperationsSK);
        lineMenu(" 1 - \033[0;32m" + languageVariant(operationAddEN, operationAddSK) + " (+)\033[0m");
        lineMenu(" 2 - \033[0;32m" + languageVariant(operationSubEN, operationSubSK) + " (-)\033[0m");
        lineMenu(" 3 - \033[0;32m" + languageVariant(operationMulEN, operationMulSK) + " (*)\033[0m");
        lineMenu(" 4 - \033[0;32m" + languageVariant(operationDivEN, operationDivSK) + " (/)\033[0m");
        lineMenu();
        lineMenu(languageVariant(menuQuitEN, menuQuitSK));
        line();
    }


    private static void selectOptions() {
        boolean exitloop = true;
        do {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    operationHandler(languageVariant(operationAddEN, operationAddSK), "1", additionOutput());
                    break;
                case 2:
                    operationHandler(languageVariant(operationSubEN, operationSubSK), "2", multiplicationOutput());
                    break;
                case 3:
                    operationHandler(languageVariant(operationMulEN, operationMulSK), "3", subtractionOutput());
                    break;
                case 4:
                    operationHandler(languageVariant(operationDivEN, operationDivSK), "4", divisionOutput());
                    break;
                case 5:
                    if (chosenOperations.isEmpty()) {
                        lineError(languageVariant(error2EN, error2SK));
                    } else {
                        exitloop = false;
                    }
                    break;
                default:
                    lineError(languageVariant(error3EN, error3SK));
            }

        } while (exitloop);
    }

    private static void operationHandler(String operationName, String operationNumber, String function) {
        if (chosenOperations.contains(operationNumber)) {
            languageOutputError(operationName + " has been already choosen!!!", operationName +" už bolo vybrané !!!");
        } else {
            languageOutputInfo(operationName + " has been choosen", operationName +" bolo vybrané");
            chosenOperations.add(operationNumber);
            operations.add(function);
        }
    }

    //print outputs from operations
    private static void chosenOutputs() {
        if (language == "EN") {
            line(outputEN);
        } else {
            line(outputSK);
        }
        for (Object operation : operations) {
            lineOutput(operation.toString());
        }
        line("");
    }

    //sformatovane meunu kalkulacky mozno aj language
//    prepisat hodnoty na enum

    public static void main(String[] args) {
        //language= "EN";
        menuLanguages();
        getLanguage();
        getFirstNum();
        getSecondNum();
        menuOperations(language);
        boolean done = true;

        do {
            try {
                selectOptions();
                done = false;
            } catch (InputMismatchException e) {
                lineError(languageVariant(error1EN, error1SK));
                scanner.nextLine();
            }
        } while (done);
        chosenOutputs();
    }
}
