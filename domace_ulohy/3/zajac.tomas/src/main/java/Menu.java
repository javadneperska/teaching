import java.util.*;

class Menu {

    enum Operations {
        ADDITION,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION
    }

    private static Locale currentLocale = new Locale("en", "US");

    private static ResourceBundle textBundle = ResourceBundle.getBundle("TextBundle", currentLocale);

    private static Scanner keyboard = new Scanner(System.in);
    private static int langChoice = 0;
    private static List<Operations> selectedChoices = new ArrayList<Operations>(); //Stores selected choices from the menu
    private static List<String> selectedChoicesToPrint = new ArrayList<String>();


    static Locale langMenu() {
        lineSeparator();
        System.out.printf("\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660 \u265A %s%s%n", textBundle.getString("title"),
                " \u265A \u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660");
        lineSeparator();
        System.out.printf(" %-45s%n", "           Choose your language: ");
        System.out.printf(" %-45s%n", "                \u25B6 1. English ");
        System.out.printf(" %-45s%n", "                \u25B6 2. Slovak ");
        System.out.printf(" %-45s%n", "         Please make your choice: ");
        lineSeparator();
        lineSeparator();

        boolean validChoice = false;

        while (!validChoice) {
            String input = keyboard.next();

            try {
                langChoice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Your choice is not from the Menu.");
            }

            switch (langChoice) {
                case 1:
                    currentLocale = new Locale("en", "US");
                    validChoice = true;
                    break;
                case 2:
                    currentLocale = new Locale("sk", "SK");
                    validChoice = true;
                    break;
                default:
                    System.out.println("Your choice is not from the Menu.");
            }
        }
        return currentLocale;
    }

    static List<Operations> mainMenu(Locale locale) {
        textBundle = ResourceBundle.getBundle("TextBundle", locale);

        lineSeparator();
        System.out.printf("\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660 \u265A %s%s%n", textBundle.getString("title"),
                " \u265A \u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660");
        lineSeparator();
        System.out.format(" %-45s%n", "                 \u265B MENU \u265B");
        System.out.format("               \u25B6 %-3s%-38s%n", "1. ", textBundle.getString("addition"));
        System.out.format("               \u25B6 %-3s%-38s%n", "2. ", textBundle.getString("subtraction"));
        System.out.format("               \u25B6 %-3s%-38s%n", "3. ", textBundle.getString("multiplication"));
        System.out.format("               \u25B6 %-3s%-38s%n", "4. ", textBundle.getString("division"));
        System.out.format("         %-45s%n", textBundle.getString("choose_operations"));
        lineSeparator();
        lineSeparator();

        while (true) {
            String input = keyboard.next();

            if (input.toLowerCase().equals("x")) {
                break;
            }

            int menuChoice;
            try {
                menuChoice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(textBundle.getString("incorrect_menu_choice"));
                continue;
            }

            switch (menuChoice) {
                case 1:
                    System.out.println(textBundle.getString("addition_confirmation"));
                    if (!selectedChoices.contains(Operations.ADDITION)) {
                        selectedChoices.add(Operations.ADDITION);
                        selectedChoicesToPrint.add(textBundle.getString("addition"));
                    }
                    break;
                case 2:
                    System.out.println(textBundle.getString("subtraction_confirmation"));
                    if (!selectedChoices.contains(Operations.SUBTRACTION)) {
                        selectedChoices.add(Operations.SUBTRACTION);
                        selectedChoicesToPrint.add(textBundle.getString("subtraction"));
                    }
                    break;
                case 3:
                    System.out.println(textBundle.getString("multiplication_confirmation"));
                    if (!selectedChoices.contains(Operations.MULTIPLICATION)) {
                        selectedChoices.add(Operations.MULTIPLICATION);
                        selectedChoicesToPrint.add(textBundle.getString("multiplication"));
                    }
                    break;
                case 4:
                    System.out.println(textBundle.getString("division_confirmation"));
                    if (!selectedChoices.contains(Operations.DIVISION)) {
                        selectedChoices.add(Operations.DIVISION);
                        selectedChoicesToPrint.add(textBundle.getString("division"));
                    }
                    break;
                default:
                    System.out.println(textBundle.getString("incorrect_menu_choice"));
                    break;
            }
        }

        String printSelected = selectedChoicesToPrint.toString().toLowerCase();
        System.out.printf("%s %s%n", textBundle.getString("selected_choices_print"), printSelected.substring(1, printSelected.length() - 1));

        return selectedChoices;
    }

    static double processFirstNumberInput() {
        double firstNumber;
        while (true) {
            System.out.printf("%s ", textBundle.getString("first_number_text"));
            String keyInput = keyboard.next();
            try {
                firstNumber = Double.parseDouble(keyInput);
                break;
            } catch (NumberFormatException e) {
                System.out.printf("%s%n", textBundle.getString("incorrect_number_choice"));
            }
        }
        return firstNumber;
    }

    static double processSecondNumberInput() {
        double secondNumber;
        while (true) {
            System.out.printf("%s ", textBundle.getString("second_number_text"));
            String keyInput = keyboard.next();
            try {
                secondNumber = Double.parseDouble(keyInput);
                break;
            } catch (NumberFormatException e) {
                System.out.println(textBundle.getString("incorrect_number_choice"));
            }
        }
        return secondNumber;
    }

    static void calculateResults(List<Operations> selectedOperations, double firstNumber, double secondNumber) {

        lineSeparator();
        System.out.printf("\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660 \u265A %s%s%n", textBundle.getString("title"),
                " \u265A \u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660\u2660");
        lineSeparator();

        if (selectedOperations.contains(Operations.ADDITION)) {
            double result = MathOperations.addition(firstNumber, secondNumber);
            System.out.printf("   %s : %f%n", textBundle.getString("addition"), result);
        }
        if (selectedOperations.contains(Operations.SUBTRACTION)) {
            double result = MathOperations.subtraction(firstNumber, secondNumber);
            System.out.printf("   %s : %f%n", textBundle.getString("subtraction"), result);
        }
        if (selectedOperations.contains(Operations.MULTIPLICATION)) {
            double result = MathOperations.multiplication(firstNumber, secondNumber);
            System.out.printf("   %s : %f%n", textBundle.getString("multiplication"), result);
        }
        if (selectedOperations.contains(Operations.DIVISION)) {
            double result = MathOperations.division(firstNumber, secondNumber);
            System.out.printf("   %s : %f%n", textBundle.getString("division"), result);
        }

        lineSeparator();
        lineSeparator();
    }

    private static void lineSeparator() {
        for (int i = 0; i < 44; i++) {
            System.out.print("\u2660");
        }
        System.out.println();
    }
}
