/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Enter N : ");
        int n = input.nextInt();
        
        int[][] list = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                list[i][j] = rand.nextInt(10) + 10;
            }
        }
        
        System.out.println("The matrix are : ");
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(list[i][j] + "  ");
            }
            System.out.println("");
        }
        
        System.out.println("Linear Search");
        System.out.print("Enter a number to search : ");
        int search = input.nextInt();
        
        linearSearch(list, search);
    }
    
    private static void linearSearch(int[][] list, int search){
        int count = 0;
        ArrayList<Position> coordinates = new ArrayList<>();
        boolean found = false;
        
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
                if(list[i][j] == search){
                    found = true;
                    count ++;
                    coordinates.add(new Position(i, j));
                }
            }
        }
        
        if(!found){
            System.out.println(search + " is not found");
        }else{
            System.out.println(search + " is found");
            System.out.println("The number of " + search + " in the matrix is " + count);
            System.out.print("The location of " + search + " are : ");
            for(Position p : coordinates){
                System.out.print("[" + p.row + "," + p.col + "]");
            }
            System.out.println("");
        }
    }
    
    private static class Position{
        int row;
        int col;
        
        Position(int row, int col){
            this.col = col;
            this.row = row;
        }
    }
}
