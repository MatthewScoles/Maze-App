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
         if(!isEmpty()){
         try{
            return (T) (list.remove(list.size()-1));
            
         }
         catch(NoSuchElementException el){
            System.out.println("This is not an element");
            return null;
         }}
         else 
            return null;
     }

     public Square top() throws NoSuchElementException{
        if(!isEmpty()){
         try{
            return (Square) (list.get(0));
         }
         catch (NoSuchElementException el){
            System.out.println("This is not an element");
            return null;
         }}
      else
         return null;
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
