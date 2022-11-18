/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreApplication;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Richard North a0313108
 */
public class Basket implements Serializable{
    //private double totalPrice;
    private ArrayList<Furniture> basketItems = new ArrayList<>(9);

    /**
     * Constructor method used to create an empty basket
     */
    public Basket() {
    }

    /**
     * A method used to add an item to the basket
     * @param item 
     */
    public void addToBasket(Furniture item) {
        basketItems.add(item);
    }

    /**
     * A method used to remove an item from the basket using an index
     * @param index 
     */
    public void removeFromBasket(int index) {
        basketItems.remove(index);
    }
    
    /**
     * A method used to remove all items from the basket 
     */
    public void emptyBasket() {
        basketItems.clear();
    }
    
    /**
     * A method used to return an item from the basket based on its index
     * @param index
     * @return Furniture item
     */
    public Furniture getItem(int index){
        return basketItems.get(index);
    }
    
    /**
     * A method used to determine how many items are in the basket
     * @return amount of items in the basket as an integer
     */
    public int getSize(){
        return basketItems.size();
    }
                     
    /**
     * A method used to calculate the total of all items inn the basket by calling
     * the objects calculate price method 
     * @return the total price as a double
     */
    public double calculateTotal(){
        double total = 0;
        for (Furniture item:basketItems){
            total += item.calculatePrice();
        }
        return (double) Math.round(total * 100) / 100;
    }
    
    /**
     * A simple method that is used to iterate through the basket items and 
     * print their to string methods to console
     */
    public void printSummary(){
        for(Furniture item:basketItems){
            System.out.println(item.toString() + "\n");
        }
    }
    
    /**
     * A method used to take a file name and write the basket object to file 
     * @param fileName string file path and name
     */
    public void saveBasket(String fileName){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.flush();
            objectOutputStream.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    
    
}
