/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package CoreApplication;

/**
 *
 * @author Richard North a0313108
 */
public enum WoodType {
    OAK(0.04),
    WALNUT(0.03);
    private final double price;

    private WoodType(double price) {
        this.price = price;
    }

    /**
     * A method used to return the price
     * @return 
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * A simple method used to return the object name
     * @return name as a String
     */
    @Override
    public String toString() {
        return this.name();
    }
    
    
    

}
