package sk.globallogic.durisin.lesson.prdb;

import java.util.HashMap;


/**
 * Class for representing a person.
 */
public class Person {
    private HashMap<String, String> attributes;

    public Person() {
        attributes = new HashMap<>();
    }

    /**
     * Initializes Person.
     *
     * @param attributes person's attributes
     */
    public Person(HashMap<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * Sets Person's attributes
     *
     * @param attributes Person's attributes
     */
    public void setAttributes(HashMap<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * Gets Person's attributes.
     *
     * @return Person's attributes
     */
    public HashMap<String, String> getAttributes() {
        return attributes;
    }

    /**
     * String representation of Person
     *
     * @return Person's String representation
     */
    @Override
    public String toString() {
        return attributes.toString();
    }
}
