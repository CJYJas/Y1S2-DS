/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class StarLink {
    public static void main(String[] args) {
        System.out.println("Player 2 start first");
        Random rand = new Random();
        int player = 2;
        int score1 = 0;
        int score2 = 0;
        
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        
        while(score1 < 20 || score2 < 20){
            if(player == 1){
                for(int i = 0; i < 2; i++){
                    list1.originalList('*');
                }
                System.out.print("Player1:");
                list1.display();
                score1 += 2;
                player = rand.nextInt(2);
            }else{
                for(int i = 0; i < 2; i++){
                    list2.originalList('*');
                }
                System.out.print("Player2:");
                list2.display();
                score2 += 2;
                player = rand.nextInt(2);
            }
        }
        
        if(score1 >= 20){
            System.out.println("Player 1 wins the game");
        }else{
            System.out.println("Player 2 wins the game");
        }
    }
}
