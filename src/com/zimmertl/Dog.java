package com.zimmertl;

/**
 * Created by mgreen14 on 12/27/17.
 * @author Matt Green
 * @version 1.0
 */
public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     * Creates an instance of Dog initialized with values
     * @param friendly a flag indicating whether the object is friendly
     * @param name the name of the cat
     */
    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     * Returns the indicator whether dog is friendly
     * @return the friendly indicator
     */
    public boolean isFriendly() {
        return friendly;
    }

    /**
     * Returns the dog's speech
     * @return the dog's speech
     */
    @Override
    public String talk() {
        return "Bark";
    }

    /**
     * Returns a string representation of the object
     * @return a string representation of the dog
     */
    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}