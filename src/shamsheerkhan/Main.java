/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shamsheerkhan;

/**
 * Date completed: 23 October 2022
 * Student Id: 991661386
 * @author Shamsheer Khan
 */
/**
 * Importing scanner to be used in the class to store the values given by the user
 * Importing ArrayList to be used in the class
 * Main method below contains the declaration of new ArrayList with Type shipment
 * and all the required variables name, value, another used in the assignment
 * it also carries the exceptions for each variables. that is if the required condition
 * is not met then we throw a exception
 * after everything is correct then we format the input after taking it from user and
 * provide him the output 
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        /**
         * ArrayList named shipmentList of type shipment to be used in the assignment
         */
        ArrayList <Shipment> shipmentList = new ArrayList <Shipment>();
        /**
         * variable String name use for storing the value taken from the user for the province
         * variable value used to store the value entered by the user for shipment value 
         * variable another used to check if user wants to add another by typing Y/N and storing in this
         * 
         */
        String name;
        double value;
        char another;
        
        /**
         * Prompting the user to Enter Destination province code and storing in
         * variable name
         */
        System.out.print("Enter Destination Province Code: ");
        name = sc.nextLine();
       
        /**
         * Prompting the user to Enter Total Value of Shipment and storing in
         * variable value
         */
        System.out.print("Enter Total Value of Shipment: ");
        value = sc.nextDouble();
        
        /**
         * Prompting the user to ask him if he wants to add another province and storing in
         * variable another
         */
        System.out.print("Add another (Y/N) ? ");
        another = sc.next().charAt(0);
        
        /**
         * if condition statement to check the char value entered by user is in Y or y and 
         * prompt the user to enter information again or if entered N or n then skip this
         * and move further
         */
        if (another == 'Y' || another == 'y'){
            System.out.print("Enter Destination Province Code: ");
            name = sc.nextLine();
            System.out.println();
            System.out.print("Enter Total Value of Shipment: ");
            value = sc.nextDouble();
        }else{
            System.out.println("This Week's shipments: ");
            
        }
        
        /**
         * Showing the highest of the shipment value entered by the user along with the
         * province name entered.
         */
        System.out.println("Most Valuable Shipment: " + name + " $" + value); 
    }
}
