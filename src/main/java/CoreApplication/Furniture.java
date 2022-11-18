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
public abstract class Furniture implements Serializable{
    protected int idNumber;
    protected WoodType typeOfWood;
    protected double itemPrice;
    protected int quantity;
    protected String imagePath;

    /**
     * Constructor method for a furniture item
     * @param idNumber
     * @param woodType
     * @param itemPrice
     * @param quantity
     * @param imagePath 
     */
    public Furniture(int idNumber, WoodType woodType, double itemPrice, int quantity, String imagePath) {
        this.idNumber = idNumber;
        this.typeOfWood = woodType;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
        this.imagePath = imagePath;
    }
    
    /**
     * A method used to calculate the number of units required to create the chair
     * @return number of units as an integer
     */
    abstract public int calculateNoUnits();
    
    /**
     * a method used to calculate the price by calling the calculate units method 
     * and multiplying by the cost of the type of wood.
     * @return price as a double
     */
    abstract public double calculatePrice();

    /**
     * A method used to return the ID number of a furniture item
     * @return ID as an integer
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * A method used to return the Type of wood 
     * @return typeOfWood enumeration
     */
    public WoodType getTypeOfWood() {
        return typeOfWood;
    }

    /**
     * A method used to return the item price
     * @return price as a double
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     * A method used to return the quantity
     * @return quantity as a integer
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * A method used to return the furniture's image path
     * @return String file path and name
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * A method used to set an items ID number 
     * @param idNumber 
     */
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * A method used to set the type of wood a item has 
     * @param typeOfWood 
     */
    public void setTypeOfWood(WoodType typeOfWood) {
        this.typeOfWood = typeOfWood;
    }

    /**
     * A method used to set the price of a furniture item
     * @param itemPrice 
     */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * A method used to set the quantity of the furniture item
     * @param quantity 
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }    
}
