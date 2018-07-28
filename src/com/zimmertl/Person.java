package com.zimmertl;

/**
 * Created by mgreen14 on 12/27/17.
 * @author Matt Green
 * @version 1.0
 */
public abstract class Person {
    private String name;

    /**
     * Creates an instance of Person initialized with values
     * @param name the name of the person
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Returns the person's name
     * @return the person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the person's name
     * @param name the person's name
     */
    public void setName(String name) {
        this.name = name;
    }


}