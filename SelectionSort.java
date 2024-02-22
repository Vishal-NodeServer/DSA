public class SelectionSort {
    public static void main(String args[]){

        int[] nums = {6,5,2,1,3,9};
        int size = nums.length;
        int temp;
        int minindex = -1;

        for(int num : nums){        //diplay the array using foreach loop
             System.out.print(num);
        }

    

    for(int i = 0;i<size - 1; i++){
        minindex = i;

        for(int j = 0 + 1; j < size; j++){
            if(nums[minindex] > nums[j]){
               minindex = j; 
            }

            System.out.print( " ");

       temp  = nums[minindex];
       nums[minindex] = nums[i];
       nums[i] =  temp;

        for(int num : nums){        //diplay the array using foreach loop
            System.out.print(num);
       }

        }
    }

}
}