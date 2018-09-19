package com.company;

/**
 * This class is an interface to allow functionality of addWeight and loseWeight methods to the person class
 * @author David Allen
 * @version 1.0
 */
public interface Weighable {
    /**
     * This method adds weight to the weight change property of a person object
     * @param pounds the pounds gained added to weight change property
     */
    public void addWeight(double pounds);

    /**
     * This method subtracts weight to the weight change property of a person object
     * @param pounds the pounds lost subtracted from the weight change property
     */
    public void loseWeight(double pounds);

}
