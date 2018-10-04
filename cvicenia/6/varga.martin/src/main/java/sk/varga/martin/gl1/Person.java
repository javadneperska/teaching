package sk.varga.martin.gl1;

public class Person {

    private static int COUNT_PERSON;

    private String name;
    private String sureName;

    public Person(){
        COUNT_PERSON++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    @Override
    public String toString(){
        return "Count of persons:" + COUNT_PERSON + ", Name: " + name + ", Surename: " + sureName;
    }
}
