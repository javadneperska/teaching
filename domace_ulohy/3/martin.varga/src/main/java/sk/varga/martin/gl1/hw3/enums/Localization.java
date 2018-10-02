package sk.varga.martin.gl1.hw3.enums;

public enum Localization {
    ENGLISH("english", "anglicky"),
    SLOVAK("slovak", "slovensky");

    public String getEngValue() {
        return engValue;
    }
    public String getSvkValue() {return svkValue;}

    Localization(String engValue, String svkValue){
        this.engValue = engValue;
        this.svkValue = svkValue;
    }

    private final String engValue;
    private final String svkValue;


}
