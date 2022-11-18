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
public class ChairTest {
    
    public ChairTest() {
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
     * Test of getArmrests method, of class Chair.
     */
    @Test
    public void testGetArmrests() {
        System.out.println("getArmrests");
        Chair instance = new Chair(ArmrestsNeeded.NO, 1, WoodType.OAK, 1);;
        ArmrestsNeeded expResult = ArmrestsNeeded.NO;
        ArmrestsNeeded result = instance.getArmrests();
        assertEquals(expResult, result);

    }

    /**
     * Test of setArmrests method, of class Chair.
     */
    @Test
    public void testSetArmrests() {
        System.out.println("setArmrests");
        ArmrestsNeeded armrests = ArmrestsNeeded.YES;
        Chair instance = new Chair(ArmrestsNeeded.NO, 1, WoodType.OAK, 1);
        instance.setArmrests(armrests);
        ArmrestsNeeded expResult = ArmrestsNeeded.YES;
        ArmrestsNeeded result = instance.getArmrests();
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateNoUnits method, of class Chair.
     */
    @Test
    public void testCalculateNoUnits() {
        System.out.println("calculateNoUnits");
        Chair instance = new Chair(ArmrestsNeeded.NO, 1, WoodType.OAK, 1);
        int expResult = 1625;
        int result = instance.calculateNoUnits();
        assertEquals(expResult, result);
    }

    /**
     * Test of calculatePrice method, of class Chair.
     */
    @Test
    public void testCalculatePrice() {
        System.out.println("calculatePrice");
        Chair instance = new Chair(ArmrestsNeeded.NO, 1, WoodType.OAK, 1);
        double expResult = 65.0;
        double result = instance.calculatePrice();
        assertEquals(expResult, result, 0.0);

    }

   
}
