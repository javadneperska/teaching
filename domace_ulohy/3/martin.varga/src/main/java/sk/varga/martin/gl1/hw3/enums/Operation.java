package sk.varga.martin.gl1.hw3.enums;

public enum Operation {
    ADD("add", "scitanie"),
    SUBTRACT("subtract", "odcitanie"),
    DIVIDE("divide", "delenie"),
    MULTIPLE("multiple", "nasobenie");

    private final String engValue;
    private final String svkValue;

    Operation(String engValue, String svkValue){
        this.engValue = engValue;
        this.svkValue = svkValue;
    }

    public String getEngValue() {
        return engValue;
    }

    public String getSvkValue() {
        return svkValue;
    }
}
