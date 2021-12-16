package replitQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class TimesTwo {

    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){

        ArrayList<Integer> number = new ArrayList<Integer>();

        for(int value : number){
         number.add(value*2);

    }
        return number;


}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println();

    }


}