
import java.util.ArrayList;


public class Unit_Test {

    public static void main(String [] args){

        String filename = "src/maze-1";

        Maze test = new Maze();

        Square sq = new Square(2, 2, "0", null);

        if(test.loadMaze(filename)){

            System.out.println(test.getStart().getRow() + " " + test.getStart().getCol());
            System.out.println(test.getFinish().getRow() + " " + test.getFinish().getCol());


            ArrayList<Square> nums = new ArrayList (test.getNeighbors(sq)); 

            for(Square num: nums){
                System.out.println(num.getRow()+" "+num.getCol());
            }

            

            test.reset();

            System.out.println(test.toString());

        }


        

    }
}
