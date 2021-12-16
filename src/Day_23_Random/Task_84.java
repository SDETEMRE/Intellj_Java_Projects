package Day_23_Random;

import java.util.Random;

public class Task_84 {
    public static void main(String[] args) {

        Random rn = new Random();
        for(int i=0; i<10; i++){

            if(rn.nextInt(2)==0){
                System.out.println("Tails");

            }else{
                System.out.println("Heads");
            }
        }


    }
}
