/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TestClass {
    public static void main(String[] args) {
        int[] list = {1, 4, 5, 6, 7};
        MyStack<Integer> stack = new MyStack<>();
        
        for(int i : list){
            stack.push(i);
        }
        
        stack.printStack();
        stack.sortStack(stack);
        stack.printStack();
    }
    
}
