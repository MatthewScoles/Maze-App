import java.util.*;

public class MyStack<T> implements StackADT

{
    private ArrayList list;
    T object;

    public MyStack(){
      list = new ArrayList<>();
      
    }

     public void push(Object T){
        list.add(object);
     }

     public T pop() throws NoSuchElementException{
         try{
            return (T) (list.remove(list.size()-1));
            
         }
         catch(NoSuchElementException el){
            System.out.println("This is not an element");
            return null;
         }
     }

     public T top() throws NoSuchElementException{
         try{
            return (T) (list.get(0));
         }
         catch (NoSuchElementException el){
            System.out.println("This is not an element");
            return null;
         }
     }

     public int size(){
      return list.size();
     }

      public boolean isEmpty(){
         if(list.size()==0){
            return true;
         }
         else{
            return false;
         }
      }

      public void clear(){
         for(int i = 0; i<list.size(); i++){
            list.remove(i);
         }
      }

     
}
