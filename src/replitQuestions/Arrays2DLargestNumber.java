package replitQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2DLargestNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
            }//end for cols
        }//end for rows

        int biggest = arr[0][0];
        for (int[] i : arr) {
            for (int max : i) {
                if (max > biggest) {
                    biggest = max;
                }

            }
        }
        for (int i = 0; i <= rows-1; i++) {
            for(int j =0; j <= cols-1; j++){
                arr[i][j] = biggest;
            }

        }

        //FINAL PRINT
        System.out.println(Arrays.deepToString(arr));
    }
}