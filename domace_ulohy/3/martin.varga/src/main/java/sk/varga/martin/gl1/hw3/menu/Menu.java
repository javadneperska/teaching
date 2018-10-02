package sk.varga.martin.gl1.hw3.menu;

import sk.varga.martin.gl1.hw3.enums.Localization;
import sk.varga.martin.gl1.hw3.enums.Operation;

public class Menu {

    public Menu(Localization localization){
        this.localization = localization;
    }

    private Localization localization;

    private static final int MENU_LENGHT = 100;
    private static final int INDENT_TEXT_FROM_MIDDLE_TO_LEFT = 15;

    private String selectLanguageString = System.getProperty("select.language");
    private String closeString = System.getProperty("close");
    private String selectOperationString = System.getProperty("select.operation");

    public void printMenu1() {
        drawLine(MENU_LENGHT);
        printLineWithText("");
        printLineWithText(selectLanguageString);
        printAvailableLanguages();
        printLineWithText("C. " + closeString.toUpperCase());
        printLineWithText("");
        drawLine(MENU_LENGHT);

    }

    public void printMenu2(){
        drawLine(MENU_LENGHT);
        printLineWithText("");
        printLineWithText(selectOperationString);
        printAvailableOperations();
        printLineWithText("");
        drawLine(MENU_LENGHT);
    }

    private void drawLine(int lenght) {
        for (int i = 0; i < lenght; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    private void printLineWithText(String text) {
        System.out.format("*" + "%" + String.valueOf((MENU_LENGHT / 2) - INDENT_TEXT_FROM_MIDDLE_TO_LEFT) + "s", "");
        System.out.print(text);
        System.out.format("%" + String.valueOf((MENU_LENGHT / 2) - text.length() + INDENT_TEXT_FROM_MIDDLE_TO_LEFT) + "s", "*\n");
    }

    private void printAvailableLanguages() {
        int iterator = 1;
        for (Localization loc : Localization.values()) {
            switch (localization){
                case ENGLISH:
                    printLineWithText(iterator + ". " + loc.getEngValue().toUpperCase());
                    break;
                case SLOVAK:
                    printLineWithText(iterator + ". " + loc.getSvkValue().toUpperCase());
                    break;
                    default:
                        break;
            }
            iterator++;
        }
    }

    private void printAvailableOperations(){
        int iterator = 1;
        for (Operation op : Operation.values()) {
            switch (localization){
                case ENGLISH:
                    printLineWithText(iterator + ". " + op.getEngValue().toUpperCase());
                    break;
                case SLOVAK:
                    printLineWithText(iterator + ". " + op.getSvkValue().toUpperCase());
                    break;
                default:
                    break;
            }
            iterator++;
        }
    }
}
