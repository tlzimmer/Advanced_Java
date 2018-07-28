package com.zimmertl;

/**
 * Created by mgreen14 on 12/27/17.
 * @author Matt Green
 * @version 1.0
 */
public class Student extends Person implements Talkable {
    private int age;

    /**
     * Creates an instance of Student initialized with values
     * @param age the age of the Student
     * @param name the name of the student
     */
    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     * Returns the student's age
     * @return the student's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the student's age
     * @param age the student's age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the student's speech
     * @return the the student's speech
     */
    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}
