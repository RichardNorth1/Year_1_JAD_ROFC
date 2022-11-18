/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package CoreApplication;

/**
 *
 * @author Richard North a0313108
 */
public enum ArmrestsNeeded {
    
    YES(250),
    NO(0);
    
    private final int units;

    private ArmrestsNeeded(int units) {
        this.units = units;
    }

    /**
     * A simple method to get additional units
     * @return additional units as an integer 
     */
    public int getUnits() {
        return units;
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
