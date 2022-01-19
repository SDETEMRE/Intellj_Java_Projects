package Lab_3;

public class Question_7 {
    public static void main(String[] args) {
        /*
        Given 2 strings, a and b, return a string of the form short+long+short,
with the shorter string on the outside and the longer string on the
inside.
comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
         */

        System.out.println(comboString("Hello","hi"));
        System.out.println(comboString("hi","Hello"));
        System.out.println(comboString("aaa","b"));

    }
    public static String comboString(String str1, String str2){

        if(str1.length()<str2.length()){
            return str1+str2+str1;
        }else{
            return str2+str1+str2;
        }


    }
}
