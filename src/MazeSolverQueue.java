public class MazeSolverQueue extends MazeSolver {

    private MyQueue<Square> queue;
    public MazeSolverQueue(Maze maze)
    {
        super(maze);
        queue = new MyQueue<Square>();
        this.add(maze.getStart());
    }

    public void makeEmpty(){
        while(!queue.isEmpty()){
            queue.dequeue();
        }
    }

//create an empty worklist

    public boolean isEmpty(){
        return queue.isEmpty();
    }
    //return true if the worklist is empty
    public void add(Square sq){
        queue.enqueue(sq);
    }

//add the given Square to the worklist
    public Square next(){
        return (Square)(queue.dequeue());
    }

    //return the "next" item from the worklist
}
