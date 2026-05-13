/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
public class EditorManager<E>{
    private final MyStack<E> undoStack;
    private final MyStack<E> redoStack;
    
    public EditorManager(){
        this.redoStack = new MyStack<>();
        this.undoStack = new MyStack<>();
    }
    
    public void type(E value){
        undoStack.push(value);
    }
    
    public void undo(){
        if(undoStack.isEmpty()){
            System.out.println("Error : Nothing to be undo");
            return;
        }
        
        E undoVal = undoStack.pop();
        redoStack.push(undoVal);
    }
    
    public void redo(){
        if(redoStack.isEmpty()){
            System.out.println("Error : Nothing to be redo");
            return;
        }
        
        E redoVal = redoStack.pop();
        undoStack.push(redoVal);
    }
    
    public void printState(){
        System.out.println("Element inside redoStack");
        redoStack.printStack();
        System.out.println("Element inside undoStack");
        undoStack.printStack();
    }
}
