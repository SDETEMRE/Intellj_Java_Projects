package Day_28_Array_Lab_ArrayExamples;

public class Question_8 {
    public static void main(String[] args) {

        int[] x = {2, 5};
        int[] y = {4, 3};
        int[] z = {4, 5};

        System.out.println(containsOrNot(x));
        System.out.println(containsOrNot(y));
        System.out.println(containsOrNot(z));

    }

    public static boolean containsOrNot(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2 || arr[i] == 3) {
                return true;
            }

        }
        return false;
    }
}