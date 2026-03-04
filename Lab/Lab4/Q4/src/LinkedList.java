/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class LinkedList {
    ListNode head;
    
    public void originalList(char c){
        ListNode newNode = new ListNode(c);
        
        if(head ==  null){
            head = newNode;
        }else{
            ListNode curr = head;
            
            while(curr.next != null){
                curr = curr.next;
            }
            
            curr.next = newNode;
        }
    }
        
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("");
    }
}
