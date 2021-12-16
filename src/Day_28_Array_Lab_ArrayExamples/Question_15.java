package Day_28_Array_Lab_ArrayExamples;

import java.util.Arrays;

public class Question_15 {
    public static void main(String[] args) {

        int[] x = {9,8,4,7};
        int[] y = {1,2,4,4,5,8,9,22};
        System.out.println(Arrays.toString(swap(x)));
        System.out.println(Arrays.toString(swap2(y)));
    }
    public static int[] swap(int[] arr){ // terse çevirme
        int[] reverse = new int[arr.length];
        int a = 0;
        for(int i=0;i<arr.length;i++){
         reverse[i]=arr[(arr.length-1)-a];
         a++;
        }
        return reverse;
    }
    public static int[] swap2(int[] arr2){//sadece bir ve sonuncu indexler swap
        int temp = 0;
        temp = arr2[0];
        arr2[0] = arr2[arr2.length-1];
        arr2[arr2.length-1]=temp;

        return arr2;
    }

}


