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
    
    public void push(Product product){
        CartNode stackNode = new CartNode(product, 0); 
        stackNode.setNext(top);
        top = stackNode;
        size++;
    }
    
    public Product pop() {
        if (isEmpty()) {
            System.out.println("Nothing to undo.");
            return null;
        }
        Product poppedProduct = top.getProduct();
        top = top.getNext();
        size--;
        return poppedProduct;
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
