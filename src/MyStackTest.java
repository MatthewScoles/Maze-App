public class MyStackTest {
    public static void main(String [] args){
        MyStack stack = new MyStack();
        Square square = new Square(1, 2, "one", square2);
        Square square2 = new Square(2, 3, "one", square);

        stack.push(square);
        stack.push(square2);
        stack.top();
        stack.size();
        stack.isEmpty();
        stack.pop();
        stack.pop();
        stack.isEmpty();
        stack.top();
        stack.pop();

        

        

    }

    }

    


