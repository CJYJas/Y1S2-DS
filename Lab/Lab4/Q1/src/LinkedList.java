/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class LinkedList {
    private ListNode head;
    private ListNode tail;
    
    public LinkedList(){
        this.head = null;
    }
    
    public void insertAtBack(int data){
        ListNode newNode = new ListNode(data);
        
        if(head == null){
            head = newNode;
        }else{
            ListNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public void insertAtFront(int data){
        ListNode newNode = new ListNode(data);
        
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void addSortNode(int data){
        ListNode newNode = new ListNode(data);
        
        if(head == null || newNode.data < head.data){
            newNode.next = head;
            head = newNode;
        }else{
            ListNode current = head;
            
            while(current.next != null && (current.next.data < newNode.data)){
                current = current.next;
            }
            
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("");
    }
}

