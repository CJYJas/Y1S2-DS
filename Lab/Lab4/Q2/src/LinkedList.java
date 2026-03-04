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
    private int size = 0;
    private int size1;
    
    public LinkedList(){
        this.head = null;
    }
    
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
        size ++;
    }
    
    public void splitList(LinkedList firstHalf, LinkedList secondHalf) {
        int mid = (size + 1) / 2;
        ListNode curr = head;

        for (int i = 0; i < size; i++) {
            if (i < mid) {
                // We create a BRAND NEW node for the first list
                firstHalf.originalList(curr.data);
            } else {
                // We create a BRAND NEW node for the second list
                secondHalf.originalList(curr.data);
            }
            curr = curr.next;
        }
    }
    
    public void alternateList(LinkedList firstHalf, LinkedList secondHalf){
        ListNode curr = head;
        boolean firstList = true;

        for (int i = 0; i < size; i++) {
            if(firstList){
                firstHalf.originalList(curr.data);
                firstList = false;
            }else{
                secondHalf.originalList(curr.data);
                firstList = true;
            }
            curr = curr.next;
        }
    }
    
    public void mergeList(LinkedList mergedList, LinkedList firstHalf, LinkedList secondHalf){
        ListNode firstCurr = firstHalf.head;
        ListNode secondCurr = secondHalf.head;
        
        while(firstCurr != null && secondCurr != null){
            mergedList.originalList(firstCurr.data);
            mergedList.originalList(secondCurr.data);
            firstCurr = firstCurr.next;
            secondCurr = secondCurr.next;
        }
        
        while(firstCurr != null){
            mergedList.originalList(firstCurr.data);
            firstCurr = firstCurr.next;
        }
        
        while(secondCurr != null){
            mergedList.originalList(secondCurr.data);
            secondCurr = secondCurr.next;
        }
    }
    
    public void recursiveMethod(LinkedList reversedList, ListNode curr){
        if(curr == null){
            return;
        }
        
        recursiveMethod(reversedList, curr.next);
        reversedList.originalList(curr.data);
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
