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
        LinkedList list = new LinkedList();
        
        list.insertFirstLink("Tods", 50000000);
        list.insertFirstLink("Prada", 100000);
        list.insertFirstLink("Chanel", 100000000);
        list.insertFirstLink("Louis Vuitton", 10000000);
        
        list.display();
        System.out.println("");
        
        System.out.println("Adding Coach after Chanel");
        list.addAfter("Chanel", "Coach", 10000000);
        list.display();
        System.out.println("");
        
        System.out.println("Adding Mulberry after Coach");
        list.addAfter("Coach", "Mulberry", 10000000);
        list.display();
        System.out.println("");
        
        System.out.println("Removing Chanel");
        list.removeLink("Chanel");
        list.display();
        System.out.println("");
        
        System.out.println("Removing Coach");
        list.removeLink("Coach");
        list.display();
    }
}
