package week13;

public class StringIndexProblem {
    public static void main(String[] args) {

        String word = "java";

        try {
            System.out.println(word.charAt(10));
        }catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Type of exception: " + e.getClass().getSimpleName());

        }

        System.out.println(word.toUpperCase());


    }
}
