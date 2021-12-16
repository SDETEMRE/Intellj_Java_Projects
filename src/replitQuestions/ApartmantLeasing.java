package replitQuestions;
import java.util.*;
public class ApartmantLeasing {

    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;

        switch (numberOfBedrooms){
            case 1:
                System.out.println("One Bedroom Selected\n" + "Starting Price: 1100");
                break;
            case 3:
                System.out.println("Three Bedroom Selected\n" + "Starting Price: 2550");
                break;
            case 5:
                System.out.println("No such Bedrooms available");
                break;
            default:
                System.out.println(" ");
        }
      }
    }