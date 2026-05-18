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
        BoundedMultiplicityBag<Integer> oriBag = new BoundedMultiplicityBag<>(5, 2);
        BoundedMultiplicityBag<Integer> otherBag = new BoundedMultiplicityBag<>(4, 2);
        
        int[] bag1Element = {1, 1, 2, 3, 4};
        int[] bag2Element = {1, 2, 3};
        
        for(int i : bag1Element){
            oriBag.add(i);
        }
        oriBag.printElement();
        
        for(int i : bag2Element){
            otherBag.add(i);
        }
        otherBag.printElement();
        
        BoundedMultiplicityBag<Integer> diffBag = oriBag.difference(otherBag);
        diffBag.printElement();
    }   
}
