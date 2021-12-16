package Assignment_StringMethods;

public class Q6 {
    public static void main(String[] args) {

        System.out.println(reverseWord("cat"));
        System.out.println(reverseWord("singularity"));
        System.out.println(reverseWord("apple"));

    }

    public static String reverseWord(String str) {
        String value = "";

        if (str.length() < 5) {
            System.out.println("Too short!");
        } else if (str.length() > 5) {
            System.out.println("Too long!");
        } else {
            for (int i = str.length()-1; i>=0; i--) {

                value = value + str.charAt(i);

            }
        }
        return value;
    }
}