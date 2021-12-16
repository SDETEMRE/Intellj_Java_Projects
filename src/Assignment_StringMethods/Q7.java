package Assignment_StringMethods;

public class Q7 {
    public static void main(String[] args) {
        String word = "java";
        if (word.length() % 2 == 0) {
            String half = word.substring(0, word.length() / 2);
            System.out.println(half + half);
        } else {
            System.out.println("invalid");
        }
    }
}
