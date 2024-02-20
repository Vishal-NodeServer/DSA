import java.util.*;

public class findlargestelement{
public static void main(String args[]){

    int[] arr = {1,88,4,3,7};

    int largestelement = findelement(arr);

    System.out.println("The largest element in the array is : " + largestelement);

}


public static int findelement(int[] array){

    int largest = array[0];

    for(int i = 0;i < array.length;i++){
        if(array[i] > largest){
        largest = array[i];
        }
       
    }
    return largest;

}

}


