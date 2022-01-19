package Lab_3;

public class Question_4 {
    public static void main(String[] args) {
        /*
        Given a string, return the string made of its first two chars, so the String
"Hello" yields "He". If the string is shorter than length 2, return
whatever there is, so "X" yields "X", and the empty string "" yields the
empty string "".
firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
         */
        System.out.println(shortenString("Hello"));
        System.out.println(shortenString("abcdefg"));
        System.out.println(shortenString("ab"));
        System.out.println(shortenString(""));
        System.out.println(shortenString("a"));


    }
    public static String shortenString(String str){

        if(str.length()<2){
            return str;
        }else if (str.isEmpty()){
            return "";
        }else {
            return str.substring(0,2);
        }
    }
}
