/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package CoreApplication;

import static CoreApplication.BaseType.CHROME;
import static CoreApplication.BaseType.WOODEN;
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
public class BaseTypeTest {
    
    public BaseTypeTest() {
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
     * Test of values method, of class BaseType.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        BaseType[] expResult = {WOODEN,CHROME};
        BaseType[] result = BaseType.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getPrice method, of class BaseType.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        BaseType instance = BaseType.WOODEN;
        int expResult = 45;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        
        instance = BaseType.CHROME;
        expResult = 35;
        result = instance.getPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class BaseType.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BaseType instance = BaseType.WOODEN;
        String expResult = "WOODEN";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        System.out.println("toString");
        instance = BaseType.CHROME;
        expResult = "CHROME";
        result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
