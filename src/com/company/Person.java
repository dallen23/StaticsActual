package com.company;

/**
 * The Person class creates instances of person objects
 * @author David Allen
 * @version 1.0
 */
public class Person implements Weighable{

    private String firstName; //holds first name property of person objects
    private String lastName; //holds last name property of person objects
    int age; //holds the age property of person objects
    int weightchange = 0; //holds the change in weight property of person objects
    private static String workTime = "8:30am"; //holds the starting work time of person objects

    /**
     * This is the Constructor of a person object when first name, last name, and age are specified
     * @param firstName first name of person object
     * @param lastName last name of person object
     * @param age age of person object
     */
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * This is the Constructor of a person object when first name and last name are specified
     * @param firstName first name of person object
     * @param lastName last name of person object
     */
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        setAge(18);
    }

    /**
     * This is the Constructor of a person object when only first name is specified
     * @param firstName first name of person object
     */
    public Person(String firstName){
        this.firstName = firstName;
        setLastName("Doe");
        setAge(18);
    }

    /**
     * This is the Constructor of a person object when last name and age are specified
     * @param lastName last name of person object
     * @param age age of person object
     */
    public Person(String lastName, int age){
        setFirstName("John");
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * This is the default Constructor of a person object when no parameters are specified
     */
    public Person(){
        setFirstName("John");
        setLastName("Doe");
        setAge(18);

    }

    /**
     * This method returns the first name of a person object
     * @return the first name of a person object
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method manually sets the first name of a person object
     * @param firstName first name of person object
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method returns the age property of a person object
     * @return age of person object
     */
    public int getAge() {
        return age;
    }

    /**
     * This method manually sets the age property of a person object
     * @param age age of person object
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * This method manually sets the starting work time property of a person object
     * @param workTime starting work time of person object
     */
    public static void setWorkTime(String workTime) {
        Person.workTime = workTime;
    }

    /**
     * This is a Constructor of a person object when only the age is specified
     * @param age age of person object
     */
    public Person(int age){
        firstName = "John";
        lastName = "Doe";
        this.age = age;
    }

    /**
     * This method returns the last name property of a person object
     * @return the last name of person object
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method manually sets the last name property of a person object
     * @param lastName last name of person object
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method returns the starting work time of a person object
     * @return the starting work time of person object
     */
    public static String getWorkTime(){
        return workTime;
    }

    /**
     * This method adds weight to the weight change property of a person object
     * @param weight the weight to be added to the weight change property of a person object
     */
    public void addWeight(double weight){
        weightchange += weight;
    }

    /**
     * This method subtracts weight from the weight change property of a person object
     * @param weight the weight to be subtracted from the weight change property of a person object
     */
    public void loseWeight(double weight){
        weightchange -= weight;
    }
}

