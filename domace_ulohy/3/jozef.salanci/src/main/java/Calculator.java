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

    public enum Color {
        RESET("\033[0m"),

        // Regular Colors
        BLACK("\033[0;30m"),    // BLACK
        RED("\033[0;31m"),      // RED
        GREEN("\033[0;32m"),    // GREEN
        YELLOW("\033[0;33m"),   // YELLOW
        BLUE("\033[0;34m"),     // BLUE
        MAGENTA("\033[0;35m"),  // MAGENTA
        CYAN("\033[0;36m"),     // CYAN
        WHITE("\033[0;37m"),    // WHITE

        // Bold
        BLACK_BOLD("\033[1;30m"),   // BLACK
        RED_BOLD("\033[1;31m"),     // RED
        GREEN_BOLD("\033[1;32m"),   // GREEN
        YELLOW_BOLD("\033[1;33m"),  // YELLOW
        BLUE_BOLD("\033[1;34m"),    // BLUE
        MAGENTA_BOLD("\033[1;35m"), // MAGENTA
        CYAN_BOLD("\033[1;36m"),    // CYAN
        WHITE_BOLD("\033[1;37m"),   // WHITE

        // Underline
        BLACK_UNDERLINED("\033[4;30m"),     // BLACK
        RED_UNDERLINED("\033[4;31m"),       // RED
        GREEN_UNDERLINED("\033[4;32m"),     // GREEN
        YELLOW_UNDERLINED("\033[4;33m"),    // YELLOW
        BLUE_UNDERLINED("\033[4;34m"),      // BLUE
        MAGENTA_UNDERLINED("\033[4;35m"),   // MAGENTA
        CYAN_UNDERLINED("\033[4;36m"),      // CYAN
        WHITE_UNDERLINED("\033[4;37m"),     // WHITE

        // Background
        BLACK_BACKGROUND("\033[40m"),   // BLACK
        RED_BACKGROUND("\033[41m"),     // RED
        GREEN_BACKGROUND("\033[42m"),   // GREEN
        YELLOW_BACKGROUND("\033[43m"),  // YELLOW
        BLUE_BACKGROUND("\033[44m"),    // BLUE
        MAGENTA_BACKGROUND("\033[45m"), // MAGENTA
        CYAN_BACKGROUND("\033[46m"),    // CYAN
        WHITE_BACKGROUND("\033[47m"),   // WHITE

        // High Intensity
        BLACK_BRIGHT("\033[0;90m"),     // BLACK
        RED_BRIGHT("\033[0;91m"),       // RED
        GREEN_BRIGHT("\033[0;92m"),     // GREEN
        YELLOW_BRIGHT("\033[0;93m"),    // YELLOW
        BLUE_BRIGHT("\033[0;94m"),      // BLUE
        MAGENTA_BRIGHT("\033[0;95m"),   // MAGENTA
        CYAN_BRIGHT("\033[0;96m"),      // CYAN
        WHITE_BRIGHT("\033[0;97m"),     // WHITE

        // Bold High Intensity
        BLACK_BOLD_BRIGHT("\033[1;90m"),    // BLACK
        RED_BOLD_BRIGHT("\033[1;91m"),      // RED
        GREEN_BOLD_BRIGHT("\033[1;92m"),    // GREEN
        YELLOW_BOLD_BRIGHT("\033[1;93m"),   // YELLOW
        BLUE_BOLD_BRIGHT("\033[1;94m"),     // BLUE
        MAGENTA_BOLD_BRIGHT("\033[1;95m"),  // MAGENTA
        CYAN_BOLD_BRIGHT("\033[1;96m"),     // CYAN
        WHITE_BOLD_BRIGHT("\033[1;97m"),    // WHITE

        // High Intensity backgrounds
        BLACK_BACKGROUND_BRIGHT("\033[0;100m"),     // BLACK
        RED_BACKGROUND_BRIGHT("\033[0;101m"),       // RED
        GREEN_BACKGROUND_BRIGHT("\033[0;102m"),     // GREEN
        YELLOW_BACKGROUND_BRIGHT("\033[0;103m"),    // YELLOW
        BLUE_BACKGROUND_BRIGHT("\033[0;104m"),      // BLUE
        MAGENTA_BACKGROUND_BRIGHT("\033[0;105m"),   // MAGENTA
        CYAN_BACKGROUND_BRIGHT("\033[0;106m"),      // CYAN
        WHITE_BACKGROUND_BRIGHT("\033[0;107m");     // WHITE

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
        System.out.format("|%s %-48s %s%n", Color.BLUE, description, Color.RESET);
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
        System.out.format("\033[0;91m| %-48s |%s%n", description, RESET);
        System.out.format("%s+--------------------------------------------------+%s%n",Color.RED, Color.RESET);
    }

    private static void lineInfo(String description) {
        System.out.format("%s+--------------------------------------------------+%s%n",Color.GREEN, Color.RESET);
        System.out.format("\033[0;91m| %-48s |%s%n", description, RESET);
        System.out.format("%s+--------------------------------------------------+%s%n",Color.GREEN, Color.RESET);
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
                    operationHandler(operationAddEN, "1", additionOutput());
                    break;
                case 2:
                    operationHandler(operationMulEN, "2", multiplicationOutput());
                    break;
                case 3:
                    operationHandler(operationSubEN, "3", subtractionOutput());
                    break;
                case 4:
                    operationHandler(operationDivEN, "4", divisionOutput());
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
            line(outputEN);
            ;
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
