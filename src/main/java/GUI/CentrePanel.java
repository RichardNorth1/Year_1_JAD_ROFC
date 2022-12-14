/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Interfaces.LeftPanelObserver;
import Interfaces.FormObserver;
import CoreApplication.Basket;
import CoreApplication.Chair;
import CoreApplication.Desk;
import CoreApplication.Furniture;
import CoreApplication.Table;
import Interfaces.BottomPanelObserver;
import Interfaces.CentrePanelObserver;
import Interfaces.DisplayBasketObserver;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Richard North a0313108
 */
public class CentrePanel extends javax.swing.JPanel implements LeftPanelObserver,
        FormObserver,BottomPanelObserver,DisplayBasketObserver{

    private List<CentrePanelObserver> observers = new ArrayList<>();
    private Basket basket;
    /**
     * Creates new form CentrePanel
     */
    public CentrePanel() {
        this.basket = new Basket();
        initComponents();
        initListeners();
    }
    
    /**
     * Adds a observer to the collection to be notified
     * @param observer
     */
    public void addPanelObserver(CentrePanelObserver observer) {
        observers.add(observer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basketPanel = new GUI.DisplayBasket();
        chairPanel = new GUI.ChairForm();
        deskPanel = new GUI.DeskForm();
        tablePanel = new GUI.TableForm();

        setLayout(new java.awt.CardLayout());
        add(basketPanel, "Basket");
        add(chairPanel, "Chair");
        add(deskPanel, "Desk");
        add(tablePanel, "Table");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.DisplayBasket basketPanel;
    private GUI.ChairForm chairPanel;
    private GUI.DeskForm deskPanel;
    private GUI.TableForm tablePanel;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void updatePanel(String panel) {
        CardLayout layout = (CardLayout) this.getLayout();
        switch(panel){
            case "Basket":
                layout.show(this, "Basket");
                DecimalFormat df = new DecimalFormat(".00");
                String items = "<html>";
                for(int i=0; i<basket.getSize(); i++){
                    items += basket.getItem(i).getClass().getSimpleName();
                    items += " ??" + basket.getItem(i).getItemPrice() + "<br>";
                }
                items += "</html>";
                for (CentrePanelObserver observer:observers){
                    observer.CentrePanelUpdateItems(items);
                    observer.CentrePanelUpdateTotal(df.format(basket.calculateTotal()));
                }
                break;
                
            case "Chair":
                chairPanel.clearFill();
                layout.show(this, "Chair");
                for (CentrePanelObserver observer:observers){
                    observer.centrePanelClear();
                }
                
                break;
                
            case "Desk":
                deskPanel.clearFill();
                layout.show(this, "Desk");
                for (CentrePanelObserver observer:observers){
                    observer.centrePanelClear();
                }
                break;
                
            case "Table":
                tablePanel.clearFill();
                layout.show(this, "Table");
                for (CentrePanelObserver observer:observers){
                    observer.centrePanelClear();
                }
                break;
        }
    }
    
    /**
     * This method is used to print out the basket summary to console
     */
    @Override
    public void summary() {
        this.basket.printSummary();
    }

    /**
     * This method is used to empty all items from the basket and clear the icons 
     * from the basket panel
     */
    @Override
    public void clear() {
        this.basket.emptyBasket();
        this.basketPanel.clearButtons();
        for (CentrePanelObserver observer:observers){
            observer.centrePanelClear();
        }
    }

    /**
     * This method is used to save the current basket
     * @param fileName 
     */
    @Override
    public void save(String fileName) {
        this.basket.saveBasket(fileName);
    }

    /**
     * This method is used to load a basket from a file and overwrite the current
     * basket instance and repopulate the basket panels icons with the new basket.
     * @param fileName 
     */
    @Override
    public void load(String fileName) {
        
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            clear();
            basket = (Basket) objectInputStream.readObject();
            objectInputStream.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        for(int i=0;i<this.basket.getSize();i++){
            this.basketPanel.updateBasket(this.basket.getItem(i));
        }
        
        DecimalFormat df = new DecimalFormat(".00");
        String items = "<html>";
        for(int i=0; i<basket.getSize(); i++){
            items += basket.getItem(i).getClass().getSimpleName();
            items += " ??" + basket.getItem(i).getItemPrice() + "<br>";
        }
        items += "</html>";
        for (CentrePanelObserver observer:observers){
            observer.CentrePanelUpdateItems(items);
            observer.CentrePanelUpdateTotal(df.format(basket.calculateTotal()));
        }
    }

    /**
     * This method is used to initialise all listeners of this panel
     */
    private void initListeners() {
        this.basketPanel.addPanelObserver(this);
        
        // The chair form observers
        this.chairPanel.addObserver(this);
        this.chairPanel.addObserver(this.basketPanel);
        
        // The desk form observers
        this.deskPanel.addObserver(this);
        this.deskPanel.addObserver(this.basketPanel);
        
        // The table form observers
        this.tablePanel.addObserver(this);
        this.tablePanel.addObserver(this.basketPanel);
    }

    /**
     * This method is used to create a JOptionPane displaying a furniture items details
     * @param index 
     */
    @Override
    public void showItemDetails(int index) {
        JPanel panel = new JPanel(new BorderLayout(30, 0));
        JLabel image = new JLabel(new ImageIcon(basket.getItem(index).getImagePath()));

        panel.add(image, BorderLayout.WEST);
        String itemDetails = "<html>" + basket.getItem(index).toString().replaceAll("\n", "<br>")
                + "</html>";
        JLabel text = new JLabel(itemDetails);
        panel.add(text, BorderLayout.EAST);
        JOptionPane.showMessageDialog(this.getRootPane(), panel, "Information", JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * This method is used to remove an item from the basket and calls the 
     * relevant listeners and updates.
     * @param index 
     */
    @Override
    public void removeItem(int index) {
        int result = JOptionPane.showConfirmDialog(this.getRootPane(),
                "Are you sure you want to remove this item",
                "Warning", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            this.basket.removeFromBasket(index);
            this.basketPanel.clearButtons();
            for(int i=0; i<this.basket.getSize();i++){
                this.basketPanel.updateBasket(this.basket.getItem(i));
            }
            DecimalFormat df = new DecimalFormat(".00");
            String items = "<html>";
            for (int i = 0; i < basket.getSize(); i++) {
                items += basket.getItem(i).getClass().getSimpleName();
                items += " ??" + basket.getItem(i).getItemPrice() + "<br>";
            }
            items += "</html>";
            for (CentrePanelObserver observer : observers) {
                observer.CentrePanelUpdateItems(items);
                observer.CentrePanelUpdateTotal(df.format(basket.calculateTotal()));
            }
        }
    }

    /**
     * This method is used to display the relevant form and set the prefilled details
     * @param index 
     */
    @Override
    public void editItem(int index) {
        CardLayout layout = (CardLayout) this.getLayout();
        layout.show(this, this.basket.getItem(index).getClass().getSimpleName());
        switch (this.basket.getItem(index).getClass().getSimpleName()){
            case "Chair":
                this.chairPanel.setFill((Chair) this.basket.getItem(index));
                for (CentrePanelObserver observer:observers){
                    observer.centrePanelClear();
                }
                break;
            case "Desk":
                this.deskPanel.setFill((Desk) this.basket.getItem(index));
                for (CentrePanelObserver observer:observers){
                    observer.centrePanelClear();
                }
                break;
                
            case "Table":
                this.tablePanel.setFill((Table) this.basket.getItem(index));
                for (CentrePanelObserver observer:observers){
                    observer.centrePanelClear();
                }
                break;
        }
    }

    /**
     * This method is used to add items to the basket.
     * @param item 
     */
    @Override
    public void updateBasket(Furniture item) {
        if(this.basket.getSize() < 9){
            this.basket.addToBasket(item);           
        }else{
            JOptionPane.showMessageDialog(this.getRootPane(),
                    "<html> Your basket is now full <br> please remove items to continue or check out. </html>",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }

    }
    
}
