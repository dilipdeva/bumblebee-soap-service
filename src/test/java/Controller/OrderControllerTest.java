/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controller;

import Models.Orders;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dilip
 */
public class OrderControllerTest {
    
    public OrderControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of customerOrder method, of class OrderController.
     */
    @Test
    public void testCustomerOrder() {
        System.out.println("customerOrder");
        OrderController instance = new OrderController();
        Orders order = new Orders("999","test1","test1","test1","test1","test1","test1","test1");
        boolean expResult = true;
        boolean result = instance.customerOrder(order);
        
        assertEquals(expResult, result);
        
        Orders resultCustomers = new Orders("999","test1","test1","test1","test1","test1","test1","test1");
        assertEquals(order.getOrder_id(), resultCustomers.getOrder_id());
        assertEquals(order.getOrder_name(), resultCustomers.getOrder_name());
        assertEquals(order.getOrder_birthday(), resultCustomers.getOrder_birthday());
        assertEquals(order.getOrder_email(), resultCustomers.getOrder_email());
        assertEquals(order.getOrder_loan(), resultCustomers.getOrder_loan());
        assertEquals(order.getOrder_plan(), resultCustomers.getOrder_plan());
        assertEquals(order.getOrder_number(), resultCustomers.getOrder_number()); 
        assertEquals(order.getOrder_price(), resultCustomers.getOrder_price()); 
    }

    /**
     * Test of orderUpdate method, of class OrderController.
     */
    /*@Test
    public void testOrderUpdate() {
        System.out.println("orderUpdate");
        OrderController instance = new OrderController();
        Orders order = new Orders("test1","test1","test1","test1","test1","test1","test1","test1");
        boolean expResult = true;
        boolean result = instance.orderUpdate(order);
        
        assertEquals(expResult, result);
        
        Orders resultCustomers = new Orders("test1","test1","test1","test1","test1","test1","test1","test1");
        assertEquals(order.getOrder_id(), resultCustomers.getOrder_id());
        assertEquals(order.getOrder_name(), resultCustomers.getOrder_name());
        assertEquals(order.getOrder_birthday(), resultCustomers.getOrder_birthday());
        assertEquals(order.getOrder_email(), resultCustomers.getOrder_email());
        assertEquals(order.getOrder_loan(), resultCustomers.getOrder_loan());
        assertEquals(order.getOrder_plan(), resultCustomers.getOrder_plan());
        assertEquals(order.getOrder_number(), resultCustomers.getOrder_number()); 
        assertEquals(order.getOrder_price(), resultCustomers.getOrder_price()); 
    }

    /**
     * Test of deleteOrder method, of class OrderController.
     */
    @Test
    public void testDeleteOrder() {
        System.out.println("deleteOrder");
        OrderController instance = new OrderController();
        String id = "999";
        Orders order = new Orders("999","test1","test1","test1","test1","test1","test1","test1");
        boolean expResult = true;
        boolean result = instance.deleteOrder(id);
        
        assertEquals(expResult, result);
        
        Orders resultCustomers = new Orders("999","test1","test1","test1","test1","test1","test1","test1");
        assertEquals(order.getOrder_id(), resultCustomers.getOrder_id());
        assertEquals(order.getOrder_name(), resultCustomers.getOrder_name());
        assertEquals(order.getOrder_birthday(), resultCustomers.getOrder_birthday());
        assertEquals(order.getOrder_email(), resultCustomers.getOrder_email());
        assertEquals(order.getOrder_loan(), resultCustomers.getOrder_loan());
        assertEquals(order.getOrder_plan(), resultCustomers.getOrder_plan());
        assertEquals(order.getOrder_number(), resultCustomers.getOrder_number()); 
        assertEquals(order.getOrder_price(), resultCustomers.getOrder_price()); 
    }
    
}
