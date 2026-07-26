/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Packet implements Comparable<Packet>{
    String type;
    int priority;
    
    public Packet(String type, int priority){
        this.type = type;
        this.priority = priority;
    }

    @Override
    public int compareTo(Packet other) {
        return Integer.compare(this.priority, other.priority);
    }
}
