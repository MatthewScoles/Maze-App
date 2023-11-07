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


    // everything below is copied from MazeSolver (Not sure if we need this in the class)


    public boolean isSolved(){
        boolean solve = false;
         ArrayList<Square> neighbors = maze.getNeighbors(maze.getFinish());
        for(Square s: neighbors){
            if(s.getType()=="3")
                solve = true;
        }
        return solve;
    }

    public String getPath(){
        String path ="";
        if(maze.getFinish().getPrevious()== null)
            return "There is no solution";
        else
            for(Square sq = maze.getFinish(); sq.getPrevious()!= null; sq = sq.getPrevious()){
                path += "["+sq.getRow() + ","+sq.getCol()+"]  ";
            }
        return path;
    }

    public Square step(){
        Square current = next();
        if (current == null)
            return null;
        if(current.getType()=="3")
            return current;
        ArrayList<Square> neighbors = maze.getNeighbors(current);
        for(Square s: neighbors){
            if(s.getPrevious()== null)
                s.setPrevious(current);
                add(s);
        }
        return current;
    }

    public void solve(){
        while(isSolved()||!isEmpty()){
            step();
        }
        System.out.println(getPath());

}
}

