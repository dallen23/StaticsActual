package com.company;

import java.util.*;

/**
 * The Startup class creates instances of Person objects and stores them in an ArrayList object, and demonstrates functionality of their properties
 * @author David Allen
 * @version 1.0
 */
public class Startup {
    public Startup(){
        Person p1 = new Person("David","Allen",25); //Person instance number one
        Person p2 = new Person("David"); //Person instance number two
        Person p3 = new Person(25); //Person instance number three
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        for (int i = 0; i < people.size(); i++){
            System.out.println("FN: " + people.get(i).getFirstName() + "   LN: " + people.get(i).getLastName() + "   Age: " + people.get(i).getAge());
        }
        System.out.println();
        System.out.println("Work Hours: " + Person.getWorkTime());
        System.out.println("First person loses 20 pounds, second person gains ten.");
        people.get(0).loseWeight(20);
        people.get(1).addWeight(10);
        System.out.println("First Person's weight change: " + people.get(0).weightchange);
        System.out.println("Second Person's weight change: " + people.get(1).weightchange);
    }
}