package replitQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_AppendPosSum {

    class Main{
        //create your method below


        public ArrayList<Integer> appendPosSum(ArrayList<Integer> num){
            ArrayList<Integer> newArrayList = new ArrayList<>();
            int sum = 0;
            for (int value: newArrayList){
                if(value>0){
                    newArrayList.add(value);
                    sum = sum + value;
                }

            }
            newArrayList.add(sum);

            return newArrayList;


        }






        // Do not touch below

        public  void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i < size; i++) {
                list.add(in.nextInt());
            }

            System.out.println(appendPosSum(list));

        }



    }
}
