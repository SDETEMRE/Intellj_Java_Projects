package Lab_3;

public class Question_5 {
    public static void main(String[] args) {
        /*
        Given a string of even length, return the first half. So the string
"WooHoo" yields "Woo".
firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"Given a string of even length, return the first half. So the string
"WooHoo" yields "Woo".
firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
         */

        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
        System.out.println(firstHalf("avf"));

    }
    public static String firstHalf(String str){
        if(str.length()%2!=0){
            return "Not a even String";
        }else{
            return str.substring(0,str.length()/2);

        }

    }
}
