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
        char[][] originalMaze = new char[10][20];
        
        char[] mazeElements = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',
                               '#','S','#',' ',' ',' ',' ',' ',' ',' ','#','F',' ',' ',' ','#',' ',' ',' ','#',
                               '#',' ','#','#','#','#','#','#','#',' ','#','#','#','#',' ','#',' ','#',' ','#',
                               '#',' ',' ',' ',' ',' ',' ',' ',' ',' ','#',' ',' ','#',' ','#','#','#',' ','#',
                               '#','#','#','#','#',' ','#','#','#',' ','#',' ',' ',' ',' ',' ',' ',' ',' ','#',
                               '#',' ',' ',' ','#',' ','#',' ',' ',' ','#','#','#','#','#','#','#',' ','#','#',
                               '#',' ',' ',' ','#',' ','#',' ','#','#','#',' ','#',' ',' ',' ','#',' ',' ','#',
                               '#',' ',' ',' ','#',' ','#',' ','#',' ',' ',' ','#',' ','#',' ','#','#',' ','#',
                               '#',' ',' ',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ',' ',' ',' ','#',
                               '#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'};
        
        int index = 0;
        for(int row = 0; row < 10; row++){
            for(int col = 0; col < 20; col++){
                originalMaze[row][col] = mazeElements[index];
                index++;
            }
        }
        
        System.out.println("The original maze is");
        for (char[] originalMaze1 : originalMaze) {
            for (int j = 0; j < originalMaze1.length; j++) {
                System.out.print(originalMaze1[j]);
            }
            System.out.println("");
        }
        
        Logic logic = new Logic(originalMaze);
        System.out.println("The solution is");
        logic.findPath();
    }  
}
