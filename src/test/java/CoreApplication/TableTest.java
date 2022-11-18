/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package CoreApplication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Richard North a0313108
 */
public class TableTest {
    
    public TableTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getDiameter method, of class Table.
     */
    @Test
    public void testGetDiameter() {
        System.out.println("getDiameter");
        Table instance = new Table(50, BaseType.CHROME, 1, WoodType.OAK, 1);
        int expResult = 50;
        int result = instance.getDiameter();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDiameter method, of class Table.
     */
    @Test
    public void testSetDiameter() {
        System.out.println("setDiameter");
        int diameter = 100;
        Table instance = new Table(50, BaseType.CHROME, 1, WoodType.OAK, 1);
        instance.setDiameter(diameter);
        int expResult = 100;
        int result = instance.getDiameter();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBaseType method, of class Table.
     */
    @Test
    public void testGetBaseType() {
        System.out.println("getBaseType");
        Table instance = new Table(50, BaseType.CHROME, 1, WoodType.OAK, 1);
        BaseType expResult = BaseType.CHROME;
        BaseType result = instance.getBaseType();
        assertEquals(expResult, result);

    }

    /**
     * Test of setBaseType method, of class Table.
     */
    @Test
    public void testSetBaseType() {
        System.out.println("setBaseType");
        BaseType baseType = BaseType.WOODEN;
        Table instance = new Table(50, BaseType.CHROME, 1, WoodType.OAK, 1);
        instance.setBaseType(baseType);
        BaseType expResult = BaseType.WOODEN;
        BaseType result = instance.getBaseType();
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateNoUnits method, of class Table.
     */
    @Test
    public void testCalculateNoUnits() {
        System.out.println("calculateNoUnits");
        Table instance = new Table(50, BaseType.CHROME, 1, WoodType.OAK, 1);
        int expResult = 2500;
        int result = instance.calculateNoUnits();
        assertEquals(expResult, result);

    }

    /**
     * Test of calculatePrice method, of class Table.
     */
    @Test
    public void testCalculatePrice() {
        System.out.println("calculatePrice");
        Table instance = new Table(50, BaseType.CHROME, 1, WoodType.OAK, 1);
        double expResult = 135.0;
        double result = instance.calculatePrice();
        assertEquals(expResult, result, 0.0);

    }
    
}
