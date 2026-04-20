/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class LinkedList<T>{
    LinkedListNode head;
    int count = 0;
    
    public LinkedList(){
        this.head = null;
    }
    
    public int replaceAll(T oldItem, T newItem){
        if(head == null){
            return 0;
        }
        
        LinkedListNode curr = head;
        
        while(curr != null){
            if(curr.val.equals(oldItem)){
                curr.val = newItem;
                count ++;
            }
            
            curr = curr.next;
        }
        
        return count;
    }
}
