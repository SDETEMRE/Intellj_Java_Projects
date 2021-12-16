package day_20_stringManipulation_part2;

public class String_Replace_2 {
    public static void main(String[] args) {

        String sentence = "Coding is fun, it is my hobby!!";

        String withNoSpace = sentence.replace(" ", "");
        System.out.println(withNoSpace);

        String withComma = sentence.replace(',', '!');
        System.out.println(withComma);

        String mixed = "j$a-v|a";
        mixed = mixed.replace("$", "").replace("-","").replace("|", "");
        System.out.println(mixed);

        String result = "About 8,930,000,000 results (0.68 seconds)";

        result = result.replace("About ", "").replace( " results (0.68 seconds)","");
        System.out.println(result);


    }
}
