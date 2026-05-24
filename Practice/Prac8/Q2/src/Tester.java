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
        AdvancedDList<String> list = new AdvancedDList<>();
        
        String[] elements = {"Structure", "Is", "Stochastic"};
        for(String e : elements){
            list.addAtIndex(list.getSize(), e);
        }
        list.displayList();
        
        list.replaceAll("Stochastic", "Superb");
        list.displayList();
    }
}
