/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character>stack1 = new MyStack();
        
        stack1.push('a');
        stack1.push('b');
        stack1.push('c');
        
        System.out.println("Element inside stack 1 : " + stack1.toString());
        System.out.println("To check whether element 'b' is in the stack");
        
        if(stack1.search('b')){
            System.out.println("'b' is in the stack");
        }else{
            System.out.println("'b' is not in the stack");
        }
        
        System.out.println("To check whether element 'k' is in the stack");
        
        if(stack1.search('k')){
            System.out.println("'k' is in the stack");
        }else{
            System.out.println("'k' is not in the stack");
        }
        
        MyStack<Integer>stack2 = new MyStack();
        
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        
        System.out.println("Element inside stack 2 : " + stack2.toString());
        System.out.println("To check whether element 6 is in the stack");
        
        if(stack2.search(6)){
            System.out.println("6 is in the stack");
        }else{
            System.out.println("6 is not in the stack");
        }
        
        TestIntMyStack test2 = new TestIntMyStack();
        test2.pushList();
        test2.printStackCount();
        test2.printContent();
    }   
}
