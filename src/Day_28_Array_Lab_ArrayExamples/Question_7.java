package Day_28_Array_Lab_ArrayExamples;

import java.util.Arrays;

public class Question_7 {
    public static void main(String[] args) {

        int[] z = {1,2,3};
        int[] v= {};
        System.out.println(Arrays.toString(firstAndLast(z,v)));

        int[] a ={7,4,6,2};
        int[] b ={};
        System.out.println(Arrays.toString(firstAndLast(a,b)));

     }
        public static int[] firstAndLast(int[] x , int[] y){

        y = new int[2];
        y[0]= x[0];
        y[1]= x[x.length-1];
        return y;
        }


}
