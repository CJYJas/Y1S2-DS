/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class MyGeneric<T>{
    private T t;
    
    public MyGeneric(){}
    
    public MyGeneric(T t){
        this.t = t;
    }
    
    public T getT(){
        return t;
    }
    
    public void setT(T t){
        this.t = t;
    }
}
