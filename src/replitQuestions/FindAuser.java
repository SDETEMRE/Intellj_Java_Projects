package replitQuestions;

import java.util.Scanner;

public class FindAuser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String name = scan.nextLine();

        if(name.toLowerCase().equals("max payne") ||name.toLowerCase().equals("alan wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }



    }
}
