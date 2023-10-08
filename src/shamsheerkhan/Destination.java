/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package shamsheerkhan;

/**
 * Date completed: 23 October 2022
 * Student Id: 991661386
 * @author Shamsheer Khan
 * 
 * Below is the enum Destination class containing all constants required for 
 * the assignment which also consist of constructor Destination method with 2 arguments passed
 * and also mentions the use of all the required accessor methods 
 * it mentions the declaration of 3 variables name and cost
 */
public enum Destination {
    
    AB("Alberta", 21.95),
    BC("British Columbia", 25.95),
    MB("Manitoba", 18.95),
    NB("New Brunswick", 21.95),
    NL("Newfoundland & Labrador", 24.95),
    NS("Nova Scotia", 22.95),
    NT("Northwest Territories", 27.95),
    NU("Nunavut", 27.95),
    ON("Ontario", 12.49),
    PE("Prince Edward Island", 23.49),
    QC("Quebec", 16.95),
    SK("Sasktchewan", 21.95),
    YT("Yukon", 29.95);
    
    /**
     * String name is to store the name of the province in it
     * double cost variable to store the value per of cost per province
     */
    private String name;
    private double cost;
    
     /**
     * This is a method to get name  as a String from the user and this is 
     * a accessor method
     * @return will return the name as a String
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * This is a method to get cost  as a double from the user and this is 
     * a accessor method
     * @return will return the cost as a double
     */
    public double getCost(){
        return this.cost;
    }
    
    /**
     * This is a constructor method to get name  as a String from the user and
     * cost as a double and assign it to the variable name and cost respectively
     */
    private Destination(String name, double cost){
        this.name = name;
        this.cost = cost; 
    }
}
