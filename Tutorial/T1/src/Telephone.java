/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 *
*/
import java.util.*;

class Telephone {
    private String areaCode;
    private int number;
    private static int numberOfTelephoneObject = 0;
    
    public Telephone(String areaCode, int number){
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject ++;
    }
    
    public String getAreaCode(){
        return areaCode;
    }
    
    public int getNumber(){
        return number;
    }
    
    public void setAreaCode(String areaCode){
        this.areaCode = areaCode;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public String makeFullNumber(){
        String fullNumber;
        String numInString = String.valueOf(number);
        fullNumber = areaCode + "-" + numInString;
        
        return fullNumber;
    }
}

class Tester{
    public static void main(String[] args) {
        ArrayList<Telephone> list = new ArrayList<>();
        
        Telephone t1 = new Telephone("03", 79676300);
        Telephone t2 = new Telephone("03", 79676301);
        Telephone t3 = new Telephone("03", 79676302);
        Telephone t4 = new Telephone("03", 79676303);
        Telephone t5 = new Telephone("03", 79676304);
        
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);
        
        for(Telephone t : list){
            System.out.println(t.makeFullNumber());
        }
    }
}


