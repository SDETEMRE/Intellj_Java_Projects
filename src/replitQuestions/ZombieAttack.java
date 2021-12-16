package replitQuestions;

import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int i=0;

        while(inhabitants!=0) {

            System.out.println("Day " + i + " [" + inhabitants + "]");

            inhabitants=inhabitants/2;
            i++;

        }

        System.out.println("---- EXTINCT ----");
    }
}
