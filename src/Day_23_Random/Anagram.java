package Day_23_Random;

import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("study","dusty"));


    } public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if (str2.indexOf(ch) == -1)
                return false;
            else
                str2 = str2.replaceFirst(String.valueOf(ch), " ");

        }
        return true;

    }

}