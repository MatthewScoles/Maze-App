import java.util.*;
import java.util.NoSuchElementException;

import org.w3c.dom.Node;


public class MyStack<T> implements StackADT

{
    private Node one;

    private int len;

    public MyStack(){
      len = 0;

      one = null;
      
    }

     public void push(Object T){
        Node node = new Node();

        node.data = T;
        node.next = one;

        this.one = node;

        len++;

     }

     public Object pop(){
         if (this.isEmpty())
        {
            throw new NoSuchElementException();
        }
        Object T = this.one.data;
        this.one = this.one.next;
        len--;
        return T;
     }

     public Object top(){
        return this.one.data;
     }

     public int size(){
      return len;
     }

      public boolean isEmpty(){
         return this.one == null;
      }

      public void clear(){
         while(!((this.one)==null)){
            pop();
         }
      }

      
    

     
}
