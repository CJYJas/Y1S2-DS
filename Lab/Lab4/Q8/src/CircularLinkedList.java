


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class CircularLinkedList {
    ListNode head;
    ListNode tail;
    private Clip clip;
    
    public void addCircularNode(String data){
        ListNode newNode = new ListNode(data);
        
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
            newNode.prev = head;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
            head.prev = tail;
        }
    }
    
    public void showCircularList(){
        ListNode curr = head;
        
        do{
            System.out.print(curr.data + " -->");
            curr = curr.next;
        }while(curr != head);
        System.out.print(head.data);
        
        System.out.println("");
    }
    
    public void choice1(ListNode curr) {
        try {
            if (clip != null && clip.isRunning()) {
                clip.stop();
                clip.close();
            }
            
            System.out.println("Play Music : " + curr.data);
            File soundFile = new File(curr.data + ".wav"); // Works best with .wav
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            
            new java.util.Timer().schedule(new java.util.TimerTask() {
                @Override
                public void run() {
                    if (clip != null) {
                        clip.stop();
                        clip.close();
                    }
                }
            }, 10000);

        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public ListNode choice2(ListNode curr){
        curr = curr.next;
        System.out.print("Forward One Position - ");
        choice1(curr);
        return curr;
    }
    
    public ListNode choice3(ListNode curr){
        curr = curr.prev;
        System.out.print("Backward One Position -");
        choice1(curr);
        return curr;
    }
    
    public void stopMusic() {
        System.out.println("Stop Playing");
        if (clip != null) {
            if (clip.isRunning()) {
                clip.stop();
            }
            clip.close(); // Frees up the file so it can be played again
        }
    }
}
