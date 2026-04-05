/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SList;

/**
 *
 * @author User
 */
public class TestSList{
    public static void main(String[] args) {
        SList list = new SList();
        String[] values = {"Linked", "list,", "is,", "easy."};
        
        for(String v : values){
            list.appendEnd(v);
        }
        
        list.display();
        System.out.println("Removed value : " + list.removeInitial());
        System.out.println("Removed value : " + list.removeInitial());
        
        if(list.contains("difficult")){
            System.out.println("'difficult' is found");
        }else{
            System.out.println("'difficult' is not found");
        }
        
        list.clear();
    }    
}
