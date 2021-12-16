package Day_29_Lab4;

import java.util.Arrays;

public class Question_23 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(fizzy(10)));


    }
    public static int[] fizzy(int number){
        int [] num = new int [number];

        for(int i = 0; i<num.length;i++){
            num[i]=i;

        }
        return num;

    }
}
