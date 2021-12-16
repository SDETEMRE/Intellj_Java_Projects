package Day_23_Random;

import java.util.Random;

public class Task_85 {
    public static void main(String[] args) {

        int computersDice;
        int usersDice;
        int totalComputer=0;
        int totalUser=0;
        Random rn = new Random();
        String winner = "";

        for (int i =0; i<10; i++) {

            computersDice = rn.nextInt(6) + 1;
            usersDice = rn.nextInt(6) + 1;

            System.out.print("Computers result is : " + computersDice + "  ");
            System.out.println("Users result is : " + usersDice);

            if (computersDice > usersDice) {
                totalComputer++;
            }else if (computersDice<usersDice) {
                    totalUser++;
            }

        }

        if(totalComputer<totalUser){
            System.out.println("Winner is: User");
        }else if(totalComputer>totalUser){
            System.out.println("Winner is: Computer");
        }else{
            System.out.println("Duce");
        }
       }


        }



