/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreApplication;

import java.io.Serializable;

/**
 *
 * @author Richard North a0313108
 */
public class Chair extends Furniture implements Serializable{
    private ArmrestsNeeded armrests;
    

    /**
     * Constructor method to create a chair object
     * @param armrests
     * @param idNumber
     * @param woodType
     * @param quantity 
     */
    public Chair(ArmrestsNeeded armrests, int idNumber, WoodType woodType, int quantity) {
        super(idNumber, woodType, 0, quantity, "images/chair.jpg");
        this.armrests = armrests;
        this.setItemPrice(calculatePrice());
    }
    
//    // Copy constructor 
//    public Chair(Chair c) {
//        super (c.idNumber, c.typeOfWood, c.itemPrice, c.quantity, c.imagePath);
//        this.armrests = c.armrests;
//        this.setItemPrice(calculatePrice());
//    }

    /**
     * A method used to return the Armrest attribute
     * @return armrest enumeration
     */
    public ArmrestsNeeded getArmrests() {
        return armrests;
    }

    /**
     * A method used to set the state of the armrest attribute
     * @param armrest enumeration
     */
    public void setArmrests(ArmrestsNeeded armrests) {
        this.armrests = armrests;
    }
    
    /**
     * A method used to calculate the number of units required to create the chair
     * @return number of units as an integer
     */
    @Override
    public int calculateNoUnits(){
        return 1625 + this.getArmrests().getUnits();
    }
    
    /**
     * a method used to calculate the price by calling the calculate units method 
     * and multiplying by the cost of the type of wood.
     * @return price as a double
     */
    @Override
    public double calculatePrice(){        
        return (double)Math.round((this.calculateNoUnits()
                * this.getTypeOfWood().getPrice()) * 100) / 100;
    }

    /**
     * a method used to return the attributes of the object as a formatted string.
     * @return the object as formatted string
     */
    @Override
    public String toString() {
        return "Chair\n" +"ID number: "+ this.getIdNumber()+ '\n'
                + "Armrests: " + getArmrests().toString() + '\n' 
                + "Wood type: " + this.getTypeOfWood().toString() +'\n' 
                + "Quantity: " + this.getQuantity() + '\n' 
                + "Price: £" + this.getItemPrice();
    } 

}
