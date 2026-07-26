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
        System.out.println("Mesh Topology");
        System.out.println("There are 4 switches in the campus");
        System.out.println("The total number of connections required is " + Topology(4));
        System.out.println("There are 7 switches in the campus");
        System.out.println("The total number of connections required is " + Topology(7));
    }
    
    private static int Topology(int n){
        if(n == 1){
            return 0;
        }
        
        return Topology(n - 1) + (n - 1);
    }
}