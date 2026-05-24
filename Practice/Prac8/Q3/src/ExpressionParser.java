/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
class ExpressionParser<E>{
//    public ExpressionParser(String expression){
//        infixToPostFix(expression);
//    }
    
    public static String infixToPostFix(String expression){
        MyStack<Character> stack = new MyStack<>();
        char[] elements = expression.toCharArray();
        String infix = "";
        
        for(char c : elements){
            if(c == '('){
                stack.push(c);
                trackStatus(c, stack, infix);
                continue;
            }
            
            if(c == ')'){
                while(! stack.isEmpty() && stack.peek() != '('){
                    infix += stack.pop();
                }
                
                if(!stack.isEmpty()){
                    stack.pop();
                }
                trackStatus(c, stack, infix);
                continue;
            }
            
            if(c == '+' || c == '-' || c == '*' || c == '/'){
                while(! stack.isEmpty() && getPriority(c) <= getPriority(stack.peek())){
                    infix += stack.pop();
                }
                
                stack.push(c);
                trackStatus(c, stack, infix);
                continue;
            }
            
            infix += c;
            
            trackStatus(c, stack, infix);
        }
        
        while(!stack.isEmpty()){
            infix += stack.pop();
            trackStatus('-', stack, infix);
        }
        System.out.println("");
        return infix;
    }
        private static int getPriority(char c){
        return switch(c){
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }
    
    private static void trackStatus(char c, MyStack<Character> stack, String output){
        StringBuilder stackContent = new StringBuilder();
        for(Character element : stack.getList()){
            stackContent.append(element);
        }
       
        System.out.printf("%-10s | %-20s | %s%n", c, stackContent.toString(), output);
    }
}
