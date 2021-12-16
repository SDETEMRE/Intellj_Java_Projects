package replitQuestions;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String firstGuestName=input.nextLine();
        System.out.println("Do you want to enter new guest name:");
        String moreGuests = input.nextLine();
           while (moreGuests == "yes"){
            System.out.println("Please enter guest name:");
            String guest1=input.nextLine();
            System.out.println("Do you want to enter new guest name:");

        }
        System.out.println("Guest's list: " + firstGuestName );

    }
}
