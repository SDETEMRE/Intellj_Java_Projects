package Lab_3;

public class Question_3 {
    public static void main(String[] args) {

        System.out.println(newString("Hello"));
        System.out.println(newString("I am Java"));
        System.out.println(newString("a"));


    } public static String newString(String str) {
        if (str.length() >= 2) {
            String newString = str.substring(str.length() - 2);
            return newString+newString+newString;
        }else{
            return "Invalid String";
        }
    }

}
