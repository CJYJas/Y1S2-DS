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
        displayPacket();
        System.out.println("");
        
        System.out.println("Processing 10 network packets");
        
        PriorityQueue<Packet> queue = new PriorityQueue<>();
        
        String[] types = {"Video", "Voice", "Data", "Data", "Voice", "Video", "Voice", "Voice", "Data", "Video"};
        int[] priorities = {1, 2, 0, 0, 2, 1, 2, 2, 0, 1};

        for (int i = 0; i < types.length; i++) {
            String name = types[i] + " " + (i + 1);
            queue.enqueue(new Packet(name, priorities[i]));
        }
        
        System.out.println("");
        while(queue.getSize() > 0){
            Packet currPacket = queue.dequeue();
            System.out.println(currPacket.type + " (Priority = " + currPacket.priority + ")");
        }
    } 
    
    public static void displayPacket(){
        System.out.println("10 packets arrived");
        System.out.println("Video 1 (Priority = 1)");
        System.out.println("Voice 2 (Priority = 2)");
        System.out.println("Data 3 (Priority = 0)");
        System.out.println("Data 4 (Priority = 0)");
        System.out.println("Voice 5 (Priority = 2)");
        System.out.println("Voice 6 (Priority = 1)");
        System.out.println("VOice 7 (Priority = 2)");
        System.out.println("Voice 8 (Priority = 2)");
        System.out.println("Data 9 (Priority = 0)");
        System.out.println("Video 10 (Priority = 1)");
    }
}
