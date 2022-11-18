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
public class Desk extends Furniture implements Serializable{
    private final int HEIGHT = 80;
    private int width;
    private int depth;
    private NoDeskDraws noDraws;

    /**
     * A constructor method used to create a desk object
     * @param width
     * @param depth
     * @param noDraws
     * @param idNumber
     * @param woodType
     * @param quantity 
     */
    public Desk(int width, int depth, NoDeskDraws noDraws, int idNumber, WoodType woodType, int quantity) {
        super(idNumber, woodType, 0, quantity, "images/desk.jpg");
        this.width = width;
        this.depth = depth;
        this.noDraws = noDraws;
        this.setItemPrice(calculatePrice());
    }

    /**
     * a method used to return the width of the desk object
     * @return width as a integer
     */
    public int getWidth() {
        return width;
    }

    /**
     * a method used to set the width of the desk object
     * @param width 
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * a method used to get the depth of the desk object
     * @return depth as an integer
     */
    public int getDepth() {
        return depth;
    }

    /**
     * a method used to set the depth of the desk object
     * @param depth 
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }

    /**
     * a method used to return the number of draws the desk has 
     * @return noDraws enumeration
     */
    public NoDeskDraws getNoDraws() {
        return noDraws;
    }

    /**
     * a method used to set the number of draws the desk has
     * @param noDraws 
     */
    public void setNoDraws(NoDeskDraws noDraws) {
        this.noDraws = noDraws;
    }
    
    /**
     * A method used to calculate the number of units required to create the desk
     * @return number of units as an integer
     */
    @Override
    public int calculateNoUnits(){
        int units = this.HEIGHT + this.width + this.depth;
        units *= 12 ;
        units += this.depth * this.width;
        return units;
    }
    
    /**
     * a method used to calculate the price by calling the calculate units method 
     * and multiplying by the cost of the type of wood.
     * @return price as a double
     */
    @Override
    public double calculatePrice(){
        // calculate 
        return (double)Math.round((calculateNoUnits() * this.getTypeOfWood()
                .getPrice() + (this.getNoDraws().getNoDraws() * 8.50)) * 100) / 100;
    }

    /**
     * a method used to return the attributes of the object as a formatted string.
     * @return the object as formatted string
     */
    @Override
    public String toString() {
        return "Desk\n" + "ID Number: " + this.getIdNumber() +'\n' 
                + "Wood type: " + this.getTypeOfWood().toString() + '\n'
                + "Depth: " + this.getDepth() + '\n'
                + "Width: " + this.getWidth()+ '\n'
                + "Number of draws: " + this.getNoDraws().toString()+ '\n'
                + "Quantity: " + this.getQuantity() + '\n' 
                + "Price: £" + this.getItemPrice();
    }
    
}
