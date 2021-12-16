package replitQuestions;

import java.util.Scanner;

public class ThreeNums {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1");
        int n1 = s.nextInt();
        System.out.println("2");
        int n2 = s.nextInt();
        System.out.println("3");
        int n3 = s.nextInt();



        if(n1>n2 && n1>n3){
            System.out.println("n1 is bigger");
        }else if (n2>n3){
            System.out.println("n2 is bigger");
        }else{
            System.out.println("n3 is bigger");
        }

    }
}
