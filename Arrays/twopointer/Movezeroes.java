import java.util.*;
public class Movezeroes {

    public void movezeroes(int[]nums){

        int n = nums.length;
        int[] arr = new int[n];
        int start = 0;

        for(int i=0;i<n;i++){

            if(nums[i]!=0){
                arr[start] = nums[i];
                start++;          
            }   
    }
        for(int i=0;i<n;i++){
            nums[i] = arr[i];
        }
    }

    public static void main(String[] args) {

        
        int[]nums = {0,1,0,3,12};
        Movezeroes obj = new Movezeroes();
        obj.movezeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}