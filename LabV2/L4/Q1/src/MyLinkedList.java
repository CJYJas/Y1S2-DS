/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class MyLinkedList<E>{
    private Node<E> head;
    private Node<E> tail;
    int size = 0;
    private int middleValue;
    
    public MyLinkedList(){
        this.head = null;
        this.tail = null;
    }
    
    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        
        if(head == null){
            head = newNode;
            tail = newNode;
            size ++;
            return;
        }
        
        newNode.next = head;
        head = newNode;
        size ++;
    }
    
    public void add(E e){
        Node<E> newNode = new Node<>(e);
        
        if(head == null){
            addFirst(e);
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
        tail.next = null;
        size ++;
    }
    
    public void add(int index, E e){
        if(index <= 0){
            addFirst(e);
            return;
        }
        
        if(index >= size){
            add(e);
            return;
        }

        Node<E> curr = head;
        Node<E> newNode = new Node<>(e);
        
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        
        newNode.next = curr.next;
        curr.next = newNode;
        size ++;
    }
    
    public E removeFirst(){
        Node<E> removeNode = head;
        
        if(size > 1){
            head = head.next;
        }else{
            head = null;
        }
        
        if(size == 1){
            tail = null;
        }
        
        size --;
        
        return removeNode.element;
    }
    
    public E removeLast(){
        if(size == 0){
            return null;
        }
        
        if(size == 1){
            return removeFirst();
        }
        
        Node<E> curr = head;
        
        while(curr.next != tail){
            curr = curr.next;
        }
        
        Node<E> temp = tail;
        tail = curr;
        curr.next = null;
        size --;
        
        return temp.element;
    }
    
    public E remove(int index){
        if(index <= 0){
            return removeFirst();
        }
        
        if(index >= size - 1){
            return removeLast();
        }
        
        Node<E> curr = head;
        
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        
        Node<E> temp = curr.next;
        curr.next = curr.next.next;
        size --;
        temp.next =  null;
        
        return temp.element;
    }
   
    public boolean contains(E e){
        Node<E> curr = head;
        
        while(curr != null){
            if(curr.element.equals(e)){
                return true;
            }
            curr = curr.next;
        }
        
        return false;
    }
    
    public E getFirst(){
        return head.element;
    }
    
    public E getLast(){
        return tail.element;
    }
    
    public E get(int index){
        if(index <= 0){
            return getFirst();
        }
        
        if(index >= size - 1){
            return getLast();
        }
        
        Node<E> curr = head;
        
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        
        return curr.element;
    }
    
    public int indexOf(E e){
        Node<E> curr = head;
        int index = 0;
        
        while(curr != null){
            if(e.equals(curr.element)){
                return index;
            }
                
            index ++;
            curr = curr.next;
        }
        
        
        return -1;
    }
    
    public int lastIndexOf(E e){
        int lastIdx = -1;
        int currentIdx = 0;
        Node<E> curr = head;

        while (curr != null) {
            if(e.equals(curr.element)) {
                lastIdx = currentIdx;
            }

            curr = curr.next;
            currentIdx++;
        }

        return lastIdx;
    }
    
    public E set(int index, E e){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> curr = head;
        
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        
        E oldElement = curr.element;
        curr.element = e;
        
        return oldElement;
    }
    
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }
    
    public void print(){
        if(head == null){
            System.out.println("No element");
            return;
        }
        
        Node<E> curr = head;
        
        while(curr != null){
            System.out.print(curr.element + " --> ");
            curr = curr.next;
        }
        System.out.println("");
    }
    
    public void reverse() {
        if (head == null) return;

        Object[] tempArray = new Object[size];
        Node<E> curr = head;
        int i = 0;

        while (curr != null) {
            tempArray[i++] = curr.element;
            curr = curr.next;
        }

        for (int j = size - 1; j >= 0; j--) {
            System.out.print(tempArray[j] + (j > 0 ? " --> " : ""));
        }
        System.out.println();
    }
    
    public E getMiddleValue(){
        middleValue = size /2;
        return get(middleValue);
    }
    
    public void removeMiddleValue(){
        MyLinkedList<E> newList = new MyLinkedList<>();
        Node<E> curr = this.head;

        while (curr != null) {
            newList.add(curr.element);
            curr = curr.next;
        }
        
        newList.remove(middleValue);
        newList.print();
    }
}
