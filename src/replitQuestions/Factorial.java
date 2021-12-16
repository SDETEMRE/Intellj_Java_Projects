package replitQuestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("gir");
        int z=1;
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            z = z*i;
        }

        System.out.println(z);
    }
}
