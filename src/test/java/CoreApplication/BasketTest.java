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
public class BasketTest {
    
    public BasketTest() {
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
     * Test of addToBasket method, of class Basket.
     */
    @Test
    public void testAddToBasket() {
        System.out.println("addToBasket");
        Furniture item = new Chair(ArmrestsNeeded.NO, 1, WoodType.OAK, 1);
        Basket instance = new Basket();
        instance.addToBasket(item);
        assertEquals(instance.getItem(0), item);
    }

    /**
     * Test of removeFromBasket method, of class Basket.
     */
    @Test
    public void testRemoveFromBasket() {
        System.out.println("removeFromBasket");
        Furniture item = new Chair(ArmrestsNeeded.NO, 1, WoodType.OAK, 1);
        int index = 0;
        Basket instance = new Basket();
        instance.addToBasket(item);
        instance.removeFromBasket(index);
            IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            instance.getItem(0);
        });
        assertEquals("Index 0 out of bounds for length 0", exception.getMessage());
        
    }

    /**
     * Test of emptyBasket method, of class Basket.
     */
    @Test
    public void testEmptyBasket() {
        System.out.println("emptyBasket");
        Basket instance = new Basket();
        Furniture item1 = new Chair(ArmrestsNeeded.NO, 1, WoodType.OAK, 1);
        Furniture item2 = new Chair(ArmrestsNeeded.NO, 1, WoodType.OAK, 1);
        instance.addToBasket(item1);
        instance.addToBasket(item2);
        instance.emptyBasket();
        assertEquals(instance.getSize(), 0);
    }

    /**
     * Test of getItem method, of class Basket.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        int index = 0;
        Furniture item1 = new Chair(ArmrestsNeeded.NO, 1, WoodType.OAK, 1);
        Basket instance = new Basket();
        instance.addToBasket(item1);
        Furniture expResult = item1;
        Furniture result = instance.getItem(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSize method, of class Basket.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Basket instance = new Basket();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        
        
        Furniture item1 = new Chair(ArmrestsNeeded.NO, 1, WoodType.OAK, 1);
        instance.addToBasket(item1);
        expResult = 1;
        result = instance.getSize();
        assertEquals(expResult, result);
        
    }


    /**
     * Test of calculateTotal method, of class Basket.
     */
    @Test
    public void testCalculateTotal() {
        System.out.println("calculateTotal");
        
        Furniture item1 = new Chair(ArmrestsNeeded.NO, 1, WoodType.OAK, 1);
        Furniture item2 = new Chair(ArmrestsNeeded.NO, 1, WoodType.OAK, 1);
        Basket instance = new Basket();
        
        instance.addToBasket(item1);
        instance.addToBasket(item2);
        double expResult = 130.0;
        double result = instance.calculateTotal();
        assertEquals(expResult, result, 0.0);
        
    }

}
