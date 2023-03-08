/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dilip
 */
public class Orders {
    private String Order_id;
    private String Order_name;
    private String Order_birthday;
    private String Order_email;
    private String Order_loan;
    private String Order_plan;
    private String Order_number;
    private String Order_price;

    public Orders(String Order_id, String Order_name, String Order_birthday, String Order_email, String Order_loan, String Order_plan, String Order_number, String Order_price) {
        this.Order_id = Order_id;
        this.Order_name = Order_name;
        this.Order_birthday = Order_birthday;
        this.Order_email = Order_email;
        this.Order_loan = Order_loan;
        this.Order_plan = Order_plan;
        this.Order_number = Order_number;
        this.Order_price = Order_price;
    }

    public Orders() {
    }

    
    
    public String getOrder_id() {
        return Order_id;
    }

    public void setOrder_id(String Order_id) {
        this.Order_id = Order_id;
    }

    public String getOrder_name() {
        return Order_name;
    }

    public void setOrder_name(String Order_name) {
        this.Order_name = Order_name;
    }

    public String getOrder_birthday() {
        return Order_birthday;
    }

    public void setOrder_birthday(String Order_birthday) {
        this.Order_birthday = Order_birthday;
    }

    public String getOrder_email() {
        return Order_email;
    }

    public void setOrder_email(String Order_email) {
        this.Order_email = Order_email;
    }

    public String getOrder_loan() {
        return Order_loan;
    }

    public void setOrder_loan(String Order_loan) {
        this.Order_loan = Order_loan;
    }

    public String getOrder_plan() {
        return Order_plan;
    }

    public void setOrder_plan(String Order_plan) {
        this.Order_plan = Order_plan;
    }

    public String getOrder_number() {
        return Order_number;
    }

    public void setOrder_number(String Order_number) {
        this.Order_number = Order_number;
    }

    public String getOrder_price() {
        return Order_price;
    }

    public void setOrder_price(String Order_price) {
        this.Order_price = Order_price;
    }
    
    
}
