package sk.varga.martin.gl1.hw4.enums;

public enum MatrixDimension {
    HEIGHT("height"),
    WIDTH("width");

    private final String value;

    MatrixDimension(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
