/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Logic {
    ArrayList<String> lines = new ArrayList<>();
    GenericStack<String> stack = new GenericStack<>();
    
    public Logic(ArrayList<String> lines){
        this.lines = lines;
    }
    
    Map<String, Integer> countNote = new HashMap<>();
    public void initializeCount(){
        countNote.put("note", 0);
    }
    
    boolean wholeValid = true;
    String tag = "";
    public void findTag(){
        boolean insideTag = false;
        initializeCount();
        outer:
        for(String l : lines){
            char[] elements = l.toCharArray();
            
            for(char c : elements){
                if(c == '<'){
                    tag = "";
                    insideTag = true;
                    continue;
                }
                
                if(insideTag){
                    if(c != '>'){
                        tag += c;
                    }else{
                        if(!checkValid()){
                            break outer;
                        }
                        tag = "";
                        insideTag = false;
                    }
                }
            }
        }
        
        if(wholeValid){
            System.out.println("The xml document is valid");
        }
    }
    
    public boolean checkValid(){
        if(tag.charAt(0) == '/'){
            String compareTag = tag.substring(1);
            String prevTag = stack.peek();

            if(prevTag.equals(compareTag)){
                stack.pop();
            }else{
                System.out.println("Begining element : <" + prevTag + "> Invalid ending element : <" + tag + ">");
                stack.pop();
                wholeValid = false;
                return false;
            }
        }else{
            if(tag.equals("note")){
                countNote.put(tag, countNote.get(tag) + 1);
                if(countNote.get(tag) > 1){
                    System.out.println("Duplicate root element <note>");
                    wholeValid = false;
                    return false;
                }
            }
            stack.push(tag);
        }
        return true;
    }
}
