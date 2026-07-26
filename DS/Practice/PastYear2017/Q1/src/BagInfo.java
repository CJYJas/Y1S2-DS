/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class BagInfo {
    private String bagName;
    private int soldAmount;
    
    public BagInfo(String bagName, int soldAmount){
        this.bagName = bagName;
        this.soldAmount = soldAmount;
    }
    
    public String getBagName(){
        return this.bagName;
    }
    
    public int getSoldAmount(){
        return this.soldAmount;
    }
    
    public void setBagName(String bagName){
        this.bagName = bagName;
    }
    
    public void setSoldAmount(int soldAmount){
        this.soldAmount = soldAmount;
    }
}
