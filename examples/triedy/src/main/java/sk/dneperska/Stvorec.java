package sk.dneperska;

public class Stvorec {
    private double a;


    public Stvorec(double a) {
        this.a = a;
    }

    public void printResult(SupportedMethod supportedMethod) {
        switch (supportedMethod) {
            case OBSAH:
                Utils.printResult(getClassName(), supportedMethod, a, a, obsah());
                break;
            case OBVOD:
                Utils.printResult(getClassName(), supportedMethod, a, a, obvod());
                break;
            default:
                break;
        }
    }

    private String getClassName() {
        return getClass().getName();
    }

    private double obvod() {
        return 4 * a;
    }

    private double obsah() {
        return a * a;
    }

    public void printAllResults() {
        for (SupportedMethod supportedMethod : SupportedMethod.values()) {
            printResult(supportedMethod);
        }
    }
}
