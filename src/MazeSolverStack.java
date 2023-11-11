import java.util.ArrayList;

public class MazeSolverStack extends MazeSolver{
    private MyStack list;

    public MazeSolverStack(Maze maze){
        super(maze);
        
        list = new MyStack<Square> ();
        this.maze = maze;


    }

    public void makeEmpty(){
        list = new MyStack<Square> ();
    }

    public boolean isEmpty(){
        if(list.size()==0){
            return true;
        }
        else{
            return false;
        }
    }

    public void add(Square sq){
        list.push(sq);
    }

    public Square next(){
        return (Square) list.top();
        
    }
}

