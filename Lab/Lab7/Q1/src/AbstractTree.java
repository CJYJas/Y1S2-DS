/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
abstract class AbstractTree<Integer> implements Tree<Integer>{
    protected int size = 0;

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        this.size = 0;
    }
    
    @Override
    public Iterator<Integer> iterator(){
        return null;
    }
}
