/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Stack;
public class BinarySearchTree {
    Node root;
    
    public BinarySearchTree(){
        root = null;
    }
    
    public void insertTree(String postfix){
        Stack<Node> stack = new Stack<>();
        Stack<Character> operators = new Stack<>();
        char[] tokens = postfix.toCharArray();
        
        for(char c : tokens){
            if(Character.isDigit(c)){
                stack.push(new Node(c));
            }else if(c == '('){
                operators.push(c);
            }else if(c == ')'){
                while (!operators.isEmpty() && operators.peek() != '(') {
                    processOperator(stack, operators);
                }
                operators.pop();
            }else{
                while(!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)){
                    processOperator(stack, operators);
                }
                operators.push(c);
            }
        }
        
        while(!operators.isEmpty()){
            processOperator(stack, operators);
        }
        
        if(!stack.isEmpty()){
            this.root = stack.pop();
        }
    }
    
    private void processOperator(Stack<Node> nodes, Stack<Character> operators){
        Node opNode = new Node(operators.pop());
        opNode.right = nodes.pop();
        opNode.left = nodes.pop();
        
        nodes.push(opNode);
    }
    
    private int precedence(char c) {
        switch (c) {
            case '+', '-' -> { return 1; }
            case '*', '/' -> { return 2; }
            case '(' -> { return 0; }
        }
        return -1;
    }
    
    
    public void inorder(){
        inOrderRec(root);
        System.out.println("");
    }
    
    private void inOrderRec(Node root){
        if(root != null){
            inOrderRec(root.left);
            System.out.print(root.value + " <-- ");
            inOrderRec(root.right);
        }
    }
    
    public void preOrder(){
        preOrderRec(root);
        System.out.println("");
    }
    
    private void preOrderRec(Node root){
        if(root != null){
            System.out.print(root.value + "  <--  ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
    
    public void postOrder(){
        postOrderRec(root);
        System.out.println("");
    }
    
    private void postOrderRec(Node root){
        if(root != null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.value + "  <--  ");
        }
    }
}



