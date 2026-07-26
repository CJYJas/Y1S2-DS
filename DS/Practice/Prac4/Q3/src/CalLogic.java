/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class CalLogic {
    private ArrayList<String> infixElements = new ArrayList<>();
    private ArrayList<String> postfixElements = new ArrayList<>();
    private String[] element;
    
    public CalLogic(String[] element){
        this.element = element;
    }
    
    private String Matching(String str){
        HashMap<String, String> mapping = new HashMap<>();
        
        mapping.put("add", "+");
        mapping.put("sub", "-");
        mapping.put("mul", "*");
        mapping.put("div", "/");
        mapping.put("mod", "%");
        mapping.put("ob", "(");
        mapping.put("cb", ")");
        
        return mapping.get(str);
    }
    
    public boolean isNumeric(String str) {
        try {
            Double.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean isOperator(String s) {
        return switch (s) {
            case "+", "-", "*", "/", "%" -> true;
            default -> false;
        };
    }
    
    public void changeIntoInfix(){
        for(String s : element){
            if(isNumeric(s)){
                infixElements.add(s);
                System.out.print(s + " ");
            }else{
                String operator = Matching(s);
                infixElements.add(operator);
                System.out.print(operator + " ");
            }
        }
    }
    
    public int operatorScore(String s){
        if(s.equals("+") || s.equals("-")){
            return 0;
        }
        
        if(s.equals("(")){
            return -1;
        }
        
        return 1;
    }
    
    public void changeIntoPostfix(){
        Stack<String> operator = new Stack<>();
        
        for(String s : infixElements){
            s = s.trim();
            if(isNumeric(s)){
                System.out.print(s + " ");
                postfixElements.add(s);
            }else if(isOperator(s)){
                while (!operator.isEmpty() && operatorScore(operator.peek()) >= operatorScore(s)) {
                    String popValue = operator.pop();
                    System.out.print(popValue + " ");
                    postfixElements.add(popValue);
                }
                operator.push(s);
            }else if(s.equals("(")){
                operator.push(s);
            }else if(s.equals(")")){
                while (!operator.isEmpty() && !operator.peek().equals("(")) {
                    String popValue = operator.pop();
                    postfixElements.add(popValue);
                    System.out.print(popValue + " ");
                }

                // 2. Discard the matching "("
                if (!operator.isEmpty() && operator.peek().equals("(")) {
                    operator.pop(); 
                } else {
                    // Optional: Safety check for expressions like "3 + 2 )"
                    throw new IllegalArgumentException("Mismatched parentheses: missing '('");
                }
            }
        }
        
        while (!operator.isEmpty()) {
            String popValue = operator.pop();
            if (popValue.equals("(")) continue;
            postfixElements.add(popValue);
            System.out.print(popValue + " ");
        }
        
    }
    
    public int calculate(int b, int a, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            case "%" -> a % b;
            default  -> 0;
        };
    }
    
    public int calculateLogic(){
            Stack<Integer> stack = new Stack<>();
            
            for(String s : postfixElements){
                if(isNumeric(s)){
                    stack.push(Integer.valueOf(s));
                }else{
                    int a = stack.pop();
                    int b = stack.pop();
                    
                    int ans = calculate(a, b, s);
                    stack.push(ans);
                }
            }
            
            return stack.peek();
    }
}
