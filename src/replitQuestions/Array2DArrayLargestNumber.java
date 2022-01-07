package replitQuestions;

import java.util.Scanner;

public class Array2DArrayLargestNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows

        int max = arr[0][0];

        for(int[] eachArr : arr){
            for(int eachNum : eachArr){
                if(eachNum>max){
                    max=eachNum;
                }
            }
        }
        System.out.println(max);









    }//end main
}
