/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package CoreApplication;

/**
 *
 * @author Richard North a0313108
 */
public enum NoDeskDraws {
    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4);
    
    private final int noDraws;

    private NoDeskDraws(int noDraws) {
        this.noDraws = noDraws;
    }

    /**
     * A method used to the number of draws
     * @return number of  draws as an integer
     */
    public int getNoDraws() {
        return noDraws;
    }

    /**
     * A method used to return the name
     * @return name as a string
     */
    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
    
    

}
