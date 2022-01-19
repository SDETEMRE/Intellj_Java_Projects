package replitQuestions;

public class Anagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("army", "mary"));
        System.out.println(isAnagram("aaaaaa", "cab"));
        System.out.println(isAnagram("listen", "silent"));
    }

    public static boolean isAnagram(String one, String two) {

        // need to check the length of the both Strings should be same
        if(one.length() != two.length()) {
            return false;
        }

        //I will remove the letters of one string from two String one by one in a loop
        for(int i=0; i < one.length(); i++) {
            char each = one.charAt(i);
            two = two.replaceFirst(""+each, "");
        }

        //at the end if two String variable is empty, then it means this two Strings are Anagram
        return two.isEmpty();

    }



}
