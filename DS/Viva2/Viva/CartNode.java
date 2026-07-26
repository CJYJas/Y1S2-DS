/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class CartNode{
    private CartNode next;
    private Product product;
    private int quantity;
    
    public CartNode(Product product, int quantity){
        this.product = product;
        this.next = null;
        this.quantity = quantity;
    }
    
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public CartNode getNext() { return next; }
    public void setNext(CartNode next) { this.next = next; }
}
