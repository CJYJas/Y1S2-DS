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
        String[] inserted = {"ARS", "AST", "CHE", "LEI", "MAN", "LIV", "TOT"};
        LinkedList oriList = new LinkedList();
        
        for(String s : inserted){
            oriList.originalList(s);
        }
        
        System.out.print("The list consists of ");
        oriList.display();
        
        System.out.println("Remove all the word that consists of the A character using iterator");
        System.out.print("The updated list consists of ");
        
        LinkedList.LinkedListIterator iterator = oriList.new LinkedListIterator();
        iterator.listIterator(oriList);
        oriList.display();
    }       
}
