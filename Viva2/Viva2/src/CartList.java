/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class CartList {
    private CartNode head;
    private int size;
    private final CartStack undoStack;
    
    public CartList(){
        this.head = null;
        this.size = 0;
        this.undoStack = new CartStack();
    }
    
    public void addItem(Product p, int qty){
        if (p.getStock() < qty) {
            System.out.println("Error: Not enough stock available.");
            return;
        }
        
       if(findItem(p.getId()) != null){
           updateQuantity(p.getId(), findItem(p.getId()).getQuantity() + qty);
           // Record this addition so undo removes exactly qty (not the whole item).
           undoStack.push(p, qty);
           return;
       }
       
       CartNode newItem = new CartNode(p, qty);
       p.setStock(p.getStock() - qty);
       
       if (head == null) {
            head = newItem;
        }else{
            CartNode curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(newItem);
        }
       
        undoStack.push(p, qty);
        size++;
    }
    
    public void removeItem(int productId){
        if(head == null){
            System.out.println("Your cart is currently empty.");
            return;
        }
        
        if (head.getProduct().getId() == productId) {
            Product p = head.getProduct();
            p.setStock(p.getStock() + head.getQuantity());
            head = head.getNext(); 
            size --;
            return;
        }
         
        CartNode curr = head;
        while(curr.getNext() != null){
            CartNode target = curr.getNext();
            Product p = target.getProduct();
            
            if(p.getId() == productId){
                p.setStock(p.getStock() + target.getQuantity());
                curr.setNext(target.getNext());
                size --;
                return;
            }
            
            curr = curr.getNext();
        }
        
        System.out.println("Product ID " + productId + " not found in cart.");
    }
    
    public void updateQuantity(int productId, int newQty) {
        CartNode node = findItem(productId);
        if (node == null) return;

        Product p = node.getProduct();
        int currentInCart = node.getQuantity();
        int diff = newQty - currentInCart;

        if (diff > 0 && p.getStock() < diff) {
            System.out.println("Not enough warehouse stock to add " + diff + " more.");
            return;
        }
        
        p.setStock(p.getStock() - diff);
        node.setQuantity(newQty);
    }
    
    public CartNode findItem(int productId){
        if(head == null){
            System.out.println("Your cart is currently empty.");
            return null;
        }
        
        CartNode curr = head;
        while(curr != null){
            Product currProduct = curr.getProduct();
            
            if(currProduct.getId() == productId){
                return curr;
            }
            
            curr = curr.getNext();
        }
        
        System.out.println("Cant find item");
        return null;
    }
    
    public void displayCart() {
        if (isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.printf("%-20s %-10s %-15s %-10s%n", "Name", "Quantity", "Unit Price", "Subtotal");
        System.out.println("----------------------------------------------------------------------");

        CartNode curr = head;

        while (curr != null) {
            Product currProduct = curr.getProduct();
            int qty = curr.getQuantity();
            double price = currProduct.getPrice();
            double subTotal = price * qty;

            System.out.printf("%-20s %-10d RM%-13.2f RM%-10.2f%n", 
                              currProduct.getName(), qty, price, subTotal);

            curr = curr.getNext();
        }

        double totalCartValue = calculateTotal();
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-47s RM%.2f%n", "TOTAL TO PAY:", totalCartValue);
    }
    
    public double calculateTotal(){
        if(head == null){
            return 0.0;
        }   
        
        double total = 0;
        CartNode curr = head;
        
        while(curr != null){
            Product currProduct = curr.getProduct();
            int quantity = curr.getQuantity();
            total += quantity * currProduct.getPrice();
            
            curr = curr.getNext();
        }
        
        return total;
    }
    
    public void clear(){
        CartNode curr = head;
        while (curr != null) {
            Product p = curr.getProduct();
            p.setStock(p.getStock() + curr.getQuantity());
            curr = curr.getNext();
        }
        
        head = null;
        size = 0;
        undoStack.clear();
    }
    
    public void undo(){
        CartNode action = undoStack.pop();
        if (action == null) {
            System.out.println("Nothing to undo.");
            return;
        }

        Product p = action.getProduct();
        int qtyAdded = action.getQuantity();
        CartNode nodeInCart = findItem(p.getId());
        if (nodeInCart == null) {
            System.out.println("Undo skipped: item is no longer in cart.");
            return;
        }

        int currentQty = nodeInCart.getQuantity();
        if (qtyAdded >= currentQty) {
            removeItem(p.getId());
        } else {
            updateQuantity(p.getId(), currentQty - qtyAdded);
        }

        System.out.println("Undo successful: reverted last addition of " + qtyAdded + " x " + p.getName() + ".");
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public void checkout() {
        if (isEmpty()) {
            System.out.println("Nothing to checkout.");
            return;
        }
        
        displayCart();
        head = null;
        size = 0;
        undoStack.clear();
    }
}
