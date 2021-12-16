package replitQuestions;

import java.util.Scanner;

public class BurgerOrChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("giriniz");
        String in = s.next();

        if (in == "burger" || in == "chicken"){
            System.out.println("10.0");
        }else if(in=="soda"){
            System.out.println("2.0");
        }else if(in=="fries"){
            System.out.println("3.5");
        }





    }
}
