/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class findSymmetricDifference<T>{
    public static void main(String[] args) {
        BagInterface<Integer> bag1 = new ArrayBag<>();
        BagInterface<Integer> bag2 = new ArrayBag<>();
        
        bag1.add(1);
        bag1.add(2);
        bag1.add(3);
        
        bag2.add(2);
        bag2.add(3);
        bag2.add(4);
        
        BagInterface<Integer> bag3 = bag1.getSymmetricDifference(bag2);
        Object[] bag = bag3.toArray();
        for(Object i : bag){
            System.out.println(i + ",");
        }
    }
}
