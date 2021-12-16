package replitQuestions;
import java.util.Scanner;

public class plus_minus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = inp.nextInt();
        }

        plus_minus(arr);
    }

    public static void plus_minus(int[] num) {

        int pos = 0;
        int neg = 0;
        int zer = 0;

        for (int i = 0; i < num.length; i++) {

            if (num[i] > 0) {
                pos++;
            } else if (num[i] == 0) {
                zer++;
            } else if (num[i] < 0) {
                neg++;
            }


        }
        System.out.println("positives:" + pos + "negatives:" + neg + "zeros:" + zer);

    }
}