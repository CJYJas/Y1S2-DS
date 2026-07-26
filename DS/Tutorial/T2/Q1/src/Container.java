/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Container<T>{
    private T t;
    
    public Container(){}
    
    public void add(T t){
        this.t = t;
    }
    
    public T retrieve(){
        return t;
    }
    
    public static void main(String[] args) {
        Container<Integer> container1 = new Container();
        Container<String> container2 = new Container();
        
        container1.add(50);
        container2.add("Java");
        
        System.out.println("Retrieve from container 1 : " + container1.retrieve());
        System.out.println("Retrieve from container 2 : " + container2.retrieve());
    }
}
