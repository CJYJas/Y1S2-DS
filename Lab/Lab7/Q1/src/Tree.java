/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
interface Tree<Integer> extends Iterable<Integer>{
    int searchFrequency(Integer e);
    boolean insert(Integer e);
    boolean delete(Integer e);
    
    void inOrder();
    void preOrder();
    void postOrder();
    
    int getSize();
    boolean isEmpty();
    
    void clear();
}
