package sk.dneperska;

public class Utils {
    public static void printResult(String name, SupportedMethod suppportedMethod, double a, double b, double result) {
        switch (suppportedMethod) {
            case OBSAH:
                System.out.println(name + " obsah stran a: " + a + " b: " + b + " je: " + result);
                break;
            case OBVOD:
                System.out.println(name + " obvod stran a: " + a + " b: " + b + " je: " + result);

                break;
            default:
                break;
        }
    }
}
