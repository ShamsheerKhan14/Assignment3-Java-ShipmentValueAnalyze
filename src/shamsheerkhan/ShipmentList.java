/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shamsheerkhan;

/**
 * Date completed: 23 October 2022
 * Student Id: 991661386
 * @author Shamsheer Khan
 * 
 * importing ArrayList to be used 
 * importing list to be used
 * Below is the ShipmentList class containing all constants required for 
 * the assignment where we had declared ArrayList of ShipmentList of type Shipment
 * it also consist of get ,length , add, findShipment and tosTring methods required for the assisgnment
 * 
 */
import java.util.ArrayList;
import java.util.List;
public class ShipmentList {
    
    /**
     * creating of ArrayList named shipmentList of type Shipment
     */
    ArrayList <Shipment> shipmentList = new ArrayList <Shipment>();
    
    
     /**
     * this is get method which accepts an integer index and returns the Shipment 
     * object at that index
     */
    public int get(int index){
        return index;
    }
    
    
    /**
     * This is the length method used to show the size of the elements in the 
     * ShipmentList as array in it.
     * return is returning the size of the elements of the arraylist
     */
    public int length(Shipment[] shipmentlist){
        int size;
        size = shipmentList.size();
        return size;
    }
    
   
}
