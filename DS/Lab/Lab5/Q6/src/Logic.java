/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Logic {
    LinkedStack<Position> stack = new LinkedStack<>();
    char[][] maze;
    
    public Logic(char[][] maze){
        this.maze = maze;
    }
    
    public void findStart(){
        outer:
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[i].length; j++){
                if(maze[i][j] == 'S'){
                    Position currentPosition = new Position(i,j);
                    stack.push(currentPosition);
                    break outer;
                }
            }
        }
    }
    
    public void findPath(){
        findStart();
        
        while(!stack.isEmpty()){
            Position currPosition = stack.peek();
            int currRow = currPosition.row;
            int currCol = currPosition.col;
            
            //check ending
            if(maze[currRow][currCol + 1] == 'F'){
                break;
            }else if(maze[currRow][currCol - 1] == 'F'){
                break;
            }else if(maze[currRow + 1][currCol] == 'F'){
                break;
            }else if(maze[currRow - 1][currCol] == 'F'){
                break;
            }
            
            //check validility
            if(maze[currRow][currCol + 1] == ' '){
                Position validPosition = new Position(currRow, currCol + 1);
                stack.push(validPosition);
                maze[validPosition.row][validPosition.col] = 'x';
            }else if(maze[currRow][currCol - 1] == ' '){
                Position validPosition = new Position(currRow, currCol - 1);
                stack.push(validPosition);
                maze[validPosition.row][validPosition.col] = 'x';
            }else if(maze[currRow + 1][currCol] == ' '){
                Position validPosition = new Position(currRow + 1, currCol);
                stack.push(validPosition);
                maze[validPosition.row][validPosition.col] = 'x';
            }else if(maze[currRow - 1][currCol] == ' '){
                Position validPosition = new Position(currRow - 1, currCol);
                stack.push(validPosition);
                maze[validPosition.row][validPosition.col] = 'x';
            }else{
 
                stack.pop();
            }
        }
        displayResult();
    }
    
    public void displayResult(){
        if(stack.isEmpty()){
            System.out.println("This maze have no solution");
        }else{
            while(!stack.isEmpty()){
                Position validPosition = stack.pop();
                maze[validPosition.row][validPosition.col] = '.';
            }
            
            for (char[] maze1 : maze) {
                for (int j = 0; j < maze1.length; j++) {
                    if(maze1[j] == 'x'){
                        maze1[j] = ' ';
                    }
                    System.out.print(maze1[j]);
                }
                System.out.println("");
            }
        }
    }
}
