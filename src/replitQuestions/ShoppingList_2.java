package replitQuestions;

import java.util.Scanner;

public class ShoppingList_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


        do {

            for (int i = 1; i < 11; i++) {
                System.out.println("Enter Item1 and its price:");
                item = scan.nextLine();
                price = scan.nextDouble();
                shoppingListReport = shoppingListReport + ("Item" + i + ":" + item + "Price:" + price + ",");
                System.out.println("Add one more item?");
                countinue = scan.nextLine();
            }
        }while (countinue.toLowerCase().equals("yes")) ;
        System.out.println(shoppingListReport.substring(0, shoppingListReport.length() - 2));
    }
}
