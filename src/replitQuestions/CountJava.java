package replitQuestions;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int countOfJava = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {

            lastIndex = word.indexOf("java", lastIndex);

            if (lastIndex != -1) {
                countOfJava++;
                lastIndex += "java".length();
            }
        }
        System.out.println(countOfJava);
    }
}
//        int count = 0;
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i)=='j') {
//                if(word.charAt(i+1)=='a'){
//                    if(word.charAt(i+2)=='v'){
//                        if(word.charAt(i+3)=='a'){
//                            count++;
//                        }
//                    }
//                }
//            }
//
//            }
//
//        System.out.println(count);


