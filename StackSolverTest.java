public class StackSolverTest {
    

    public static void main(String []args){
         MyStack <Square> STACK = new MyStack <Square>();

        //Square square = new Square(1, 2, "hello", null);

        System.out.println(STACK.isEmpty());
        //return true

        STACK.push("hello"); //not sure why push works here and not add from the stacksolverclass

        STACK.push("hi");

        STACK.push("yay");

        STACK.push("hi again");


        System.out.println(STACK.size());
        //print out 4

       // System.out.println(STACK.top());
        // hi again

        System.out.println(STACK.pop());
        //hi again

        System.out.println(STACK.size());
        //3

        System.out.println(STACK.top());
        //yay

        System.out.println(STACK.isEmpty());
        //false








    }
    
}
