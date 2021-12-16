package day_24_arrays_part1;

public class Array {
    public static void main(String[] args) {

        int[] myList = {10,20,30,40};
        String[] array = {"apple","orange","banana"};
        System.out.println(array[2]);

        System.out.println(myList[0]);
        System.out.println(myList[1]);
        System.out.println(myList[2]);
        System.out.println(myList[3]);

        System.out.println(myList.length);
        System.out.println(array.length);

        for(int i=0; i<myList.length;i++){
            System.out.println(myList[i]);

        }

        int[] scores = {80,90,100,35,60,85,95,4545,41,1};
        int sum=0;
            for(int i=0; i<scores.length;i++){
            sum+= scores[i];

        }

        System.out.println("Avarage is " + sum / scores.length);


    }
}
