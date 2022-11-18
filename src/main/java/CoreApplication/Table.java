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
public class Table extends Furniture implements Serializable{
    private int diameter;
    private BaseType baseType;

    /**
     * Constructor method used for creating a Table
     * @param diameter
     * @param baseType
     * @param idNumber
     * @param woodType
     * @param quantity 
     */
    public Table(int diameter, BaseType baseType, int idNumber, WoodType woodType, int quantity) {
        super(idNumber, woodType, 0, quantity, "images/table.jpg");
        this.diameter = diameter;
        this.baseType = baseType;
        this.setItemPrice(this.calculatePrice());
    }

    /**
     * A method used to return the diameter of this table 
     * @return diameter as an integer
     */
    public int getDiameter() {
        return diameter;
    }

    /**
     * A method used to set the diameter of this table
     * @param diameter 
     */
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    /**
     * A method used to get the base type 
     * @return base type as an enumeration
     */
    public BaseType getBaseType() {
        return baseType;
    }
  
    /**
     * A method used to set the base type 
     * @param baseType 
     */
    public void setBaseType(BaseType baseType) {
        this.baseType = baseType;
    }
 
    /**
     * A method used to calculate the number of units a table has
     * @return 
     */
    @Override
    public int calculateNoUnits(){
        return this.getDiameter() * this.getDiameter();
    }
    
    /**
     * A method used to calculate the price of this table
     * @return 
     */
    @Override
    public double calculatePrice(){
        return (double)Math.round((calculateNoUnits() * this.getTypeOfWood().getPrice()
                + this.getBaseType().getPrice()) * 100) / 100;
    }

    /**
     * a method used to return the attributes of the object as a formatted string.
     * @return the object as formatted string
     */
    @Override
    public String toString() {
        return "Table\n" + "ID Number: " + this.getIdNumber() +'\n' 
                + "Wood type: " + this.getTypeOfWood().toString() + '\n'
                + "Diameter: " + this.getDiameter() + '\n'
                + "Base type: " + this.getBaseType().toString()+ '\n'
                + "Quantity: " + this.getQuantity() + '\n' 
                + "Price: £" + this.getItemPrice();
    }
    
    
}
