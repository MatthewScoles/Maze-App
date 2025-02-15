import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Maze {
    private Square [][] maze;
    private Square start;
    private Square finish;
    private int numrows;
    private int numcols;




    public boolean loadMaze(String filename){
        
        
        Scanner scan;
        try {
           
            scan = new Scanner(new File(filename));


        

        numrows = scan.nextInt();
        
        numcols =  scan.nextInt();
        
        scan.nextLine();

        //System.out.println(numrows);

        this.maze = new Square[numrows][numcols];

        for (int row=0; row < numrows; row++) {
            for (int col=0; col < numcols; col++) {
                Square sq = new Square(row,col,scan.next(), null);
                
                if(sq.getType().equals("2"))
                    start = sq;
                if(sq.getType().equals("3"))
                    finish = sq;
            maze[row][col] = sq;
        } scan.nextLine();
        

    }   scan.close();

         return true;
     } 
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            return false;}
        }

    public ArrayList<Square> getNeighbors(Square sq){

        ArrayList<Square> neighbors = new ArrayList<Square>();

        if (sq.getRow() != 0){
            Square North = new Square(sq.getRow()- 1, sq.getCol(), maze[sq.getRow()-1][sq.getCol()].getType(), null);
            neighbors.add(North);
        }

        if(sq.getRow() != maze.length-1){
            Square South = new Square(sq.getRow()+ 1, sq.getCol(), maze[sq.getRow()+1][sq.getCol()].getType(), null);
            neighbors.add(South);
        }
        if(sq.getCol() != maze[1].length-1){
            Square East = new Square(sq.getRow(), sq.getCol() + 1, maze[sq.getRow()][sq.getCol()+1].getType(), null);
            neighbors.add(East);
    }

        if(sq.getCol() != 0){
            Square West = new Square(sq.getRow(), sq.getCol() - 1, maze[sq.getRow()][sq.getCol()-1].getType(), null);
            neighbors.add(West);
        }

        return neighbors;
    }

    public Square getStart(){
        return start;
    }

    public void mazeSetType(String type, int row, int col){
        this.maze[row][col].setType(type);
    }

    public Square getFinish(){
        return finish;
    }

    public void reset(){
        for (int row=0; row < numrows; row++) {
            for (int col=0; col < numcols; col++) {
                Square sq = maze[row][col];
                sq.Reset();
            }
        }
    }
     
    
    public String toString(){

        String Maze = "";
        for (int row=0; row < this.numrows; row++) {
            for (int col=0; col < this.numcols; col++) {
                Maze += this.maze[row][col];
            }

            Maze += "\n";
        }
            return Maze;
    }

}
