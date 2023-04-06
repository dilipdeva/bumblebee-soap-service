/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DBConnection.DBConnection;
import Models.Orders;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dilip
 */
public class OrderController {
 
    public boolean customerOrder(Orders order){
        
        Connection connection = DBConnection.getConnection();
        
        try{
         
            Statement stam = connection.createStatement();
            int rows = stam.executeUpdate((" INSERT INTO `order`(`id`,"
              + " `name`, `birthday`, `email`, `loan`, `plan`, `number`, `price`) VALUES ('"+order.getOrder_id()+"','"
            +order.getOrder_name()+"','"+order.getOrder_birthday()+"','"+order.getOrder_email()+"','"+order.getOrder_loan()+"','"+order.getOrder_plan()+"','"+order.getOrder_number()+"','"+order.getOrder_price()+"')"));
            
           return rows>0;
            
        }catch(Exception ex){
            System.out.println("ERROR"+" "+ex);
        }
         
        return false;
    }
    
    public boolean orderUpdate(Orders order) {
        
         Connection connection = DBConnection.getConnection(); 
         try {   
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("UPDATE `order` SET  `name` = '"
                    + order.getOrder_name() +  "', `birthday` = '" + order.getOrder_birthday() +"', `email` = '" + order.getOrder_email() + "', `loan` = '" + order.getOrder_loan() + "', `plan` = '" + order.getOrder_plan() + "', `number` = '" + order.getOrder_number() + "', `price` = '" + order.getOrder_price() + "' WHERE (`id` = '"  + order.getOrder_id() + "')");
            
            return rows > 0;
            
        } catch (Exception ex){
            System.out.println("ERROR"+" "+ex);
        }  
        return false;
     }
    
    public boolean deleteOrder(String id){
    Connection connection = DBConnection.getConnection(); 
     
        try{
          Statement stmt=connection.createStatement();
           
          int rows=stmt.executeUpdate(" DELETE FROM `order` WHERE "
           + "(`id`='"+id+"');");
      		
	    return rows>0;
	
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
