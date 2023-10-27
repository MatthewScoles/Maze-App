import java.io.File;
import java.util.Scanner;

public class Maze {
    private Square [][] maze;
   
    




    public boolean loadMaze(String filename){
        Scanner scan = new Scanner(System.in);
        int numrows = Integer.parseInt(scan.nextLine());
        int numcols = numrows%10;

        System.out.println(numrows);
        for (int row=0; row < numrows; row++) {
            for (int col=0; col < numcols; col++) {
            maze[row][col] = null;
        }

       
    }

         return true;
    }

    
     
    


}
