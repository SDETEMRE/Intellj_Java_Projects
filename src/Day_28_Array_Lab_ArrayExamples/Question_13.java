package Day_28_Array_Lab_ArrayExamples;

import java.util.Arrays;

public class Question_13 {
    public static void main(String[] args) {

        int[] x = {1,2};
        int[] y = {3,4};

        int[] a = {5,6};
        int[] b = {3,8};

        int[] z = {1,1};
        int[] m = {1,0};

        biggestSum(x,y);
        biggestSum(a,b);
        biggestSum(z,m);
    }
    public static void biggestSum(int[] arr1, int[] arr2){
        int sum1=0;
        int sum2=0;

        for(int value : arr1){
            sum1=sum1+value;
        }
        for(int value : arr2){
            sum2=sum2+value;
        }
        if(sum1<sum2){
            System.out.println(Arrays.toString(arr2));
        }else if(sum1>sum2){
            System.out.println(Arrays.toString(arr1));
        }else{
            System.out.println("equal");
        }


    }

}
