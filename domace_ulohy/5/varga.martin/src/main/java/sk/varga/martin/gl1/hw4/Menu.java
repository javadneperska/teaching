package sk.varga.martin.gl1.hw4;

public class Menu {
    private static final int MENU_LENGHT = 100;
    private static final int INDENT_TEXT_FROM_MIDDLE_TO_LEFT = 15;


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

    public void printMenu1() {
        drawLine(MENU_LENGHT);
        printLineWithText("");
        printLineWithText("Matrix multiplication");
        printLineWithText("");
        printLineWithText("1. Load matrices from file");
        printLineWithText("2. Generate matrices");
        printLineWithText("");
        printLineWithText("Make a choice and press Enter");
        printLineWithText("");
        drawLine(MENU_LENGHT);
    }
}
