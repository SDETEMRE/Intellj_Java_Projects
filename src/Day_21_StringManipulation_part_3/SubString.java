package Day_21_StringManipulation_part_3;

import java.util.Locale;

public class SubString {
    public static void main(String[] args) {
        String s1 = "JavaScript";

        System.out.println(s1.substring(2));
        System.out.println(s1.substring(s1.length()-4));

        String chars = "{{}}";
        String word ="AUTOMATION";

        String result = chars.substring(0,2)+word+chars.substring(2);
        System.out.println(result);

       String str = " 342 ";
        System.out.println("|"+str.trim()+"|");

    }

}
