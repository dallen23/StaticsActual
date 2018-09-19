package com.company;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is a test class for the person class to tests all methods which are not void
 * @author David Allen
 * @version 1.0
 */
public class PersonTest {

    Person person; //created instance of Person object for testing purposes

    /**
     * This method tests the getFirstName method
     */
    @Test
    public void getFirstName() {
        Person person = new Person();
        String actualfname = person.getFirstName();
        assertEquals("John",actualfname);
    }

    /**
     * This method tests the getAge method
     */
    @Test
    public void getAge() {
        Person person = new Person();
        int actualage = person.getAge();
        assertEquals(18,person.getAge());
    }

    /**
     * This method tests the getLastName method
     */
    @Test
    public void getLastName() {
        Person person = new Person();
        String actuallname = person.getLastName();
        assertEquals("Doe",actuallname);
    }

    /**
     * This method tests the getWorkTime method
     */
    @Test
    public void getWorkTime() {
        Person person = new Person();
        String actualworktime = person.getWorkTime();
        assertEquals("8:30am",actualworktime);
    }
}