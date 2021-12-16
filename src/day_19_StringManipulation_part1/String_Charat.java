package day_19_StringManipulation_part1;

public class String_Charat {
    public static void main(String[] args) {
        String word = "Computer";

        System.out.println(word.length());

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(5));
        System.out.println(word.charAt(6));
        System.out.println(word.charAt(7));
       // System.out.println(word.charAt(8));

        String word2 = "Apple";
        if(word2.charAt(0)=='A'){
            System.out.println("A is first character");
        }else{
            System.out.println("A is not a first character");
        }


        String word3 = "civic";

        if(word3.charAt(0)==word3.charAt(4)){
            System.out.println("first and last character are the same");
        }else{
            System.out.println("first and last characters are not the same");
        }

        String word4 = "Java";
        char lastChar = word4.charAt(word4.length()-1);

        System.out.println("Last char of " + word4 + " is " + lastChar);







    }
}



