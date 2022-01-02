package replitQuestions;

import java.util.Scanner;

public class Reverse_Letters {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));



    }

    public static String reverseNoSpec(String str) {

        //Input:   str = "a,b$c"--->>>0,2,4
        //Output:  str = "c,b$a"---->>4,2,0

        int r = str.length() - 1, l = 0;
        String reverse = "";

        // Traverse string from both ends until
        // 'l' and 'r'
        while (l < r) {
            // Ignore special characters
            if (!Character.isAlphabetic(str.charAt(l))){
                l++;
            } else if (!Character.isAlphabetic(str.charAt(r))) {
                r--;

                // Both str[l] and str[r] are not spacial
            } else {

         reverse = reverse + str.charAt(r) + str.charAt(l);
                l++;
                r--;
            }
        }
        return reverse;
    }
}


