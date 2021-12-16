package replitQuestions;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        plus();
    }

    public static void plus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = scan.nextInt();
        System.out.println("enter second number:");
        int num2 = scan.nextInt();
        int sum = num1+num2;
        System.out.println(sum);


    }
}

