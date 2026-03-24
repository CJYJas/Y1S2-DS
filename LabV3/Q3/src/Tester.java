/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Tester {
    public static void main(String[] args) {
        StorePairGeneric a = new StorePairGeneric(6, 4);
        StorePairGeneric b = new StorePairGeneric(2, 2);
        StorePairGeneric c = new StorePairGeneric(6, 4);
        
        displayEqual(a, b);
        displayEqual(a, c);
        displayEqual(b, c);
        
        displayCompare(a, b);
        displayCompare(b, c);
        displayCompare(a, c);
    }
    
    public static void displayEqual(StorePairGeneric a, StorePairGeneric b){
        boolean equal = a.equals(b);
        
        if(equal == true){
            System.out.println(a + " is equal to " + b);
        }else{
            System.out.println(a + " is not equal to " + b);
        }
    }
    
    public static void displayCompare(StorePairGeneric a, StorePairGeneric b){
        int compare = a.compareTo(b);
        
        if(compare == 0){
            System.out.println(a.getFirst() + " is equal to " + b.getFirst());
        }else if(compare > 0){
            System.out.println(a.getFirst() + " is greater than " + b.getFirst());
        }else{
            System.out.println(a.getFirst() + " is smaller than " + b.getFirst());
        }
    }
}
