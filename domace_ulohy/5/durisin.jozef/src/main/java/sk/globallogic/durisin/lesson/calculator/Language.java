package sk.globallogic.durisin.lesson.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;


/**
 * This class provides localization.
 */
public class Language {
    private static final ArrayList<String> supportedLanguages = new ArrayList<>(Arrays.asList("en", "sk"));
    private static Locale locale = new Locale("en");
    public static ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);

    // Suppresses default constructor, ensuring non-instantiability.
    private Language() {
    }

    /**
     * Sets language from user input.
     */
    public static void setLanguage() {
        System.out.println(">>> Select language. Available options: " + supportedLanguages.toString());
        String input;

        while (true) {
            input = Util.scanner.nextLine();
            if (supportedLanguages.contains(input)) {
                locale = new Locale(input);
                messages = ResourceBundle.getBundle("MessagesBundle", locale);
                break;
            } else {
                System.out.println(">>> Unsupported language");
            }
        }
    }

}
