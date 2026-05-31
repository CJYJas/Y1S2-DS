/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Product{
    private String PID;
    private String SID;
    private double price;
    private int quantity;
    
    public Product(String PID, String SID, double price, int quantity){
        this.PID = PID;
        this.SID = SID;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getPID(){
        return this.PID;
    }
    
    public String getSID(){
        return this.SID;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public double getQuantity(){
        return this.quantity;
    }
}
