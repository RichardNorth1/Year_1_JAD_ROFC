/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package CoreApplication;

import static CoreApplication.ArmrestsNeeded.NO;
import static CoreApplication.ArmrestsNeeded.YES;
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
public class ArmrestsNeededTest {
    
    public ArmrestsNeededTest() {
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
     * Test of values method, of class ArmrestsNeeded.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        ArmrestsNeeded[] expResult = {YES,NO};
        ArmrestsNeeded[] result = ArmrestsNeeded.values();
        assertArrayEquals(expResult, result);

    }


    /**
     * Test of getUnits method, of class ArmrestsNeeded.
     */
    @Test
    public void testGetUnits() {
        System.out.println("getUnits");
        ArmrestsNeeded instance = ArmrestsNeeded.NO;
        int expResult = 0;
        int result = instance.getUnits();
        assertEquals(expResult, result);

        instance = ArmrestsNeeded.YES;
        expResult = 250;
        result = instance.getUnits();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class ArmrestsNeeded.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ArmrestsNeeded instance = ArmrestsNeeded.NO;
        String expResult = "NO";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        
        instance = ArmrestsNeeded.YES;
        expResult = "YES";
        result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
