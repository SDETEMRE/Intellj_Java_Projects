package Day_25_arrays_part2;

import java.util.Random;

public class Task_91 {

    public static void main(String[] args) {

        Random rd = new Random();
        int [] numbers = new int [10];

        for(int i=0; i<numbers.length; i++){
            numbers[i]=rd.nextInt(100);
            System.out.println(rd.nextInt(numbers[i]));

        }


    }
}
