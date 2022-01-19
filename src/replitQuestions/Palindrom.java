package replitQuestions;

public class Palindrom {
    public static void main(String[] args) {

        ispalindrom("merhaba genclik");

    }

    public static void ispalindrom(String madam) {
        String val="";
        for (int i = madam.length()-1; i >= 0; i--) {

            val += madam.charAt(i);


        }
        System.out.println(val);
    }
}
