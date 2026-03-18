/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class ColourCard {
    public static void main(String[] args) {
        Random rand = new Random();
        
        Queue<String> playerOne = new LinkedList<>();
        Queue<String> playerTwo = new LinkedList<>();
        
        int number;
        int colNum;
        
        for(int i = 0; i < 5; i++){
            number = rand.nextInt(9) + 1;
            colNum = rand.nextInt(4) + 1;
            
            AddQueue(number, colNum, playerOne);
            
            number = rand.nextInt(9) + 1;
            colNum = rand.nextInt(4) + 1;
            
            AddQueue(number, colNum, playerTwo);
            
        }
        
        Queue<String> clonedPlayerOne =  new LinkedList<>(playerOne);
        Queue<String> clonedPlayerTwo = new LinkedList<>(playerTwo);
        Competition competition = new Competition(clonedPlayerOne, clonedPlayerTwo);
        competition.Compare();
        
        System.out.println("Player One Card");
        while(!playerOne.isEmpty()){
            System.out.print(playerOne.poll() + "-->");
        }
        System.out.println("");
        
        System.out.println("Player Two Card");
        while(!playerTwo.isEmpty()){
            System.out.print(playerTwo.poll() + " -->");
        }
        System.out.println("");
        
        competition.displayResult();
    }  
    
    public static void AddQueue(int number, int colNum, Queue<String> list){
        String card = "";
        
        switch(number){
            case 1 -> card += "One";
            case 2 -> card += "Two";
            case 3 -> card += "Three";
            case 4 -> card += "Four";
            case 5 -> card += "Five";
            case 6 -> card += "Six";
            case 7 -> card += "Seven";
            case 8 -> card += "Eight";
            case 9 -> card += "Nine";
        }
        
        switch(colNum){
            case 1 -> card += " Blue";
            case 2 -> card += " Green";
            case 3 -> card += " Red";
            case 4 -> card += " Yellow";
        }
       
        list.offer(card);
    }
}
