package Day_28_Array_Lab_ArrayExamples;

import java.util.Arrays;

public class Question_9 {
    public static void main(String[] args) {

        int[] x = {4,5,6}; // [0,0,0,0,0,6]

        System.out.println(Arrays.toString(doubleIt(x)));

    }
    public static int[] doubleIt(int[] arr){

        int [] num = new int[arr.length*2];
        num[num.length-1] = arr[arr.length-1];
        return num;

    }
}
