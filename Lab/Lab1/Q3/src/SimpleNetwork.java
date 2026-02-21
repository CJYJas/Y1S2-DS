/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;

class SimpleNetwork{
    String name;
    String ipAddress;
    String subnetMask;
    String status;
    
    public SimpleNetwork(String name, String ipAddress, String subnetMask, String status){
        this.name = name;
        this.ipAddress = ipAddress;
        this.subnetMask = subnetMask;
        this.status = status;
    }
    
    public SimpleNetwork(SimpleNetwork other){
        this.name = other.name;
        this.ipAddress = other.ipAddress;
        this.subnetMask = other.subnetMask;
        this.status = other.status;
    }
    
    public boolean hasSameIp(SimpleNetwork other) {
        if (other == null) return false;
        return Objects.equals(this.ipAddress, other.ipAddress);
    }

    // Method to ONLY compare Subnets
    public boolean hasSameSubnet(SimpleNetwork other) {
        if (other == null) return false;
        return Objects.equals(this.subnetMask, other.subnetMask);
    }
    
    @Override
    public String toString(){
        return "Host Name: " + name + " IP: " + ipAddress + " Subnet Mask : " + subnetMask + " Status : " + status; 
    }
}

class Tester{
    public static void main(String[] args) {
        SimpleNetwork h1 = new SimpleNetwork("Host 1", "10.1.1.1", "255.255.255.224", "UP");
        SimpleNetwork h2 = new SimpleNetwork("Host 2", "10.1.1.2", "255.255.255.224", "DOWN");
        SimpleNetwork h3 = new SimpleNetwork("Host 3", "10.1.1.70", "255.255.255.224", "UP");
        SimpleNetwork h4 = new SimpleNetwork("Host 4", "10.1.1.1", "255.255.255.224", "UP");
        ArrayList<SimpleNetwork> list = new ArrayList<>(List.of(h2, h3, h4));
        
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        
        for(SimpleNetwork h : list){
            if(h.status.equals("DOWN")){
                System.out.println("Host 1 cannot ping " + h.name + " because " + h.name + " is down."); 
                continue;
            }
            
            if(h1.hasSameIp(h) && h1.hasSameSubnet(h)){
                System.out.println("Host 1 can ping " + h.name);
            }else{
                System.out.println("Host 1 cannot ping " + h.name + " because " + h.name + " is located in different network.");
            }
        }
    }
}
