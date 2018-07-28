package com.zimmertl;

/**
 * Created by mgreen14 on 12/27/17.
 * Modified by tzimmer on 7/14/18.
 * @author Matt Green
 * @version 1.0
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     * Creates an instance of Cat initialized with values
     * @param mousesKilled the number of mice killed
     * @param name the name of the cat
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     * Returns the number of mice killed
     * @return the number of mice killed
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * Increments the number of mice killed
     */
    public void addMouse() {
        mousesKilled++;
    }

    /**
     * Returns the cat's speech
     * @return the cat's speech
     */
    @Override
    public String talk() {
        return "Meow";
    }

    /**
     * Returns a string representation of the object
     * @return a string representation of the cat
     */
    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

