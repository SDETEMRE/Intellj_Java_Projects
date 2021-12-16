package Lab_3;

public class Question_12 {
    public static void main(String[] args) {

        String str = "1cat1cadodog";
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).contains("cat")) {
                counter1++;
            }
            if (str.substring(i, i + 3).contains("dog")) {
                counter2++;
        }
        }

        if (counter1 == counter2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}