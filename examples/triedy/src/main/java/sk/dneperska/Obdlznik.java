package sk.dneperska;

public class Obdlznik {
    private double a;
    private double b;


    public Obdlznik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double obvod() {
        return 2 * (a + b);
    }

    public double obsah() {
        return a * b;
    }

    public void printResult(SupportedMethod supportedMethod) {
        switch (supportedMethod) {
            case OBSAH:
                Utils.printResult(getClassName(), supportedMethod, a, b, obsah());
                break;
            case OBVOD:
                Utils.printResult(getClassName(), supportedMethod, a, b, obvod());
                break;
            default:
                break;
        }
    }

    private String getClassName() {
        return getClass().getName();
    }

    public void printAllResults() {
        for (SupportedMethod supportedMethod : SupportedMethod.values()) {
            printResult(supportedMethod);
        }
    }
}
