package com.globallogic.durisin.lesson;

import java.util.EnumSet;


public enum Operation {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/");

    private final String value;
    public static final int size = Operation.values().length;

    Operation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return getValue();
    }

    public static Operation getByValue(char value) {
        for (Operation element : EnumSet.allOf(Operation.class)) {
            if (element.value.equals(Character.toString(value))) {
                return element;
            }
        }

        throw new IllegalArgumentException("Can't find " + value);
    }
}
