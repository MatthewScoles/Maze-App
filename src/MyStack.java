
import java.util.NoSuchElementException;

class Node{
    
    Square data;
    Node next;
     Node(Square content){
        this.data = content;
        this.next = null;
    }
}


public class MyStack<T> implements StackADT

{
    private Node node;

    private int len;

    public MyStack(){
      len = 0;

      node = null;
      
    }

     public void push(Object el){
      Node newNode = new Node();
      newNode.data = el;
      newNode.next = node;
      this.node = newNode;
      len++;



     }

     public Object pop(){
      if (this.isEmpty())
      {
          throw new NoSuchElementException();
      }
      Object element = this.node.data;
      this.node = this.node.next;
      len--;
      return element;
     }

     public Object top(){
        return this.node.data;
     }

     public int size(){
      return len;
     }

      public boolean isEmpty(){
         return this.node==null;
      }

      public void clear(){
        while(!(this.node==null)){
         pop();
        }
      }
}
