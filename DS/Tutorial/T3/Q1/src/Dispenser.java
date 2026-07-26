/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Dispenser {
    private String productName;
    private int productCost;
    private int numberOfItems;

    public Dispenser(String productName, int productCost, int numberOfItems){
        this.productName =  productName;
        this.productCost = productCost;
        this.numberOfItems = numberOfItems;
    }

    public String getProductName(){
        return productName;
    }

    public int getProductCost(){
        return productCost;
    }

    public int getNumberOfItems(){
        return numberOfItems;
    }

    public void makeSale(){
        if(numberOfItems > 0){
            numberOfItems--;
        }
    }

    public boolean isEmpty(){
        return numberOfItems == 0;
    }
}
