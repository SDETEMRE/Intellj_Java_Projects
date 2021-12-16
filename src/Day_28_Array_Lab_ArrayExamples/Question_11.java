package Day_28_Array_Lab_ArrayExamples;

import java.util.Arrays;

public class Question_11 {
    public static void main(String[] args) {

        int[] x = {1,2,3};
        int[] y = {2,3,5};
        int[] a = {1,2,1};
        int[] b = {11,2,13,3,2};
        System.out.println(Arrays.toString(twoAfterThree(x)));
        System.out.println(Arrays.toString(twoAfterThree(y)));
        System.out.println(Arrays.toString(twoAfterThree(a)));
        System.out.println(Arrays.toString(twoAfterThree(b)));

    }
    public static int[] twoAfterThree(int[] arr){

        for(int i=0; i<arr.length-1;i++){
            if(arr[i]==2 && arr[i+1]==3){
                arr[i+1]=0;
            }
        }
        return arr;
    }
}
