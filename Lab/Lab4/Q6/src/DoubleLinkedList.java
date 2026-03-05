/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class DoubleLinkedList {
    DoubleListNode head;
    int size;
    
    public void addLast(int data){
        DoubleListNode newNode = new DoubleListNode(data);
        
        if(head == null){
            head = newNode;
        }else{
            DoubleListNode curr = head;
            
            while(curr.next != null){
                curr = curr.next;
            }
            
            curr.next = newNode;
            newNode.prev = curr;
        }
        size++;
    }
    
    public void display(){
        DoubleListNode curr = head;
        
        while(curr != null){
            System.out.print("<-- " + curr.data + " --> ");
            curr = curr.next;
        }
        
        System.out.println("");
    }
    
    public void removeFirst(DoubleLinkedList oriList){
        oriList.head = oriList.head.next;
    }
    
    public void removeLast(DoubleLinkedList oriList){
        if (oriList.head == null) {
            return;
        }

        if (oriList.head.next == null) {
            oriList.head = null;
            return;
        }
        
        DoubleListNode curr = oriList.head;
        
        while(curr.next != null){
            curr = curr.next;
        }
        
        DoubleListNode secondToLast = curr.prev; 
        secondToLast.next = null;

        curr.prev = null;
    }
    
    public void removeElement(int index, DoubleLinkedList oriList){
        if(index == 0){
            oriList.removeFirst(oriList);
            return;
        }
        
        if(index == size - 1){
            oriList.removeLast(oriList);
            return;
        }
        
        DoubleListNode curr = oriList.head;
        
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        
        curr.prev.next = curr.next;
        
        if(curr.next != null){
            curr.next.prev = curr.prev;
        }
        
        size --;
    }
    
    public void replaceElement(DoubleLinkedList oriList, int index, int replace){
        DoubleListNode curr = oriList.head;
        
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        
        curr.data = replace;
    }
    
    public void removeEven(DoubleLinkedList oriList){
        DoubleListNode curr = oriList.head;
        
        while(curr != null){
            DoubleListNode nextNode = curr.next;
            int num = curr.data;
            
            if(num % 2 == 0){
                if(curr == oriList.head){
                    oriList.head = nextNode;
                    if(oriList.head != null){
                        oriList.head.prev = null;
                    }
                }else{
                    curr.prev.next = nextNode;
                    if(nextNode != null){
                        nextNode.prev = curr.prev;
                    }
                }
                size --;
            }
            
            curr = nextNode;
        }
    }
}