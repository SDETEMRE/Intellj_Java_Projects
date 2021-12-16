package week_6;

import java.util.Arrays;

public class A08_ReverseArray {
    public static void main(String[] args) {

        int[] nums = {5,10,4,100}; //{100,4,10,5}

        // one way is creating a second empty array
        int [] reversedNums = new int[nums.length];

        for(int i = nums.length-1, j = 0; i>=0; i--,j++){
            reversedNums[j] = nums [i];

        }
        System.out.println(Arrays.toString(reversedNums));


        // creating a third variable to hold my array variables(using swap)
        for(int i=0; i<nums.length/2 ;i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(nums));




    }
}
