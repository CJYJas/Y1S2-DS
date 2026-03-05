/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Tester {
    public static void main(String[] args) {
        ArrayList<String> sentence = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a sentence :");
        String line = input.nextLine();
        
        Scanner wordScanner = new Scanner(line);
        
        while(wordScanner.hasNext()){
            String word = wordScanner.next();
            sentence.add(word);
        }
        
        CircularLinkedList oriList = new CircularLinkedList();
        
        System.out.println("The words in the circular linked list");
        for(String s : sentence){
            oriList.addCircularNode(s);
        }
        oriList.showCircularList();
        
        System.out.println("After delete a word");
        oriList.deleteCircularNode();
        oriList.showCircularList();
        
        System.out.println("The second item in the list is " + oriList.getCircularItem(1));
    }    
}
