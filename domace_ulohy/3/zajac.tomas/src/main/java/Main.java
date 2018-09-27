import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale currentLocale;
        List<Menu.Operations> operationsList;
        double firstNumber;
        double secondNumber;

        currentLocale = Menu.langMenu();
        operationsList = Menu.mainMenu(currentLocale);

        firstNumber = Menu.processFirstNumberInput();
        secondNumber = Menu.processSecondNumberInput();

        Menu.calculateResults(operationsList, firstNumber, secondNumber);
    }
}
