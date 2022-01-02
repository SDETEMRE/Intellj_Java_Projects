package replitQuestions;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("what do you want?");

        String item = scan.nextLine();

        String Blanket,Charger,Hat,Headphones,Laptop,Pants,Pillow,Smartphone,Socks,USBcable;

        switch (item){
            case "Blanket":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (100-60) + '$');
                break;
            case "Charger":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100-25) + '$');
                break;
            case "Hat":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100-25) + '$');
                break;
            case "Headphones":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100-30) + '$');
                break;
            case "Laptop":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;
            case "Pants":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100-50) + '$');
                break;
            case "Pillow":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100-40) + '$');
                break;
            case "Smartphone":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;
            case "Socks":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100-5) + '$');
                break;
            case "USBcable":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100-10) + '$');
                break;
            default:
                System.out.println("Invalid item!");



        }



    }


}

