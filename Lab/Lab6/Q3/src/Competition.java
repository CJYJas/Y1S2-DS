/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Competition{
    Queue<String> playerOne;
    Queue<String> playerTwo;
    int playerOneScore = 0;
    int playerTwoScore = 0;
    
    Map<String, Integer> wordValues = new HashMap<>();
    
    public Competition(Queue<String> playerOne,Queue<String> playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        
        wordValues.put("One", 1);
        wordValues.put("Two", 2);
        wordValues.put("Three", 3);
        wordValues.put("Four", 4);
        wordValues.put("Five", 5);
        wordValues.put("Six", 6);
        wordValues.put("Seven", 7);
        wordValues.put("Eight", 8);
        wordValues.put("Nine", 9);
    }
    
    public int MapNumber(String number){    
        return wordValues.get(number);
    }
    
    public void Compare(){
        while(!playerOne.isEmpty()){
            String[] cardOne = playerOne.poll().split(" ");
            String[] cardTwo = playerTwo.poll().split(" ");
            
            int numberOne = MapNumber(cardOne[0]);
            int numberTwo = MapNumber(cardTwo[0]);
            
            if(numberOne > numberTwo){
                playerOneScore ++;
            }else if(numberOne < numberTwo){
                playerTwoScore ++;
            }else{
                String colorOne = cardOne[1];
                String colorTwo = cardTwo[1];
                compareColor(colorOne, colorTwo);
            }
        }
    }
    
    public void compareColor(String color1, String color2){
        int result = color1.compareTo(color2);
        
        if(result < 0){
            playerOneScore ++;
        }else if(result > 0){
            playerTwoScore ++;
        }
    }
    
    public void displayResult(){
        System.out.println("Player 1 Score : " + playerOneScore);
        System.out.println("Player 2 Score : " + playerTwoScore);
        
        if(playerOneScore > playerTwoScore){
            System.out.println("Player 1 WINS !");
        }else if(playerTwoScore > playerOneScore){
            System.out.println("Player 2 WINS !");
        }else{
            System.out.println("Tie");
        }
    }
}
