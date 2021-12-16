package Day_22_String_Manipulation_part_3;

public class String_StartsEndsWith {
    public static void main(String[] args) {

        String word1 = "eclipse";

        System.out.println(word1.startsWith("e"));
        System.out.println(word1.startsWith("ec"));
        System.out.println(word1.startsWith("xe"));

        System.out.println(word1.endsWith("e"));
        System.out.println(word1.endsWith("ipse"));
        System.out.println(word1.endsWith("xe"));

        String name = "Mr. emre";

        if(name.startsWith("Mr.")){
            System.out.println("married man");
        }else if(name.startsWith("Mrs.")){
            System.out.println("Married woman");
        }else if(name.startsWith("Ms.")){
            System.out.println("Some woman");
        }else if(name.startsWith("Dr.")){
            System.out.println("Doctor man or woman");
        }else{
            System.out.println("Unknown status");
        }






    }
}
