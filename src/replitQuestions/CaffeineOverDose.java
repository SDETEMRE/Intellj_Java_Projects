package replitQuestions;

import java.util.Scanner;

public class CaffeineOverDose {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int  numOfMiligrams;
        System.out.println("Enter number of milligrams in drink:");

        numOfMiligrams = input.nextInt();

        int drink= (10000-numOfMiligrams)/1000;

        System.out.println("It would take about " + drink +  " drinks for a lethal overdose.");




    }
}
