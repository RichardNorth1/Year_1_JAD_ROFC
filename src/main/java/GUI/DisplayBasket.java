/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import CoreApplication.Furniture;
import Interfaces.DisplayBasketObserver;
import Interfaces.FormObserver;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Richard North a0313108
 */
public class DisplayBasket extends JPanel implements MouseListener, FormObserver{
    
    private List<DisplayBasketObserver> observers = new ArrayList<>();
    private List<Icon> basketImages = new ArrayList<>();
    private List<JButton> buttons = new ArrayList<>();

            
    public DisplayBasket() {
        super();
        init();
    }
    
    /**
     * Adds a observer to the collection to be notified
     * @param observer 
     */
    public void addPanelObserver(DisplayBasketObserver observer) {
        observers.add(observer);
    }
    
    /**
     * This methods is used to initialise the swing components.
     */
    private void init(){
        for(int i=0; i<9;i++){
            JButton button = new JButton();
            button.setBackground(new java.awt.Color(255, 255, 255));
            this.buttons.add(button);
            this.add(button); 
        }
        
        setBackground(new Color(155, 217, 215));
        setLayout(new java.awt.GridLayout(3, 3, 5, 5));
    }
    
    /**
     * This method is used to clear all icons from the buttons.
     */
    public void clearButtons(){
        this.basketImages.clear();
        for(JButton button:buttons){
            button.setIcon(null);
            button.removeMouseListener(this);
        }
    }
    
    /**
     * This method is used to verify which mouse button has been clicked and perform 
     * the relevant action.
     * @param e 
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        // Left Click: Display details of the item.
        if(e.getButton() == MouseEvent.BUTTON1){
            for (DisplayBasketObserver observer : observers){
                observer.showItemDetails(buttons.indexOf(e.getSource()));
            }
        // Middle Click: Change/update item attributes and update charge.
        }else if(e.getButton() == MouseEvent.BUTTON2){
            for (DisplayBasketObserver observer : observers){
                observer.editItem(buttons.indexOf(e.getSource()));
            }
        // Right Click: Remove the item (after confirmation from the user).
        }else if(e.getButton() == MouseEvent.BUTTON3){
            for (DisplayBasketObserver observer : observers){
                observer.removeItem(buttons.indexOf(e.getSource()));
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    /**
     * This method is used to add a new furniture items image to the list of 
     * images to display 
     * @param item 
     */
    @Override
    public void updateBasket(Furniture item) {
        if(this.basketImages.size() < 9){
            ImageIcon newIcon = new ImageIcon(item.getImagePath());
            this.basketImages.add(newIcon);
            buttons.get(this.basketImages.indexOf(newIcon)).setIcon(
                    this.basketImages.get(this.basketImages.indexOf(newIcon)));
            buttons.get(this.basketImages.indexOf(newIcon)).addMouseListener(this);
        }
    }

}
