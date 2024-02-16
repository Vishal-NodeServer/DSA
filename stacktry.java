import java.util.*;

public class stacktry{

    int i = 0;
    int size = 0;
    int mypeek;
    int[] arr = new int[5];



    public void push(int value){
        if(size == arr.length){
            System.out.println("Stack is full");
        }
        else{
            arr[i++] = value;
            size++;
         
        }

    }

    public void pop(){
        if(size == 0){
            System.out.println("Stack is empty");
        }
        else{
            
         mypeek = arr[--i];
            size--;
           
        }
    }

    public void peek(){
  System.out.println("Recently deleted element " + mypeek);
    }

    public void display(){
        for(int i = 0; i < size;i++){
        System.out.println(arr[i]);
        }
    }




    public static void main(String[] args){
  stacktry obj = new stacktry();

   obj.push(4);
   obj.push(7);
   obj.push(2);
    obj.pop();
     obj.pop();
     obj.peek();
  
   obj.display();

    }
}