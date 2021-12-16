package replitQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class switchElements {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
        Arrays.toString(do_switch(arr));
    }


    public static int[] do_switch(int[] i) {

       int Switch;
       Switch = i[0];
       i[0] = i[i.length-1];
       i[i.length-1]=Switch;

       return i;
       }



    }





