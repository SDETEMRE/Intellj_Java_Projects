package Lab_4_ArraysExamples;

public class Question_2 {
    public static void main(String[] args) {

        int[] x = {1, 2, 3};
        int[] y = {1, 2, 3, 1};
        int[] z = {1, 2, 1};
        int[] k = {1};

        System.out.println(lengthLast(x));
        System.out.println(lengthLast(y));
        System.out.println(lengthLast(z));
        System.out.println(lengthLast(k));

    }

    public static String lengthLast(int[] arr) {

        if (!(arr.length > 1)) {
            return "not a valid array";
        }

        if (arr[0] == arr[arr.length - 1]) {
                return "true";
            } else {
                return "false";
            }
        }

    }

