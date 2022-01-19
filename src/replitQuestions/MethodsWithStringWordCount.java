package replitQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodsWithStringWordCount {
    public static int wordCount(String words) {
        int counter = 0;

        String[] str = words.split(" ");

        counter = str.length;


return counter;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
