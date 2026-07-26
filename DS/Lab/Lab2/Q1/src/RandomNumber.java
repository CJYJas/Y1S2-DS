/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Enter number to be generated N :");
        int n = input.nextInt();
        
        System.out.printf("Generate %d non-duplicate integer within 0 - 100\n", n);
        linkedList(n, rand);
        arrayList(n, rand);
    }
    
    public static void arrayList(int n, Random r){
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        int i = 0;
        while(i < n){
            int num = r.nextInt(101);
            
            for(int a : arrayList){
                if(num == a){
                    continue;
                }
            }
            
            arrayList.add(num);
            i++;
        }
        
        Collections.sort(arrayList);
        System.out.println("Array Implementation");
        System.out.println(arrayList);
    }
    
    public static void linkedList(int n, Random r){
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        int i = 0;
        while(i < n){
            int num = r.nextInt(101);
            
            for(int a : linkedList){
                if(num == a){
                    continue;
                }
            }
            
            linkedList.add(num);
            i++;
        }
        
        Collections.sort(linkedList);
        System.out.println("Linked List Implementation");
        System.out.println(linkedList);
    }
}
