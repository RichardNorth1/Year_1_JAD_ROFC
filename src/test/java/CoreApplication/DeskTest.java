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
public class DeskTest {
    
    public DeskTest() {
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
     * Test of getWidth method, of class Desk.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Desk instance = new Desk(50, 50, NoDeskDraws.ONE, 1, WoodType.OAK, 1);
        int expResult = 50;
        int result = instance.getWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWidth method, of class Desk.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        Desk instance = new Desk(50, 50, NoDeskDraws.ONE, 1, WoodType.OAK, 1);
        int width = 100;
        instance.setWidth(width);
        int expResult = 100;
        int result = instance.getWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepth method, of class Desk.
     */
    @Test
    public void testGetDepth() {
        System.out.println("getDepth");
        Desk instance = new Desk(50, 50, NoDeskDraws.ONE, 1, WoodType.OAK, 1);
        int expResult = 50;
        int result = instance.getDepth();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDepth method, of class Desk.
     */
    @Test
    public void testSetDepth() {
        System.out.println("setDepth");
        Desk instance = new Desk(50, 50, NoDeskDraws.ONE, 1, WoodType.OAK, 1);
        int depth = 100;
        instance.setDepth(depth);
        int result = instance.getDepth();
        assertEquals(depth, result);
    }

    /**
     * Test of getNoDraws method, of class Desk.
     */
    @Test
    public void testGetNoDraws() {
        System.out.println("getNoDraws");
        Desk instance = new Desk(50, 50, NoDeskDraws.ONE, 1, WoodType.OAK, 1);
        NoDeskDraws expResult = NoDeskDraws.ONE;
        NoDeskDraws result = instance.getNoDraws();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNoDraws method, of class Desk.
     */
    @Test
    public void testSetNoDraws() {
        System.out.println("setNoDraws");
        Desk instance = new Desk(50, 50, NoDeskDraws.ONE, 1, WoodType.OAK, 1);
        NoDeskDraws noDraws = NoDeskDraws.TWO;
        instance.setNoDraws(noDraws);
        NoDeskDraws result = instance.getNoDraws();
        assertEquals(noDraws, result);
    }

    /**
     * Test of calculateNoUnits method, of class Desk.
     */
    @Test
    public void testCalculateNoUnits() {
        System.out.println("calculateNoUnits");
        Desk instance = new Desk(50, 50, NoDeskDraws.ONE, 1, WoodType.OAK, 1);
        int expResult = 4660;
        int result = instance.calculateNoUnits();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calculatePrice method, of class Desk.
     */
    @Test
    public void testCalculatePrice() {
        System.out.println("calculatePrice");
        Desk instance = new Desk(50, 50, NoDeskDraws.ONE, 1, WoodType.OAK, 1);
        double expResult = 194.90;
        double result = instance.calculatePrice();
        assertEquals(expResult, result);
        
    }

}
