/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Interfaces.FormObserver;
import CoreApplication.Desk;
import CoreApplication.Furniture;
import CoreApplication.NoDeskDraws;
import CoreApplication.WoodType;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Richard North a0313108
 */
public class DeskForm extends javax.swing.JPanel {

    private List<FormObserver> observers = new ArrayList<>();
    private Desk desk;
    /**
     * Creates new form ChairForm
     */
    public DeskForm() {
        initComponents();
        clearFill();
    }

    /**
     * Adds a observer to the collection to be notified
     * @param observer 
     */
    public void addObserver(FormObserver observer) {
        observers.add(observer);
    }
    
    /**
     * calls the update method within all observers
     */
    public void updateObservers(Furniture item) {
        for (FormObserver observer : observers) {
            observer.updateBasket(item);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deskImageLabel = new javax.swing.JLabel( new ImageIcon("images/desk.jpg"));
        idNumberLabel = new javax.swing.JLabel();
        typeOfWoodLabel = new javax.swing.JLabel();
        numberOfDrawsLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        deskHeigthLabel = new javax.swing.JLabel();
        deskWidthLabel = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        idNumberTextField = new javax.swing.JTextField();
        deskWidthTextField = new javax.swing.JTextField();
        deskDepthTextField = new javax.swing.JTextField();
        numberOfDrawsCombo = new javax.swing.JComboBox<>();
        addItemButton = new javax.swing.JButton();
        typeOfWoodCombo = new javax.swing.JComboBox<>();
        itemDescription = new javax.swing.JLabel();
        itemType = new javax.swing.JLabel();

        setBackground(new java.awt.Color(155, 217, 215));

        idNumberLabel.setForeground(new java.awt.Color(0, 0, 0));
        idNumberLabel.setText("ID Number");

        typeOfWoodLabel.setForeground(new java.awt.Color(0, 0, 0));
        typeOfWoodLabel.setText("Type of wood");

        numberOfDrawsLabel.setForeground(new java.awt.Color(0, 0, 0));
        numberOfDrawsLabel.setText("Number of draws");

        quantityLabel.setForeground(new java.awt.Color(0, 0, 0));
        quantityLabel.setText("Quantity");

        deskHeigthLabel.setForeground(new java.awt.Color(0, 0, 0));
        deskHeigthLabel.setText("Desk height");

        deskWidthLabel.setForeground(new java.awt.Color(0, 0, 0));
        deskWidthLabel.setText("Desk width");

        quantityTextField.setBackground(new java.awt.Color(255, 255, 255));
        quantityTextField.setForeground(new java.awt.Color(0, 0, 0));
        quantityTextField.setToolTipText("Enter the quantity needed");

        idNumberTextField.setBackground(new java.awt.Color(255, 255, 255));
        idNumberTextField.setForeground(new java.awt.Color(0, 0, 0));
        idNumberTextField.setToolTipText("Enter the item's ID number");

        deskWidthTextField.setBackground(new java.awt.Color(255, 255, 255));
        deskWidthTextField.setForeground(new java.awt.Color(0, 0, 0));
        deskWidthTextField.setToolTipText("Enter the desired width in CM");

        deskDepthTextField.setBackground(new java.awt.Color(255, 255, 255));
        deskDepthTextField.setForeground(new java.awt.Color(0, 0, 0));
        deskDepthTextField.setToolTipText("Enter the desired depth in CM");

        numberOfDrawsCombo.setBackground(new java.awt.Color(255, 255, 255));
        numberOfDrawsCombo.setForeground(new java.awt.Color(0, 0, 0));
        numberOfDrawsCombo.setModel(new DefaultComboBoxModel<>(NoDeskDraws.values()));
        numberOfDrawsCombo.setToolTipText("Select the number of draws required");

        addItemButton.setBackground(new java.awt.Color(53, 127, 198));
        addItemButton.setForeground(new java.awt.Color(0, 0, 0));
        addItemButton.setText("Add item");
        addItemButton.setToolTipText("Click to add item to basket");
        addItemButton.setMaximumSize(new java.awt.Dimension(80, 25));
        addItemButton.setMinimumSize(new java.awt.Dimension(80, 25));
        addItemButton.setPreferredSize(new java.awt.Dimension(80, 25));
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        typeOfWoodCombo.setBackground(new java.awt.Color(255, 255, 255));
        typeOfWoodCombo.setForeground(new java.awt.Color(0, 0, 0));
        typeOfWoodCombo.setModel(new DefaultComboBoxModel<>(WoodType.values()));
        typeOfWoodCombo.setToolTipText("Select the type of wood required");

        itemDescription.setForeground(new java.awt.Color(0, 0, 0));
        itemDescription.setText("<html>Modern and practical this desk comes with <br>customisable options including oak or walnut <br>wood as well as the option to have multiple <br>drawer’s (max number 4). Other options include <br>specific customised width and depth of desk.</html>");
        itemDescription.setToolTipText("");

        itemType.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        itemType.setForeground(new java.awt.Color(0, 0, 0));
        itemType.setText("Desk");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numberOfDrawsLabel)
                            .addComponent(typeOfWoodLabel)
                            .addComponent(idNumberLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numberOfDrawsCombo, 0, 100, Short.MAX_VALUE)
                            .addComponent(idNumberTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(typeOfWoodCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deskImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(deskWidthLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(deskHeigthLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(quantityLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deskDepthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deskWidthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(itemType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deskImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(itemType, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idNumberLabel)
                    .addComponent(deskWidthLabel)
                    .addComponent(deskWidthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeOfWoodLabel)
                    .addComponent(deskHeigthLabel)
                    .addComponent(deskDepthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeOfWoodCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfDrawsLabel)
                    .addComponent(numberOfDrawsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel)
                    .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        try{
            
            if(this.desk != null){
                this.desk.setIdNumber(Integer.parseInt(idNumberTextField.getText()));
                this.desk.setDepth(Integer.parseInt(deskDepthTextField.getText()));
                this.desk.setWidth(Integer.parseInt(deskWidthTextField.getText()));
                this.desk.setQuantity(Integer.parseInt(quantityTextField.getText()));
                this.desk.setNoDraws((NoDeskDraws) numberOfDrawsCombo.getSelectedItem());
                this.desk.setTypeOfWood((WoodType)typeOfWoodCombo.getSelectedItem());
                this.desk.setItemPrice(this.desk.calculatePrice());

            }else{
                this.updateObservers(new Desk(
                    Integer.parseInt(deskWidthTextField.getText()),
                    Integer.parseInt(deskDepthTextField.getText()),
                    (NoDeskDraws)numberOfDrawsCombo.getSelectedItem(),
                    Integer.parseInt(idNumberTextField.getText()),
                    (WoodType)typeOfWoodCombo.getSelectedItem(), 
                    Integer.parseInt(quantityTextField.getText())));    
            }
            clearFill();
        }catch(Exception e){        
            JOptionPane.showMessageDialog(this,"Fields incorrectly filled","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addItemButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JTextField deskDepthTextField;
    private javax.swing.JLabel deskHeigthLabel;
    private javax.swing.JLabel deskImageLabel;
    private javax.swing.JLabel deskWidthLabel;
    private javax.swing.JTextField deskWidthTextField;
    private javax.swing.JLabel idNumberLabel;
    private javax.swing.JTextField idNumberTextField;
    private javax.swing.JLabel itemDescription;
    private javax.swing.JLabel itemType;
    private javax.swing.JComboBox<NoDeskDraws> numberOfDrawsCombo;
    private javax.swing.JLabel numberOfDrawsLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JComboBox<WoodType> typeOfWoodCombo;
    private javax.swing.JLabel typeOfWoodLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * This method is used to clear all data from the input fields.
     */
    public void clearFill(){
        this.desk = null;
        this.numberOfDrawsCombo.setSelectedItem(null);
        this.typeOfWoodCombo.setSelectedItem(null);
        this.idNumberTextField.setText(null);
        this.quantityTextField.setText(null);
        this.deskWidthTextField.setText(null);
        this.deskDepthTextField.setText(null);
        this.addItemButton.setText("Add item");
    }
    
    /**
     * This method is used to prefill the input fields based of a desk item
     * @param item 
     */
    public void setFill(Desk item) {
        this.desk = item;
        this.deskDepthTextField.setText(String.valueOf(item.getDepth()));
        this.deskWidthTextField.setText(String.valueOf(item.getWidth()));
        this.idNumberTextField.setText(String.valueOf(item.getIdNumber()));
        this.quantityTextField.setText(String.valueOf(item.getQuantity()));
        this.typeOfWoodCombo.setSelectedItem(item.getTypeOfWood());
        this.numberOfDrawsCombo.setSelectedItem(item.getNoDraws());
        this.addItemButton.setText("Edit item");
    }
}