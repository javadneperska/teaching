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
    private static String errorEN = "Invalid input!! (please enter number)";
    private static String error1EN = "Invalid input!! (please enter integer)";
    private static String error2EN = "Please choose any option";
    private static String error3EN = "Please enter valid option from 1 - 5";
    private static String outputEN = "Outputs";
    private static String menuQuitEN = "Quit";

    private static String headerSK = "Kalkulačka";
    private static String firstNumberSk = "Enter first number";
    private static String secondNumberSK = "Enter second number";
    private static String errorSK = "Invalid input!! (please enter number)";
    private static String error1SK = "Invalid input!! (please enter integer)";
    private static String error2SK = "Please choose any option";
    private static String error3SK = "Please enter valid option from 1 - 5";
    private static String outputSK = "Výsledky";
    private static String menuQuitSK = "Koniec";


    //    Line formating
    private static void line() {
        System.out.format("+--------------------------------------------------+%n");
        System.out.format("|                                                  |%n");
        System.out.format("+--------------------------------------------------+%n");
    }

    private static void line(String description) {
        System.out.format("+--------------------------------------------------+%n");
        System.out.format("|\033[1;34m %-48s \033[0m|%n", description);
        System.out.format("+--------------------------------------------------+%n");
    }

    private static void lineHeader(String description) {
        System.out.format("+--------------------------------------------------+%n");
        System.out.format("|\033[0;32m %-48s \033[0m|%n", description);
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
        System.out.format("\033[0;91m+--------------------------------------------------+%s%n",RESET);
        System.out.format("\033[0;91m| %-48s |%s%n", description,RESET);
        System.out.format("\033[0;91m+--------------------------------------------------+\033[0m%n");
    }

    private static void lineInfo(String description) {
        System.out.format("\033[0;32m+--------------------------------------------------+\033[0m%n");
        System.out.format("\033[0;32m| %-48s |\033[0m%n", description);
        System.out.format("\033[0;32m+--------------------------------------------------+\033[0m%n");
    }

    private static String getLanguage() {
        int languageOption;
//        lineHeader(headerEN);
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
            line(firstNumberEN);
            try {
                firstNum = input.nextDouble();
                done = false;
            } catch (InputMismatchException e) {
                lineError(errorEN);
                input.nextLine();
            }
        } while (done);
        return firstNum;
    }

    private static double getSecondNum() {
        boolean done = true;
        do {
            line(secondNumberEN);
            try {
                secondNum = input.nextDouble();
                done = false;
            } catch (InputMismatchException e) {
                lineError(errorEN);
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

    private static void menuOperations(String language) {
        if (language == "EN") {
            line("Choose from those choices");
        } else {
            line("Vyber si operaciu");
        }
        lineMenu(" 1 - \033[0;32m" + operationAddEN + " (+)\033[0m");
        lineMenu(" 2 - \033[0;32m" + operationSubEN + " (-)\033[0m");
        lineMenu(" 3 - \033[0;32m" + operationMulEN + " (*)\033[0m");
        lineMenu(" 4 - \033[0;32m" + operationDivEN + " (/)\033[0m");
        lineMenu();

        if (language == "EN") {
            lineMenu(" 5 - \033[0;32m" + menuQuitEN + "\033[0m");
        } else {
            lineMenu(" 5 - \033[0;32m" + menuQuitSK + "\033[0m");
        }
        line();

    }

    private static void selectOptions() {
        boolean exitloop = true;
        do {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    operationHandler(operationAddEN, "1",additionOutput());
                    break;
                case 2:
                    operationHandler(operationMulEN, "2",multiplicationOutput());
                    break;
                case 3:
                    operationHandler(operationSubEN, "3",subtractionOutput());
                    break;
                case 4:
                    operationHandler(operationDivEN, "4",divisionOutput());
                    break;
                case 5:
                    if (chosenOperations.isEmpty()) {
                        lineError(error2EN);
                    } else {
                        exitloop = false;
                    }
                    break;
                default:
                    lineError(error3EN);
            }

        } while (exitloop);
    }

    private static void operationHandler(String operationName, String operationNumber, String function) {
        if (chosenOperations.contains(operationNumber)) {
            lineError(operationName + " has been already choosen!!!");
        } else {
            lineInfo(operationName + " has been choosen");
            chosenOperations.add(operationNumber);
//            operations.add(additionOutput());
            operations.add(function);
        }
    }

    //print outputs from operations
    private static void chosenOutputs() {
        if (language == "EN") {
            line(outputEN);;
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
                lineError(error1EN);
                scanner.nextLine();
            }
        } while (done);
        chosenOutputs();
    }
}
