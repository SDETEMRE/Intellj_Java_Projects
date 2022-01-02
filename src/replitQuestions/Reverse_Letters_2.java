package replitQuestions;

import java.util.Scanner;

public class Reverse_Letters_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      //  System.out.println(reverseNoSpec(in.next()));
        reverseNoSpec("a,b$c");
        reverseNoSpec("Ab,c,de!$");



    }

    public static void reverseNoSpec(String str) {
        int len = str.length();

        char[] arr = new char[len];
        for(int i=0; i<len; i++){
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)){
                arr[len-1-i] = ch;
            }else{
                arr[i] = ch;
            }
        }
        System.out.println(new String(arr));
        

    }

}

