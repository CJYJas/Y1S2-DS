
import java.nio.file.Paths;
import javax.print.attribute.standard.Media;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class CircularLinkedList {
    ListNode head;
    ListNode tail;
    int size = 0;
    
    public void length(){
        ListNode curr = head;
        
        do{
            size ++;
            curr = curr.next;
        }while(curr != head);
    }
    
    public void addCircularNode(String data){
        ListNode newNode = new ListNode(data);
        
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    
    public void deleteCircularNode(){
        int index = 0;
        
        if(head == null){
            return;
        }
        
        if(head.next == head){
            head = null;
            tail = null;
            return;
        }
        
        ListNode curr = head;
        
        while(curr.next != tail){
            curr = curr.next;
            index ++;
        }
        
        getCircularItem(index + 1);
        curr.next = head;
        tail = curr;
    }
    
    public void showCircularList(){
        ListNode curr = head;
        
        do{
            System.out.print(curr.data + " -->");
            curr = curr.next;
        }while(curr != head);
        System.out.print(head.data);
        
        System.out.println("");
    }
    
    public String getCircularItem(int index){
        ListNode curr = head;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        return curr.data;
    }
    
}