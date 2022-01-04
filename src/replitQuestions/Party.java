package replitQuestions;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String guestList = "";
        String guest = "";
        String answer;

        do {
            System.out.println("Please enter guest name:");
            guest = input.nextLine();
            guestList = guestList + guest + ", ";
            System.out.println("Do you want to enter new guest name:");
            answer= input.nextLine();
        }
        while (answer.toLowerCase().equals("yes"));

        System.out.println("Guest's list: " + guestList.substring(0,guestList.length()-2));

        }


    }

