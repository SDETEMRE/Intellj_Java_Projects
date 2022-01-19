package Lab_3;

public class Question_3 {
    public static void main(String[] args) {
        /*
        Create a method return a new string made of 3 copies of the last 2
chars of the original string. The string length will be at least 2.
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
         */

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
