package AssignmentOnArray;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {

    int[] num = new int[5];
    num[0]=0;
    num[1]=1;
    num[2]=1;

    for(int i=3;i<num.length;i++){

        num[i]=num[i-2]+num[i-1];
    }
        System.out.println(Arrays.toString(num));
    }
  }

