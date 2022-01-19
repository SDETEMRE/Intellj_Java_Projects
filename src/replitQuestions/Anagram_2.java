package replitQuestions;

import java.util.Scanner;

public class Anagram_2 {

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));


    }

    public static boolean isAnagram(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }
        for (int i = 0; i < word1.length(); i++) {

            char ch = word1.charAt(i);
            if (word2.indexOf(ch) == -1) {
                return false;
            } else {

                word2 = word2.replaceFirst(String.valueOf(ch), " ");

            }


        }
        return true;

    }
}