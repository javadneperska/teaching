package sk.varga.martin.gl1;

public class Main {

    public static void main(String[] args) {
        Person p1 = createPerson("Martin", "Varga");
        Person p2 = createPerson("Kung", "Fury");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

    private static Person createPerson(String name, String sureName){
        Person p = new Person();
        p.setName(name);
        p.setSureName(sureName);
        return p;
    }
}
