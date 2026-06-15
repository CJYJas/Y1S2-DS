/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class LinkedList{
    private Node<BagInfo> head;
    
    public LinkedList(){
        this.head = null;
    }
    
    public void insertFirstLink(String bagName, int soldAmount){
        BagInfo newBag = new BagInfo(bagName, soldAmount);
        Node<BagInfo> newNode = new Node(newBag);
        
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.setNext(head);
        head = newNode;
    }
    
    private int searchBagName(String bagName){
        int search = 0;
        Node<BagInfo> curr = head;
        while(curr != null){
            if(curr.getObject().getBagName().equals(bagName)){
                return search + 1;
            }
            
            search ++;
            curr = curr.getNext();
        }
        
        return 0;
    }
    
    public void addAfter(String prev, String bagName, int soldAmount){
        int count = searchBagName(prev);
        
        if(count <= 0){
            System.out.println("Unable to found " + prev);
            return;
        }
        
        System.out.println("Found " + prev + " which is handbag number " + count + " in the linked list");
        
        Node<BagInfo> curr = head;
        for(int i = 0; i < count - 1; i++){
            curr = curr.getNext();
        }
        
        BagInfo newBag = new BagInfo(bagName, soldAmount);
        Node<BagInfo> newNode = new Node(newBag);
        
        newNode.setNext(curr.getNext());
        curr.setNext(newNode);
    }
    
    public void removeLink(String bagName){
        int count = searchBagName(bagName);
        
        if(count <= 0){
            System.out.println("Unable to found " + bagName);
            return;
        }
        
        System.out.println("Found a match." + bagName + " is handbag number " + count + " in the linked list");
        
        Node<BagInfo> curr = head;
        for(int i = 0; i < count - 2; i++){
            curr = curr.getNext();
        }
        
        curr.setNext(curr.getNext().getNext());
    }
    
    public void display(){
        System.out.println("Displaying the Linked List");
        
        if(head == null){
            System.out.println("No item in Linked List");
        }
        
        Node<BagInfo> curr = head;
        while(curr != null){
            System.out.print(curr.getObject().getBagName() + " : ");
            System.out.print(curr.getObject().getSoldAmount() + " Sold ");
            System.out.println("");
            curr = curr.getNext();
        }
    }
}
