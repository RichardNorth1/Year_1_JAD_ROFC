/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import CoreApplication.Furniture;

/**
 *
 * @author Richard North a0313108
 */
public interface DisplayBasketObserver {
    public void showItemDetails(int index);
    public void removeItem(int index);
    public void editItem(int index);
    
}
