package Lab_3;

public class Question_11 {
    public static void main(String[] args) {

        String str = "abc hi hello";
        int counter = 0;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {

                counter++;

            }

        }
        System.out.println(counter);
    }
}