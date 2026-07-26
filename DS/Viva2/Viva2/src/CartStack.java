/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class CartStack {
    private CartNode top;
    private int size;
    
    public CartStack(){
        this.top = null;
        this.size = 0;
    }
    
    public void push(Product product, int qtyAdded){
        CartNode stackNode = new CartNode(product, qtyAdded);
        stackNode.setNext(top);
        top = stackNode;
        size++;
    }
    
    public CartNode pop() {
        if (isEmpty()) {
            return null;
        }
        CartNode poppedNode = top;
        top = top.getNext();
        size--;
        poppedNode.setNext(null);
        return poppedNode;
    }
    
    public Product peek() {
        if (isEmpty()) return null;
        return top.getProduct();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }
    
    public void clear() {
        top = null;
        size = 0;
    }
}
