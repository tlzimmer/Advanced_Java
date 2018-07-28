package com.zimmertl;

/**
 * Created by mgreen14 on 12/27/17.
 * @author Matt Green
 * @version 1.0
 */
public abstract class Pet {
    protected String name;

    /**
     * Creates an instance of Pet initialized with values
     * @param name the name of the pet
     */
    public Pet(String name) {
        this.name = name;
    }

    /**
     * Returns the pet's name
     * @return the pet's name
     */
    public String getName() {
        return name;
    }

}