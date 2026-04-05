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
        Logic logic = new Logic();
        
        logic.addElement(0, 'a');
        logic.addLast('c');
        logic.addElement(1, 'b');
        logic.display();

        logic.addLast('z');
        logic.display();
    }   
}
