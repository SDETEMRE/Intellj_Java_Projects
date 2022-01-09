package Reviews.week_5;

public class S04_IndexOfExmples {
    public static void main(String[] args) {

        String message = "Java is Awesome!";

        String word = message.substring(message.indexOf("A"),message.indexOf("!"));
        System.out.println(word);

    }
}
