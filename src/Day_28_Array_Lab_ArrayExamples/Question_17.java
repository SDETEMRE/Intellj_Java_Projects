package Day_28_Array_Lab_ArrayExamples;

import java.util.Arrays;

public class Question_17 {
    public static void main(String[] args) {

        int[] x = {10, 3, 5, 6}; //x[0]>x[i+1]--x[0]>x[i+2]--x[0]>x[i+3]
        int[] y = {7, 2, 10, 9};
        int[] z = {2, 10, 7, 2};
        System.out.println(diff2(x));
        System.out.println(diff2(y));
        System.out.println(diff2(z));

    }

    public static int difference(int[] arr) {
        int value = 0;
        Arrays.sort(arr);
        value = arr[arr.length - 1] - arr[0];
        return value;
    }

    public static int diff2(int[] arr2) {

        int max = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
            }
        }
        int min = max;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < min) {
                min = arr2[i];
            }

        }
        return max - min;
    }
}