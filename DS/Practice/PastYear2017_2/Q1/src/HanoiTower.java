/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;

public class HanoiTower {
    // Declare your towers globally so every function call sees the exact same towers
    private static Stack<String> towerA = new Stack<>();
    private static Stack<String> towerB = new Stack<>();
    private static Stack<String> towerC = new Stack<>();
    private static int count = 0;

    public static void main(String[] args) {
        // Initialize Tower A
        towerA.push("Biggest");
        towerA.push("Medium");
        towerA.push("Smallest");
        
        System.out.println("Initial State:");
        printTowers();
        System.out.println("-------------------------");
        
        // Pass the names/roles of the towers, not the stack objects themselves
        move_disks(3, 'A', 'C', 'B');
    }
    
    private static void move_disks(int numOfDisk, char source, char target, char spare) {
        if (numOfDisk == 0) {
            return;
        }
        
        // Step 1: Move top n-1 disks from source role to spare role
        move_disks(numOfDisk - 1, source, spare, target);
        
        // Step 2: Move the single disk from source to target
        // We look at the characters to decide which global stack to pop and push
        String disk = popFromTower(source);
        pushToTower(target, disk);
        
        count++;
        System.out.println("Step " + count + ": Moved " + disk + " from " + source + " to " + target);
        printTowers();
        System.out.println("-------------------------");
        
        // Step 3: Move the n-1 disks from spare role to target role
        move_disks(numOfDisk - 1, spare, target, source);
    }

    // Helper method to handle popping based on the character name
    private static String popFromTower(char name) {
        if (name == 'A') return towerA.pop();
        if (name == 'B') return towerB.pop();
        return towerC.pop();
    }

    // Helper method to handle pushing based on the character name
    private static void pushToTower(char name, String disk) {
        switch (name) {
            case 'A' -> towerA.push(disk);
            case 'B' -> towerB.push(disk);
            default -> towerC.push(disk);
        }
    }

    // Helper method to print the static state of the world
    private static void printTowers() {
        System.out.println("Tower A: " + towerA);
        System.out.println("Tower B: " + towerB);
        System.out.println("Tower C: " + towerC);
    }
}