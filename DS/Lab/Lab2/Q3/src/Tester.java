/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Random rand = new Random();
        
        ArrayListDeck adeck = new ArrayListDeck();
        System.out.println("Array Implementation");
        int arrayRepeat = rand.nextInt(9) + 2;
        System.out.println("Player 1 draws " + arrayRepeat + " times");
        Game g1 = new Game();
        for(int i = 0; i < arrayRepeat; i++){
            System.out.print(g1.arrayTurn(adeck));
        }
        System.out.println("");
        
        System.out.println("Array Implementation");
        System.out.println("Player 2 draws " + arrayRepeat + " times");
        Game g2 = new Game();
        for(int i = 0; i < arrayRepeat; i++){
            System.out.print(g2.arrayTurn(adeck));
        }
        System.out.println("");
        
        LinkedListDeck ldeck = new LinkedListDeck();
        System.out.println("Linked List Implementation");
        int linkedRepeat = rand.nextInt(10) + 2;
        System.out.println("Player 1 draws " + linkedRepeat + " times");
        
        Game g3 = new Game();
        for(int i = 0; i < linkedRepeat; i++){
            System.out.print(g3.linkedTurn(ldeck));
        }
        System.out.println("");
        
        System.out.println("Linked List Implementation");
        System.out.println("Player 2 draws " + linkedRepeat + " times");
        Game g4 = new Game();
        for(int i = 0; i < linkedRepeat; i++){
            System.out.print(g4.linkedTurn(ldeck));
        }
        System.out.println("");
    }
    
}
