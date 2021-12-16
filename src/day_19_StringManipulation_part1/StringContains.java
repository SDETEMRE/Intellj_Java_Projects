package day_19_StringManipulation_part1;

public class StringContains {
    public static void main(String[] args) {

        String email = "test@gmail.com";

        System.out.println(email.contains("@"));

        String list ="potatoes,tomatoes,eggs,milk,bread,cereal,meat,apples";

        if(list.contains("apples")){
            System.out.println("Apples are in your list");
        }else{
            System.out.println("Apples are not your on list");
        }




    }
}
