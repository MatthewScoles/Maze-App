import java.util.ArrayList;

public abstract class MazeSolver{

    static Maze maze;

    abstract void makeEmpty();
//create an empty worklist

    abstract boolean isEmpty();
    //return true if the worklist is empty
    abstract void add(Square sq);

//add the given Square to the worklist
    abstract Square next();

    //return the "next" item from the worklist
    MazeSolver(Maze maze){
        this.maze = maze;
    }
    //Create a (non-abstract) constructor that takes a Maze as a parameter and stores it in a variable that the children classes can access.
    boolean isSolved(){
        boolean solve = false;
         ArrayList<Square> neighbors = maze.getNeighbors(maze.getFinish());
        for(Square s: neighbors){
            if(s.getType()=="3")
                solve = true;
        }
        return solve;
    }
    /*A non-abstract method that the application program can use to see if this algorithm has solved this maze. That is, has it determined the path 
    to the exit or if there is no path.
    This method will return true if either:
    A path from the start to the exit has been found; OR
    You determine there is no such path (worklist is now empty)*/
    String getPath(){
        String path ="";
        if(maze.getFinish().getPrevious()== null)
            return "There is no solution";
        else
            for(Square sq = maze.getFinish(); sq.getPrevious()!= null; sq = sq.getPrevious()){
                path += "["+sq.getRow() + ","+sq.getCol()+"]  ";
            }
        return path;
    }
    /*Returns either a string of the solution path as a list of coordinates [i,j] from the start to the exit or a message indicating no such path exists
    If the maze isn't solved, you should probably return a message indicating such.*/
    Square step(){
        Square current = next();
        System.out.println(current.getRow() + " "+current.getCol());
        if(current == null)
            return null;

        current.setType("o");

        if(current.getType()=="3")
            return current;
        ArrayList<Square> neighbors = maze.getNeighbors(current);
        for(Square s: neighbors){
            System.out.println(s.getType());
           if ((s.getType() == "O" || s.getType() == "3")) //&& s.getPrevious() == null)
            {
                s.setPrevious(current);
                add(s);
                System.out.println("hi");
            }
        }
                
        
        return current;
    }
    /*perform one iteration of the algorithm above (i.e., steps 1 through 5) and return the Square that was just explored 
    (and null if no such Square exists). Note that this is not an abstract method, that is, you should implement this method in the MazeSolver 
    class by calling the abstract methods listed above.
    In order to keep track of which squares have previously been added to the worklist, you will "mark" each square that you place in the worklist. 
    Then, before you add a square to the worklist, you should first check that it is not marked (and if it is, refrain from adding it).
    Here is the suggestion for marking a Square: have each Square keep track of which Square added it to the worklist 
    (i.e., "Which Square was being explored when this Square was added to the worklist?"). 
    That is, add a new class member Square previous to the Square class, which will represent the Square previous to the current one; 
    initialize this variable to null in the constructor/reset method. Then, when a Square is being added to the list for the first time, 
    you will set the previous variable to point to the current Square (the Square that is being explored). 
    If the previous variable is already non-null, then this Square has already been placed on the list, and you should not do so again.
    You may also want to add in additional methods to your Square class to help you with this.*/
    void solve(){
        while(isSolved()||!isEmpty()){
            step();
        }
        System.out.println(getPath());
    }
    //repeatedly call step() until you get to the exit square or the worklist is empty.
 }