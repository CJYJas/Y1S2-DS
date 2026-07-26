/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class CandyContainer{
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        
        String[] sequence = {"orange", "red", "blue", "orange", "yellow", "yellow", "blue"};
        for(String s : sequence){
            stack.push(s);
        }
        
        stack.display(stack);
        eatCandy(stack);
    } 
    
    public static void eatCandy(MyStack<String> stack){
        MyStack<String> temp = stack;
        MyStack<String> newStack = new MyStack<>();

        while(!temp.isEmpty()){
            String color = temp.pop();
            
            if(!color.equals("blue")){
                newStack.push(color);
            }
        }
        
        newStack.display(newStack);
    }
}
