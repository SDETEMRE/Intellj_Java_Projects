package replitQuestions;

import java.util.Arrays;
import java.util.Scanner;
class Mainx {

    public static void add_to_r(int[] r,int n) {
        //create new array with one more position.
        int[] tmp = new int[r.length+1];

        for(int i=0 ; i <r.length; i++)
        {
            tmp[i]=r[i];
        }
        tmp[r.length]=n;
        r=tmp;

        System.out.println(Arrays.toString(r));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i <=size-1; i++){
            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);

    }
}
