package Day_32_ArrayList_Part_2;

import java.util.ArrayList;
import java.util.Random;

public class customMethods {
    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(10);
        numList.add(7);
        numList.add(8);
        numList.add(8);
        numList.add(3);
        numList.add(4);
        numList.add(8);

        printlist(numList);

        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(10.33);
        doubleList.add(1.22);
        doubleList.add(7.34);
        doubleList.add(3.55);
        doubleList.add(4.76);

        double sum = sumList(doubleList);
        System.out.println(Math.round(sum));

        ArrayList<Integer> list = getlist(15);//1,2,3....15
        System.out.println(list.toString());

        ArrayList<Integer> rlist = getRandomList(20);
        System.out.println(rlist.toString());

        ArrayList<String> strnums = new ArrayList<>();
        strnums.add("123");
        strnums.add("33");
        strnums.add("12");

        ArrayList<Integer> converted = convertToIntList(strnums);
        System.out.println(converted);


    }

    public static void printlist(ArrayList<Integer> num){

        for(Integer n : num){
            System.out.print(n+ " ");
        }
    }

    public static double sumList(ArrayList<Double> dlist){
       double sum = 0;
        for(Double d : dlist){
           sum = sum +d;
        }
        return sum;
    }
    public static ArrayList<Integer> getlist(int size){

            ArrayList<Integer> newList = new ArrayList<>();
            for(int i=1;i<=size;i++){
                newList.add(i);
        }

            return newList;

    }
    public static ArrayList<Integer> getRandomList(int num){
        Random r = new Random();
        ArrayList<Integer> rand = new ArrayList<>();
        for(int i =1;i<=num;i++){
            rand.add(r.nextInt(101));
        }
        return rand;
    }
    public static ArrayList<Integer> convertToIntList(ArrayList<String> strList){
        ArrayList<Integer>  newList = new ArrayList<>();

        for(String str : strList){
            newList.add(Integer.parseInt(str));
        }
        return newList;
    }


}
