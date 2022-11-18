/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Interfaces.LeftPanelObserver;
import CoreApplication.Basket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Richard North a0313108
 */
public class LeftButtonPanel extends javax.swing.JPanel {
    private Basket basket;
    private List<LeftPanelObserver> observers = new ArrayList<>();
    /**
     * Creates new LeftButtonPanel
     */
    public LeftButtonPanel() {
        initComponents();
    }
    
    /**
     * Adds a observer to the collection to be notified
     * @param co 
     */
    public void addPanelObserver(LeftPanelObserver observer) {
        observers.add(observer);
    }
    
    /**
     * calls the update method within all observers
     */
    public void updateObservers(String panel) {
        for (LeftPanelObserver observer : observers) {
            observer.updatePanel(panel);
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
        java.awt.GridBagConstraints gridBagConstraints;

        addChairButton = new javax.swing.JButton();
        addTableButton = new javax.swing.JButton();
        addDeskButton = new javax.swing.JButton();
        showBasketButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(150, 150));
        setPreferredSize(new java.awt.Dimension(150, 150));
        setLayout(new java.awt.GridBagLayout());

        addChairButton.setBackground(new java.awt.Color(53, 127, 198));
        addChairButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addChairButton.setForeground(new java.awt.Color(0, 0, 0));
        addChairButton.setText("Add chair");
        addChairButton.setToolTipText("Click to be redirected to the chair form");
        addChairButton.setMaximumSize(new java.awt.Dimension(120, 25));
        addChairButton.setMinimumSize(new java.awt.Dimension(120, 25));
        addChairButton.setName(""); // NOI18N
        addChairButton.setPreferredSize(new java.awt.Dimension(120, 25));
        addChairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChairButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 6, 12);
        add(addChairButton, gridBagConstraints);

        addTableButton.setBackground(new java.awt.Color(53, 127, 198));
        addTableButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addTableButton.setForeground(new java.awt.Color(0, 0, 0));
        addTableButton.setText("Add table");
        addTableButton.setToolTipText("Click to be redirected to the table form");
        addTableButton.setMaximumSize(new java.awt.Dimension(96, 22));
        addTableButton.setMinimumSize(new java.awt.Dimension(120, 25));
        addTableButton.setPreferredSize(new java.awt.Dimension(120, 25));
        addTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTableButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 6, 12);
        add(addTableButton, gridBagConstraints);

        addDeskButton.setBackground(new java.awt.Color(53, 127, 198));
        addDeskButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addDeskButton.setForeground(new java.awt.Color(0, 0, 0));
        addDeskButton.setText("Add desk");
        addDeskButton.setToolTipText("Click to be redirected to the desk form");
        addDeskButton.setMaximumSize(new java.awt.Dimension(96, 22));
        addDeskButton.setMinimumSize(new java.awt.Dimension(120, 25));
        addDeskButton.setPreferredSize(new java.awt.Dimension(120, 25));
        addDeskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeskButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 6, 12);
        add(addDeskButton, gridBagConstraints);

        showBasketButton.setBackground(new java.awt.Color(53, 127, 198));
        showBasketButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showBasketButton.setForeground(new java.awt.Color(0, 0, 0));
        showBasketButton.setText("Show basket");
        showBasketButton.setToolTipText("Click to be redirected to the basket");
        showBasketButton.setMinimumSize(new java.awt.Dimension(120, 25));
        showBasketButton.setPreferredSize(new java.awt.Dimension(120, 25));
        showBasketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBasketButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 6, 12);
        add(showBasketButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void addChairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addChairButtonActionPerformed
        updateObservers("Chair");
    }//GEN-LAST:event_addChairButtonActionPerformed

    private void addTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTableButtonActionPerformed
        updateObservers("Table");
    }//GEN-LAST:event_addTableButtonActionPerformed

    private void addDeskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDeskButtonActionPerformed
        updateObservers("Desk");
    }//GEN-LAST:event_addDeskButtonActionPerformed

    private void showBasketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBasketButtonActionPerformed
        updateObservers("Basket");
    }//GEN-LAST:event_showBasketButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addChairButton;
    private javax.swing.JButton addDeskButton;
    private javax.swing.JButton addTableButton;
    private javax.swing.JButton showBasketButton;
    // End of variables declaration//GEN-END:variables
}
