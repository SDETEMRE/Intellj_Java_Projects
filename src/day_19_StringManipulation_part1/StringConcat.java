package day_19_StringManipulation_part1;

public class StringConcat {
    public static void main(String[] args) {

        String word = "Java";

        System.out.println(word.concat("+selenium"));
        System.out.println(word.concat(" in eclipse"));
        System.out.println(word);

        word = word.concat("+Eclipse");
        // word = word.concat(123); // this will not work it works for String


        String word2 = "Hi";
        word2 = word2.concat("-Hey").concat("--how are you").concat("-good");
        System.out.println(word2);





    }
}
