/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Order<E>{
    private Queue<E> list = new Queue<>();
    
    public Order(E[] elements){
        for(E element : elements){
            list.enqueue(element);
        }
    }
    
    public void ChangeOrder(int k){
        for(int i = 0; i < k - 1; i++){
            E popValue = list.dequeue();
            
            list.enqueue(popValue);
        }
        
        list.enqueue(list.peek());
        
        System.out.println(list.toString());
    }
}
