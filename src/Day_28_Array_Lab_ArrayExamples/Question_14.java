package Day_28_Array_Lab_ArrayExamples;

import java.util.Arrays;

public class Question_14 {
    public static void main(String[] args) {

        int[] x = {1,2};
        int[] y = {3,4,7,5};
        int[] combined = new int[x.length+y.length];

        for(int i=0;i<x.length;i++){
            combined[i]=x[i];
        }
        int a=0;
        for(int j=x.length;j<combined.length;j++){
            combined[j]=y[a];
            a++;
        }

        System.out.println(Arrays.toString(combined));
    }
}
