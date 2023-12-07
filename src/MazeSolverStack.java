import java.util.ArrayList;

public class MazeSolverStack extends MazeSolver{
    private MyStack<Square> list;

    public MazeSolverStack(Maze maze){
        super(maze);
        
        list = new MyStack<Square> ();
        list.push(maze.getStart());

    }

    public void makeEmpty(){
        list = new MyStack<Square> ();
    }

    public boolean isEmpty(){
       return list.isEmpty();
    }

    public void add(Square sq){
        list.push(sq);
    }

    public Square next(){
        return (Square) list.pop();
        
    }
}

