/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class logic {
    public String infixExpression(String s){
        if(isNumeric(s)){
            return s;
        }
        
        switch(s){
            case "add" -> {return "+";}
            case "sub" -> {return "-";}
            case "mul" -> {return "*";}
            case "div" -> {return "/";}
            case "ob" -> {return "(";}
            case "cb" -> {return ")";}
        }
        
        return null;
    }
    public ArrayList<String> postfixExpression(ArrayList<String> infixElements){
        GenericStack<String> operator = new GenericStack<>();
        ArrayList<String> list = new ArrayList<>();
        
        for(String c : infixElements){
            if(isNumeric(c)){
                list.add(c);
            }else if(c.equals("(")){
                operator.push(c);
            }else if(c.equals(")")){
                while(!operator.isEmpty() && !operator.peek().equals("(")){
                    String remove = operator.pop();
                    list.add(remove);
                }
                 if(!operator.isEmpty() && operator.peek().equals("(")){
                    operator.pop();
                }
            }else{
                while(!operator.isEmpty() && precedence(operator.peek()) >= precedence(c)){
                    String remove = operator.pop();
                    list.add(remove);
                }
                operator.push(c);
            }
        }
        
        while(!operator.isEmpty()){
            String remove = operator.pop();
            list.add(remove);
        }
        
        return list;
    }
    
    public int precedence(String s){
        switch(s){
            case "+", "-" -> {
                return 1;
            }
            case  "*", "/" -> {
                return 2;
                       }
            }
        return 0;
    }
    
    public double postFixEvaluation(ArrayList<String> infixElements){
        GenericStack<String> temp = new GenericStack<>();
        
        for(String s : infixElements){
            if(isNumeric(s)){
                temp.push(s);
            }else{
                if(temp.getSize() < 2){
                    System.out.println("Invalid expression");
                }else{
                    double operator2 = Double.parseDouble(temp.pop());
                    double operator1 = Double.parseDouble(temp.pop());
                    double result = operation(s, operator1, operator2);
                    String stringResult = String.valueOf(result);
                    temp.push(stringResult);
                }
            }
        }
        
        return Double.parseDouble(temp.peek());
    }
    
    public double operation(String s, double operator1, double operator2){
        switch(s){
            case "+" -> {return operator1 + operator2;}
            case "-" -> {return operator1 - operator2;}
            case "*" -> {return operator1 * operator2;}
            case "/" -> {return operator1 / operator2;}
        }
        return 0;
    }
    
    public boolean isNumeric(String s){
        try{
            Integer d = Integer.parseInt(s);
        }catch(NumberFormatException nfe){
            return false;
        }
        return true;
    }
}
