package replitQuestions;

import java.util.Scanner;

public class Alejandro_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        if(a.toLowerCase().contains("alejandro")&&a.toLowerCase().contains("project")){
            System.out.println("read");
        }else{
            System.out.println("don't read");
        }
    }
}