/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Tester {
    public static void main(String[] args) {
        EditorManager<String> editor = new EditorManager<>();
        
        String[] elements = {"a", "boy", "is", "a", "girl"};
        
        for(String s : elements){
            editor.type(s);
        }
        
        editor.printState();
        editor.undo();
        editor.printState();
        editor.redo();
        editor.printState();
    }   
}
