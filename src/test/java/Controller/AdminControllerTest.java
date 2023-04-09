/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controller;

import Models.Admin;
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
public class AdminControllerTest {
    
    public AdminControllerTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of Login method, of class AdminController.
     */
    @org.junit.Test
    public void testLogin() {
        System.out.println("Login");
        String id = "admin1";
        String password = "1234";
        AdminController instance = new AdminController();
        Admin expResult = new Admin("admin1","1234");
        Admin result = instance.Login(id, password);
        assertEquals(expResult.getAdmin_id(), result.getAdmin_id());
        assertEquals(expResult.getPassword(), result.getPassword());
    }
    
}
