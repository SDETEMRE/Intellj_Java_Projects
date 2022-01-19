package day_19_StringManipulation_part1;

public class Task_79_Vowel {

    public static void main(String[] args) {

        String word = "CybertekSchool";

        for (int i = 0; i < word.length(); i++) {

            char letter = word.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u') {
                System.out.print(letter);
                if (i != word.length() - 2) {
                    System.out.print(",");
                }


            }
        }
    }
}