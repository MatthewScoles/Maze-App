
public class QueueTest {
     public static void main(String [] args)
        {
            Square sq = new Square(1, 1, "L", null);
            MyQueue tester = new MyQueue();
            tester.size();
            tester.enqueue(1);
            tester.enqueue(3);
            tester.enqueue(2);
            tester.enqueue(4);
            System.out.println(tester.dequeue());
            tester.dequeue();
            tester.front();
            tester.size();

        }
}
