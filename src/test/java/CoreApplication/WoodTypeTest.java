/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package CoreApplication;

import static CoreApplication.WoodType.*;
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
public class WoodTypeTest {
    
    public WoodTypeTest() {
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
     * Test of values method, of class WoodType.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        WoodType[] expResult = {OAK,WALNUT};
        WoodType[] result = WoodType.values();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of getPrice method, of class WoodType.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        WoodType instance = WoodType.OAK;
        double expResult = 0.04;
        double result = instance.getPrice();
        assertEquals(expResult, result);

        instance = WoodType.WALNUT;
        expResult = 0.03;
        result = instance.getPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class WoodType.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        WoodType instance = WoodType.OAK;
        String expResult = "OAK";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        instance = WoodType.WALNUT;
        expResult = "WALNUT";
        result = instance.toString();
        assertEquals(expResult, result);
    }

    
}
