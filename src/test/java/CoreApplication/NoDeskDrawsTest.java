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
import static CoreApplication.NoDeskDraws.*;


/**
 *
 * @author Richard North a0313108
 */
public class NoDeskDrawsTest {
    
    public NoDeskDrawsTest() {
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
     * Test of values method, of class NoDeskDraws.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        NoDeskDraws[] expResult = {ZERO,ONE,TWO,THREE,FOUR};
        NoDeskDraws[] result = NoDeskDraws.values();
        assertArrayEquals(expResult, result);

    }


    /**
     * Test of getNoDraws method, of class NoDeskDraws.
     */
    @Test
    public void testGetNoDraws() {
        System.out.println("getNoDraws");
        
        NoDeskDraws instance = NoDeskDraws.FOUR;
        int expResult = 4;
        int result = instance.getNoDraws();
        assertEquals(expResult, result);

        instance = NoDeskDraws.THREE;
        expResult = 3;
        result = instance.getNoDraws();
        assertEquals(expResult, result);
        
        instance = NoDeskDraws.TWO;
        expResult = 2;
        result = instance.getNoDraws();
        assertEquals(expResult, result);
        
        instance = NoDeskDraws.ONE;
        expResult = 1;
        result = instance.getNoDraws();
        assertEquals(expResult, result);
        
        instance = NoDeskDraws.ZERO;
        expResult = 0;
        result = instance.getNoDraws();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class NoDeskDraws.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        NoDeskDraws instance = NoDeskDraws.FOUR;
        String expResult = "four";
        String result = instance.toString();
        assertEquals(expResult, result);

        instance = NoDeskDraws.THREE;
        expResult = "three";
        result = instance.toString();
        assertEquals(expResult, result);
        
        instance = NoDeskDraws.TWO;
        expResult = "two";
        result = instance.toString();
        assertEquals(expResult, result);
        
        instance = NoDeskDraws.ONE;
        expResult = "one";
        result = instance.toString();
        assertEquals(expResult, result);
        
        instance = NoDeskDraws.ZERO;
        expResult = "zero";
        result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
