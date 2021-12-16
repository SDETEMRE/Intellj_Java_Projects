package AssignmentOnArray;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {

        int [] numbers = new int[1001];

        for(int i =1;i<numbers.length;i++){
            numbers[i] = i;
            System.out.print(numbers[i] + " ");
            if(numbers[i]%10==0){
                System.out.println();
       }
     }
   }
}


