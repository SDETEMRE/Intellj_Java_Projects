package Day_28_Array_Lab_ArrayExamples;

import java.util.Arrays;

public class Question_6 {
    public static void main(String[] args) {

        int[] x = {1,2,3};
        int[] y = {11,5,9};
        System.out.println(Arrays.toString(secondoption(x)));
        System.out.println(Arrays.toString(secondoption(y)));
    }
    public static int[] biggest(int[] arr){

        Arrays.sort(arr);
        for(int i =0; i<arr.length;i++){

            arr[i] = arr[arr.length-1];
        }return arr;
    }
    public static int[] secondoption(int[] arr){

        int max = arr[0];

        for(int i =0;i<arr.length-1;i++){

            if(arr[i+1]>max){
                max =arr[i+1];
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] =max;
        }
        return arr;
    }
}
