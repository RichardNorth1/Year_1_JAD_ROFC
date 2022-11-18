/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package CoreApplication;

/**
 *
 * @author Richard North a0313108
 */
public enum BaseType {
    
    WOODEN(45), 
    CHROME(35);
    private final int price;

    private BaseType(int price) {
        this.price = price;
    }
    
    /**
     * A simple method used to return the price of the object
     * @return the price as an integer
     */
    public int getPrice(){
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
