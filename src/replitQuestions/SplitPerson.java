package replitQuestions;

import java.util.Scanner;

public class SplitPerson {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {

        String str = info;
        String [] arrOfStr = str.split(",",3);


        System.out.println("person name: " + arrOfStr[0]);
        System.out.println("last name: " + arrOfStr[1]);
        System.out.println("age: " + arrOfStr[2]);









    }
}
