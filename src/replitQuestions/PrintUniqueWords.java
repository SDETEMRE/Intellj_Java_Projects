package replitQuestions;

import java.util.Scanner;

public class PrintUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }
      printUniqueWords(words);
    }
/*
input:[java, code, python, code, rust, code, rust]

output:
java
python
 */
    public static void printUniqueWords(String[] words) {

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
        }

    }
}