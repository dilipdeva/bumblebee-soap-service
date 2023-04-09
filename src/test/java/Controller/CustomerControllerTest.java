/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controller;

import Models.Customers;
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
public class CustomerControllerTest {
    
    public CustomerControllerTest() {
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
     * Test of customerRegister method, of class CustomerController.
     */
    @Test
    public void testCustomerRegister() {
        System.out.println("customerRegister");
        CustomerController instance = new CustomerController();
        Customers customer = new Customers("test1","test","test@gmail.com","test1");
        boolean expResult = true;
        boolean result = instance.customerRegister(customer);
        
        assertEquals(expResult, result);
        
        Customers resultCustomers = new Customers("test1","test","test@gmail.com","test1");
        assertEquals(customer.getCustomer_id(), resultCustomers.getCustomer_id());
        assertEquals(customer.getCustomer_name(), resultCustomers.getCustomer_name());
        assertEquals(customer.getCustomer_email(), resultCustomers.getCustomer_email());
        assertEquals(customer.getPassword(), resultCustomers.getPassword());  
    }

    /**
     * Test of Login method, of class CustomerController.
     */
    @Test
    public void testLogin() {
        System.out.println("Login");
        String id = "12";
        String password = "1234";
        CustomerController instance = new CustomerController();
        Customers expResult = new Customers("12","dilip","dilip@gmail.com","1234");
        Customers result = instance.Login(id, password);
        assertEquals(expResult.getCustomer_id(), result.getCustomer_id());
        assertEquals(expResult.getPassword(), result.getPassword());
    }
    
}
