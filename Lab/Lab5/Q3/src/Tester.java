
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Tester{
    public static void main(String[] args) {
        System.out.println("Solving the 4 Queens problem");
        logic(4);
    }  
    
    public static void logic(int n){
       LinkedStack<Position> stack = new LinkedStack<>();
       int count = 0;
       int row = 0;
       int[] nextCol = new int[n];
       
       Arrays.fill(nextCol, 0);
       
       while(row >= 0){
            if(row >= n){
               printSolution(stack, n);
               Position last = stack.pop();
               row = last.row;
               nextCol[row] = last.col + 1;
               count ++;
               continue;
           }
            
           boolean placed = false;
           
           for(int col = nextCol[row]; col < n; col++){
               Position newPosition = new Position(row, col);
               
               if(isValid(stack, newPosition)){
                   stack.push(newPosition);
                   row++;
                   placed = true;
                   nextCol[row - 1] = col + 1;
                   break;
               }
           }
           
           if(!placed){
               nextCol[row] = 0;
               row --;
               
               if(row >= 0){
                   Position last = stack.pop();
                   nextCol[row] = last.col + 1;
               }
           }
       }
        System.out.println("The number of the solutions are : " + count);
    }
    
    private static boolean isValid(LinkedStack<Position> stack, Position newPosition){
        LinkedStack<Position> temp = new LinkedStack<>();
        boolean valid = true;
                
        while(!stack.isEmpty()){
            Position q = stack.pop();
            temp.push(q);
            
            if (q.col == newPosition.col) { // same column
                valid = false;
                break;
            }

            if (Math.abs(q.row - newPosition.row) == Math.abs(q.col - newPosition.col)) { // same diagonal
                valid = false;
                break;
            }
        }

        // restore original stack
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return valid;
    }
    
    private static void printSolution(LinkedStack<Position> stack, int n){
        char[][] board = new char[n][n];
        
        for(char[] row : board){
            Arrays.fill(row, '*');
        }
   
        LinkedStack<Position> temp = new LinkedStack<>();
        while(!stack.isEmpty()){
            Position q = stack.pop();
            board[q.row][q.col] = 'Q';
            temp.push(q);
        }

        // restore original stack
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        
        for(char[] row : board){
            for(char c : row){
                System.out.print(c + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
