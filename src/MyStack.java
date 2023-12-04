
import java.util.NoSuchElementException;



public class MyStack<T> implements StackADT

{
    private Node first;

    private int len;

    public MyStack(){
      first = null;
      
    }

     public void push(Object el){
      Node<Object> newNode = new Node();
      newNode.data = el;
      newNode.next = first;
      this.first = newNode;
      len++;
     }

     public Object pop(){
      if (this.isEmpty())
      {
          throw new NoSuchElementException();
      }
      Object element = this.first.data;
      this.first = this.first.next;
      len--;
      return element;
     }

     public Object top(){
        return this.first.data;
     }

     public int size(){
      return len;
     }

      public boolean isEmpty(){
         return this.first==null;
      }

      public void clear(){
        while(!(this.first==null)){
         pop();
        }
      }

        static class Node<T>
    {
        public T data;
        public Node next;
    }
}
