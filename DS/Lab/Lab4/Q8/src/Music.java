/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Music {
    static ListNode currentSong = null;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] musicName = {"one", "two", "three", "four"};
        CircularLinkedList musicList = new CircularLinkedList();
        
        System.out.println("My Music Play List");
        for(String s : musicName){
            musicList.addCircularNode(s);
        }
        System.out.print("Music : ");
        musicList.showCircularList();
        
        currentSong = musicList.head;
        int choice;
        
        do{
            System.out.print("1 Play Music | 2 Forward | 3 Back | 4 Stop | -1 Exit");
            choice = input.nextInt();
            
            switch(choice){
                case 1 -> musicList.choice1(currentSong);
                case 2 -> currentSong = musicList.choice2(currentSong);
                case 3 -> currentSong = musicList.choice3(currentSong);
                case 4 -> musicList.stopMusic();
            }
        }while(choice != -1);
        
        System.out.println("Exit Music Player");
    }   
}
