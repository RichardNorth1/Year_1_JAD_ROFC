/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Richard North a0313108
 */
public interface BottomPanelObserver {
    public void summary();
    public void clear();
    public void save(String fileName);
    public void load(String fileName);
}
