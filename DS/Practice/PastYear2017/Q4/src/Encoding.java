/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Encoding {
    private Map<Integer, Character> indexMap = new HashMap<>();
    private Queue<Character> queue;
    
    public Encoding(Character[] list){
        queue = new Queue<>(list);
        getIndex(queue);
    }
    
    private void getIndex(Queue<Character> queue){
        for(int i = 0; i < queue.getSize(); i++){
            indexMap.put(i, queue.getElement(i));
        }
    }
    
    public Set<Integer> showIndex(){
        return indexMap.keySet();
    }
    
    public Queue<Character> getQueue(){
        return this.queue;
    }
    
    public Character getCharacter(int i){
        return indexMap.get(i);
    }
}
