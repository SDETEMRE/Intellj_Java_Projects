package Lab_4_ArraysExamples;

public class Question_3 {
    public static void main(String[] args) {

        int[]x = {1,2,3};
        int[]y = {7,3};
        System.out.println(arrayOfArrays(x,y));

    }

    public static String arrayOfArrays(int[] arr1, int[] arr2) {
        if (!(arr1.length > 1)) {
            return "array 1 is not a valid array";
        }
        if (!(arr2.length > 1)) {
            return "array 2 is not a valid array";
        }
        if (arr1[0] == arr2[0] || arr1[arr1.length - 1] == arr2[arr2.length - 1]) {
                return "true";

            }else{
            return "false";
        }
    }
}