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
public class FurnitureTest {
    
    public FurnitureTest() {
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
     * Test of getIdNumber method, of class Furniture.
     */
    @Test
    public void testGetIdNumber() {
        System.out.println("getIdNumber");
        Furniture instance = new FurnitureImpl(1, WoodType.OAK, 100, 1);
        int expResult = 1;
        int result = instance.getIdNumber();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTypeOfWood method, of class Furniture.
     */
    @Test
    public void testGetTypeOfWood() {
        System.out.println("getTypeOfWood");
        Furniture instance = new FurnitureImpl(1, WoodType.OAK, 100, 1);
        WoodType expResult =  WoodType.OAK;
        WoodType result = instance.getTypeOfWood();
        assertEquals(expResult, result);

    }

    /**
     * Test of getItemPrice method, of class Furniture.
     */
    @Test
    public void testGetItemPrice() {
        System.out.println("getItemPrice");
        Furniture instance = new FurnitureImpl(1, WoodType.OAK, 100, 1);
        double expResult = 100;
        double result = instance.getItemPrice();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getQuantity method, of class Furniture.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Furniture instance = new FurnitureImpl(1, WoodType.OAK, 100, 1);
        int expResult = 1;
        int result = instance.getQuantity();
        assertEquals(expResult, result);

    }

    /**
     * Test of getImagePath method, of class Furniture.
     */
    @Test
    public void testGetImagePath() {
        System.out.println("getImagePath");
        Furniture instance = new FurnitureImpl(1, WoodType.OAK, 100, 1);
        String expResult = "FurnitureImpl.png";
        String result = instance.getImagePath();
        assertEquals(expResult, result);

    }

    /**
     * Test of setIdNumber method, of class Furniture.
     */
    @Test
    public void testSetIdNumber() {
        System.out.println("setIdNumber");
        int idNumber = 2;
        Furniture instance = new FurnitureImpl(1, WoodType.OAK, 100, 1);
        instance.setIdNumber(idNumber);
        int expResult = 2;
        int result = instance.getIdNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTypeOfWood method, of class Furniture.
     */
    @Test
    public void testSetTypeOfWood() {
        System.out.println("setTypeOfWood");
        WoodType typeOfWood = WoodType.WALNUT;
        Furniture instance = new FurnitureImpl(1, WoodType.OAK, 100, 1);
        instance.setTypeOfWood(typeOfWood);
        WoodType expResult =  WoodType.WALNUT;
        WoodType result = instance.getTypeOfWood();
        assertEquals(expResult, result);
    }

    /**
     * Test of setItemPrice method, of class Furniture.
     */
    @Test
    public void testSetItemPrice() {
        System.out.println("setItemPrice");
        double itemPrice = 50;
        Furniture instance = new FurnitureImpl(1, WoodType.OAK, 100, 1);
        instance.setItemPrice(itemPrice);
        double expResult = 50;
        double result = instance.getItemPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantity method, of class Furniture.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 2;
        Furniture instance = new FurnitureImpl(1, WoodType.OAK, 100, 1);
        instance.setQuantity(quantity);
        int expResult = 2;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    public class FurnitureImpl extends Furniture {

        public FurnitureImpl(int idNumber, WoodType woodType, double itemPrice, int quantity) {
            super(idNumber, woodType, itemPrice, quantity, "FurnitureImpl.png");
        }

        public int calculateNoUnits() {
            return 0;
        }

        public double calculatePrice() {
            return 0.0;
        }
    }
    
}
